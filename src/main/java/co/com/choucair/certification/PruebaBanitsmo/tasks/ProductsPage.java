package co.com.choucair.certification.PruebaBanitsmo.tasks;

import co.com.choucair.certification.PruebaBanitsmo.userinterfaces.ProductsBanitsmoPage;
import com.ibm.as400.access.ProductDirectoryInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ProductsPage implements Task {
    public static ProductsPage ThePage() {
        return Tasks.instrumented(ProductsPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ProductsBanitsmoPage.BTN_CLOSE),
                Click.on(ProductsBanitsmoPage.LBL_PRODUCTS),
                Click.on(ProductsBanitsmoPage.LBL_PRESTAMOS),
                Click.on(ProductsBanitsmoPage.BTN_CLOSE),
                Click.on(ProductsBanitsmoPage.LBL_PRESTAMOS_AUTO),
                Click.on(ProductsBanitsmoPage.BTN_CLOSE),
                Click.on(ProductsBanitsmoPage.LBL_TASAS),
                Click.on(ProductsBanitsmoPage.IMG_PDF));
        }
}
