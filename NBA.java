public class NBA {

  /**
   * These are the instance variables used in 
   * this program
   */
  private String players;
  private String teams;
  private String position;
  private double points;

  /**
   * Constructor that sets the initial values of 
   * the instance variables
   */
  public NBA(String players, String teams, String position, double points) {
    this.players = players;
    this.teams = teams;
    this.position = position;
    this.points = points;
  }

  /**
   * These are the getter methods that
   * return the values of the instance variables.
   */
  public String getPlayers (){
    return players;
  }
  public String getTeams (){
    return teams;
  }
  public String getPosition (){
    return position;
  }
  public double getPoints (){
    return points;
  }
}