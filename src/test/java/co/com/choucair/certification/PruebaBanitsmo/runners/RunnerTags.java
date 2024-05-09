package co.com.choucair.certification.PruebaBanitsmo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",//Nombre del feature
        tags = "@HistoriaDeUsuario", //Nombre del identificador de la HU
        glue = "co.com.choucair.certification.PruebaBanitsmo.stepdefinitions" //Carpeta donde irá el Stepdefinitions
)
public class RunnerTags{
}