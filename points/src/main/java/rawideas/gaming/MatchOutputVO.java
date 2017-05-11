package rawideas.gaming;

import java.util.ArrayList;

public class MatchOutputVO {
	
	private int matchid;
	private ArrayList<PlayersVO> players;
	private String matchWinner;	
	private ArrayList<GameOutputVO> gameScores;
	

	/**
	 * 
	 */
	public MatchOutputVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param matchid
	 * @param matchWinner
	 * @param players1Name
	 * @param players2Name
	 * @param scores
	 */
	public MatchOutputVO(int matchid, String matchWinner, String players1Name, String players2Name,
			ArrayList<GameOutputVO> scores,ArrayList<PlayersVO> players) {
		super();
		this.matchid = matchid;
		this.matchWinner = matchWinner;		
		this.gameScores = scores;
		this.players = players;
	}

	

	
	/**
	 * @return the gameScores
	 */
	public ArrayList<GameOutputVO> getGameScores() {
		return gameScores;
	}

	/**
	 * @param gameScores the gameScores to set
	 */
	public void setGameScores(ArrayList<GameOutputVO> gameScores) {
		this.gameScores = gameScores;
	}

	/**
	 * @return the matchid
	 */
	public int getMatchid() {
		return matchid;
	}

	/**
	 * @param matchid the matchid to set
	 */
	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	/**
	 * @return the matchWinner
	 */
	public String getMatchWinner() {
		return matchWinner;
	}

	/**
	 * @param matchWinner the matchWinner to set
	 */
	public void setMatchWinner(String matchWinner) {
		this.matchWinner = matchWinner;
	}

	/**
	 * @return the players
	 */
	public ArrayList<PlayersVO> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<PlayersVO> players) {
		this.players = players;
	}

	

}
