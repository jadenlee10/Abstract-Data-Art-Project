import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
   DataScene scene = new DataScene();

    scene.drawScene();
    Theater.playScenes(scene);
    
    
    
  }
}