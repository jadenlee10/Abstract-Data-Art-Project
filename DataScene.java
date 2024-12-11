import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {
/**
 Initializes the nba array by calling createUser. 
 This ensures that the data is loaded and ready to be used by other methods
*/
  private NBA[] nba;

  /** Constructor */
  public DataScene(){
    nba = createUser();
  }
/**
 * This method reads player data from multiple text files and uses 
 * it to create an array of NBA objects.
 */
  public NBA[] createUser() {
    String[] players = FileReader.toStringArray("players.txt");
    String[] teams = FileReader.toStringArray("teams.txt");
    String[] position = FileReader.toStringArray("position.txt");
    double[] points = FileReader.toDoubleArray("points.txt");
    
    NBA[] tempUser = new NBA[players.length];
    for (int i = 0; i < tempUser.length; i++){
      tempUser[i] = new NBA(players[i], teams[i], position[i], points[i]);
    }
    return tempUser;
  }

  /**
   * This method prompts the user for input, clears the scene, and 
   * dynamically updates the theater display based on the team.
   */
  public void drawScene() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the team abbreviation: ");
        String userInput = scanner.nextLine();
        
    clear ("green");
        if (isEasternConference(userInput)) {
          drawImage("eastern-conference.jpg", 70, 100, 250);
          drawText(userInput + " is in the Eastern Conference", 50, 300);
        } else {
          drawImage("western-conference.jpg", 70, 100, 250);
          drawText(userInput + " is in the Western Conference", 50, 300);
        }
    }

  /**
   * This method efficiently determines if a team belongs to the 
   * Eastern Conference by iterating over a predefined list of eastern teams.
   */
  private boolean isEasternConference(String team) {
   String[] easternTeams = { "CLE", "BOS", "ORL", "NYK", "MIA", "MIL", "ATL", "BRK", "IND" };
     for (String easternTeam : easternTeams) {
      if (easternTeam.equals(team)) {
        return true;
     }
  }
        return false;
    }
  
    

  /** Other Methods */
  
}