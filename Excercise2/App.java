import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet uranus = new Uranus();
        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet neptune = new Neptune();
        

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer irish = new AndriodExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        venus.accept(astronaut);
        uranus.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        neptune.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        venus.accept(rover);
        uranus.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        neptune.accept(rover);

        mars.accept(irish);
        saturn.accept(irish);
        mercury.accept(irish);
        venus.accept(irish);
        uranus.accept(irish);
        earth.accept(irish);
        jupiter.accept(irish);
        neptune.accept(irish);
    }
}
