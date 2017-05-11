package rawideas.gaming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamingController {

	@Autowired
	GamingService gamingService;

	private static int winningPoint = 21;
	
	/**
	 * @return This method will arrange the details that are respective to a match and display the output in a json format.
	 */
	@RequestMapping(value = "/points", method = RequestMethod.GET,headers = "Accept=application/json")
	public MatchOutputVO findAll(){
		int player1count = 0;
		int player2count = 0;
		boolean isMatchDetail = true;
		
		MatchOutputVO matchOutputVO = new MatchOutputVO();
		
		
		ArrayList<GameOutputVO> gameScores = new ArrayList<GameOutputVO>();
		ArrayList<PlayersVO> playersDetails = new ArrayList<PlayersVO>();
		PlayersVO playersVO = new PlayersVO();
		
		
		List<MatchResultVO> matchResultVOs = gamingService.findAll();
		for(MatchResultVO matchResultVO : matchResultVOs){
			if(matchResultVO.getGameWinner().equals(matchResultVO.getPlayers1Name())){
				player1count = player1count+1;
			}if(matchResultVO.getGameWinner().equals(matchResultVO.getPlayers2Name())){
				player2count = player2count+1;
			}
			if(isMatchDetail){
			matchOutputVO.setMatchid(matchResultVO.getMatchid());
			playersVO.setPlayers1(matchResultVO.getPlayers1Name());
			playersVO.setPlayers2(matchResultVO.getPlayers2Name());
			playersDetails.add(playersVO);
			
			isMatchDetail = false;
			}
			
			GameOutputVO gameOutputVO = new GameOutputVO();
			HashMap<String,Integer> gameScoresHM = new HashMap<String,Integer>();
			gameOutputVO.setGameID(matchResultVO.getGameID());
			gameOutputVO.setGameWinner(matchResultVO.getGameWinner());			
			gameScoresHM.put(matchResultVO.getPlayers1Name(), matchResultVO.getPlayer1Score());
			gameScoresHM.put(matchResultVO.getPlayers2Name(), matchResultVO.getPlayer2Score());
			gameOutputVO.setGameScores(gameScoresHM);
			gameScores.add(gameOutputVO);
			
		}
		
		if(player1count > player2count){
			matchOutputVO.setMatchWinner(playersVO.getPlayers1());
		}else{
			matchOutputVO.setMatchWinner(playersVO.getPlayers2());
		}
		matchOutputVO.setGameScores(gameScores);
		matchOutputVO.setPlayers(playersDetails);
		
		return matchOutputVO;		
	}
	/**
	 * @return This method will take input from the Json and calculate the game points, winner and insert in DB
	 */
	@RequestMapping(value = "/points", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertPoints(@RequestBody MatchResultVO ScoresVO){	
		String player1 = null;
		String player2 = null;
		int player1Point = 0;
		int player2Point =0;
		int gameCount =0;
		int matchId = 1;		
	        for (MatchResultVO scoresVO: ScoresVO.getScores()){
	        	if(null != player2 && player1.equals(player2))
	        		player1Point = player1Point+1;
	        	else if(null != player1 && !player1.equals(scoresVO.getScorer())){
	        		player2 = scoresVO.getScorer();
	        		player2Point = player2Point+1;
	        	}else{
	        		player1 = scoresVO.getScorer();
	        		player1Point = player1Point+1;
	        	}
	        	if(player1Point == winningPoint || player2Point == winningPoint ){
	        		
	        		gameCount = gameCount+1;
	        		scoresVO.setGameID(gameCount);
	        		scoresVO.setMatchid(matchId);	        		
	        		if(player1Point>player2Point){	        			        			
	        			scoresVO.setGameWinner(player1);
	        		}else{	        			
	        			scoresVO.setGameWinner(player2);
	        		}
	        		scoresVO.setPlayer1Score(player1Point);
        			scoresVO.setPlayers1Name(player1);
        			scoresVO.setPlayer2Score(player2Point);
        			scoresVO.setPlayers2Name(player2);
	        		 gamingService.SaveGamePoints(scoresVO);
	        		 System.out.println("player1point "+player1Point+" player2point "+player2Point);
	        		 player1Point =0;
	        		 player2Point =0;
	        		
	        	}
	        	
	        }
	        
	       
	}
	
	
}
