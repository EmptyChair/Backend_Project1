package app.code;

import app.staff.administration.Director;
import app.staff.administration.ProductionChief;
import app.staff.administration.SalesChief;
import app.staff.specialists.Secretary;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.Storekeeper;
import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

    public static void main(String[] args) {
        // Option 1: without Sprint
        /*
        MachineOperator machineOperator = new MachineOperator();
        Storekeeper storekeeper = new Storekeeper();

        Merchandiser merchandiser = new Merchandiser();
        SalesManager salesManager = new SalesManager();

        Secretary secretary = new Secretary();

        ProductionChief productionChief = new ProductionChief();
        productionChief.setMachineOperator(machineOperator);
        productionChief.setStorekeeper(storekeeper);
        SalesChief salesChief = new SalesChief();
        salesChief.setSalesManager(salesManager);
        salesChief.setMerchandizer(merchandiser);
        Director director =  new Director();
        director.setProductionChief(productionChief);
        director.setSecretary(secretary);
        director.setSalesChief(salesChief);



        director.manageCompany();

        */

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.manageCompany();
    }
}
