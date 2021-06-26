public class Player {

  private String playerName;
  private int playerScore;

  public Player(String name) {
    playerName = name;
  }

  /**
   * This set method sets the name of the player.
   *
   *  @param
   */
  public void setName(String name) {
    this.playerName = name;
  }

  /**
   * This get method returns the String value of player name.
   *
   *  @return PlayerName, a String value.
   */
  public String getName() {
    return playerName;
  }
  /**
   * This set method sets the score of the player.
   *
   *  @param
   */
  public void setScore(int score) {
    this.playerScore = score;
  }

  public int getScore() {
    return playerScore;
  }


}
