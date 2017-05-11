package rawideas.gaming;

import java.util.HashMap;

public class GameOutputVO {
	private int gameID;
	private String gameWinner;
	private HashMap<String,Integer> gameScores = new HashMap<String,Integer>();
	
	
	
	
	/**
	 * 
	 */
	public GameOutputVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param gameID
	 * @param players1Name
	 * @param player1Score
	 * @param players2Name
	 * @param player2Score
	 * @param gameWinner
	 */
	public GameOutputVO(int gameID, String players1Name, Integer player1Score, String players2Name,
			Integer player2Score, String gameWinner) {
		super();
		this.gameID = gameID;
		
		this.gameWinner = gameWinner;
	}
	
	
	
	/**
	 * @return the gameScores
	 */
	public HashMap<String, Integer> getGameScores() {
		return gameScores;
	}
	/**
	 * @param gameScores the gameScores to set
	 */
	public void setGameScores(HashMap<String, Integer> gameScores) {
		this.gameScores = gameScores;
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
	
	

}
