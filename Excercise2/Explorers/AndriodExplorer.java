package Explorers;
import Planets.*;

public class AndriodExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("EYYYY nasa Mercury Drug Store ka na");
    }
    @Override
    public void visit(Mars mars) {
        System.out.println("Hi mars");
    }
    @Override
    public void visit(Saturn saturn) {
        System.out.println("Saturn issyorturn");
    }
    @Override
    public void visit(Earth earth) {
        System.out.println("dami dami mong bibisitahin dito pa");
    }
    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("JupJUPjupiter");
    }
    @Override
    public void visit(Neptune neptune) {
        System.out.println("neptune me out");
    } @Override
    public void visit(Uranus uranus) {
        System.out.println("let me in uranus ");
    }
    @Override
    public void visit(Venus venus) {
        System.out.println("Vevenus");
    }
}