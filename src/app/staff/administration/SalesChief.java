package app.staff.administration;

import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesChief {

    @Autowired
    private Merchandiser merchandizer;
    @Autowired
    private SalesManager salesManager;

    /*

    public void setMerchandizer(Merchandiser merchandizer) {
        this.merchandizer = merchandizer;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

     */

    public void giveOrders() {
        merchandizer.work();
        salesManager.work();
    }
}
