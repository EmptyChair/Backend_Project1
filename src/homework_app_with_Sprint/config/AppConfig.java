package homework_app_with_Sprint.config;

import homework_app_with_Sprint.people.Masses;
import homework_app_with_Sprint.people.Technocrat;
import homework_app_with_Sprint.people.Wizard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Masses masses() {
        return new Masses();
    }

    @Bean
    public Technocrat technos() {
        return new Technocrat();
    }

    @Bean
    public Wizard wizards() {
        return new Wizard();
    }
}
