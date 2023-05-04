package Explorers;

import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit (Earth earth);

    void visit (Jupiter jupiter);

    void visit (Neptune neptune);

    void visit (Uranus uranus);

    void visit (Venus venus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}