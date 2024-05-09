package co.com.choucair.certification.PruebaBanitsmo.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class SwitchWindow implements Interaction{

    public static SwitchWindow to() {
        return new SwitchWindow();
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        StringBuilder urlActual = new StringBuilder();
        String tabName = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String actual : handles){
            if (!actual.equalsIgnoreCase(tabName)) {
                BrowseTheWeb.as(actor).getDriver().switchTo().window(actual);
                urlActual.append(BrowseTheWeb.as(actor).getDriver().getCurrentUrl());
            }
        }
        actor.remember("urlPDF", urlActual.append(BrowseTheWeb.as(actor).getDriver().getCurrentUrl()));
    }
}
