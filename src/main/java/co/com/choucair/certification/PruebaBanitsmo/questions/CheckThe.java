package co.com.choucair.certification.PruebaBanitsmo.questions;

import co.com.choucair.certification.PruebaBanitsmo.interaction.SwitchWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CheckThe implements Question<Boolean>{

private String document;

public CheckThe(String document){
    this.document = document;
}
public static CheckThe document(String document){
return new CheckThe(document);
}

@Override
    public Boolean answeredBy(Actor actor){

    String url;
    boolean resp;

    actor.attemptsTo(SwitchWindow.to());
    url = actor.recall("urlPDF").toString().replaceFirst("\\+", "-").
    replaceAll("\\+", " ");

    return url.contains(document);
}
}
