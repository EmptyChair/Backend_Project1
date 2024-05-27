package homework_app_with_Sprint.code;

import homework_app_with_Sprint.people.Masses;
import homework_app_with_Sprint.people.Technocrat;
import homework_app_with_Sprint.people.Wizard;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("homework_app_with_Sprint.config");
        Masses masses = context.getBean(Masses.class);
        masses.sleep();
    }
}
