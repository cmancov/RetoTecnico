package co.com.choucair.certification.PruebaBanitsmo.tasks;

import co.com.choucair.certification.PruebaBanitsmo.userinterfaces.BanitsmoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private BanitsmoPage banitsmoPage;
    public static OpenUp Page() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(banitsmoPage));
    }
}
