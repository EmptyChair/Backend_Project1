package homework_app_no_Sprint.people;

public class Masses {
    private Wizard mages;

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
