public class Player {

  private String name;
  private int corrects; //how many you answered correctly
  private int rounds; //how many questions you have answers

  public Player(String name) {
    this.name = name;
    this.corrects = 0;
    this.rounds = 0;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public int getCorrects() {
    return corrects;
  }

  public int getRounds() {
    return rounds;
  }

  public void oneMoreRound() {
    this.rounds++;
  }

  public void oneMoreCorrect() {
    corrects++;
  }
}
