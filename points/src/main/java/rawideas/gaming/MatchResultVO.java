package rawideas.gaming;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class MatchResultVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Transient
	private String scorer;
	private int matchid;
	private int gameID;
	private String players1Name;
	private Integer player1Score;
	private String players2Name;
	private Integer player2Score;
	private String gameWinner;
	private ArrayList<MatchResultVO> scores;
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public MatchResultVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	/**
	 * @param id
	 * @param matchid
	 * @param gameID
	 * @param players1Name
	 * @param player1Score
	 * @param players2Name
	 * @param player2Score
	 * @param gameWinner
	 * @param scores
	 */
	public MatchResultVO(int id,String scorer, int matchid, int gameID, String players1Name, Integer player1Score,
			String players2Name, Integer player2Score, String gameWinner, ArrayList<MatchResultVO> scores,MatchOutputVO matchOutputVO) {
		super();
		this.id = id;
		this.matchid = matchid;
		this.gameID = gameID;
		this.players1Name = players1Name;
		this.player1Score = player1Score;
		this.players2Name = players2Name;
		this.player2Score = player2Score;
		this.gameWinner = gameWinner;
		this.scores = scores;
		this.scorer = scorer;
		
	}



	/**
	 * @return the scorer
	 */
	@Transient
	public String getScorer() {
		return scorer;
	}




	/**
	 * @param scorer the scorer to set
	 */
	public void setScorer(String scorer) {
		this.scorer = scorer;
	}




	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the gameID
	 */
	public int getGameID() {
		return gameID;
	}
	/**
	 * @param gameID the gameID to set
	 */
	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
	/**
	 * @return the players1Name
	 */
	public String getPlayers1Name() {
		return players1Name;
	}
	/**
	 * @param players1Name the players1Name to set
	 */
	public void setPlayers1Name(String players1Name) {
		this.players1Name = players1Name;
	}
	/**
	 * @return the player1Score
	 */
	public Integer getPlayer1Score() {
		return player1Score;
	}
	/**
	 * @param player1Score the player1Score to set
	 */
	public void setPlayer1Score(Integer player1Score) {
		this.player1Score = player1Score;
	}
	/**
	 * @return the players2Name
	 */
	public String getPlayers2Name() {
		return players2Name;
	}
	/**
	 * @param players2Name the players2Name to set
	 */
	public void setPlayers2Name(String players2Name) {
		this.players2Name = players2Name;
	}
	/**
	 * @return the player2Score
	 */
	public Integer getPlayer2Score() {
		return player2Score;
	}
	/**
	 * @param player2Score the player2Score to set
	 */
	public void setPlayer2Score(Integer player2Score) {
		this.player2Score = player2Score;
	}
	/**
	 * @return the gameWinner
	 */
	public String getGameWinner() {
		return gameWinner;
	}
	/**
	 * @param gameWinner the gameWinner to set
	 */
	public void setGameWinner(String gameWinner) {
		this.gameWinner = gameWinner;
	}
	/**
	 * @return the scores
	 */
	public ArrayList<MatchResultVO> getScores() {
		return scores;
	}
	/**
	 * @param scores the scores to set
	 */
	public void setScores(ArrayList<MatchResultVO> scores) {
		this.scores = scores;
	}
	
	
	
	

}
