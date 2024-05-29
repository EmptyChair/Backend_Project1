package homework_app_with_Sprint.people;

import org.springframework.beans.factory.annotation.Autowired;

public class Masses {
    @Autowired
    private Wizard mages;
    @Autowired
    private Technocrat gabrielites;

    public void setMages(Wizard mages) {
        this.mages = mages;
    }

    public void setGabrielites(Technocrat gabrielites) {
        this.gabrielites = gabrielites;
    }

    public void sleep() {
        System.out.println("Sleeping masses spawn mages from their midst");
        mages.dominateMasses();
        gabrielites.resistMages();
        awaken();
    }

    public void awaken() {
        System.out.println("Sleeping masses are awakened by chaos!");
        mages.fall();
        gabrielites.crumble();
    }
}
