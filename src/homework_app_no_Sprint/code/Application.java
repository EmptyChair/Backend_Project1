package homework_app_no_Sprint.code;

import homework_app_no_Sprint.people.Masses;
import homework_app_no_Sprint.people.Technocrat;
import homework_app_no_Sprint.people.Wizard;

public class Application {
    public static void main(String[] args) {

        Technocrat renegades = new Technocrat();
        Wizard mages = new Wizard();
        Masses masses = new Masses();
        masses.setGabrielites(renegades);
        masses.setMages(mages);

        masses.sleep();
    }
}
