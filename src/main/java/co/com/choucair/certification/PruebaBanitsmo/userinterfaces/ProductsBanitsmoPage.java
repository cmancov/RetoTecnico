package co.com.choucair.certification.PruebaBanitsmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsBanitsmoPage extends PageObject {
    public static final Target BTN_CLOSE = Target.the("Boton cerrar")
            .located(By.xpath("//*[@id=\"cookie-close-btn\"]/img"));
    public static final Target LBL_PRODUCTS = Target.the("Label productos")
            .located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));
    public static final Target LBL_PRESTAMOS = Target.the("Label prestamos")
            .located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a"));
    public static final Target LBL_PRESTAMOS_AUTO = Target.the("Label prestamos auto")
            .located(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[2]/h2/a"));
    public static final Target LBL_TASAS = Target.the("Label tasas")
            .located(By.xpath("//*[@id=\"filialTabs\"]/li[4]/a"));
    public static final Target IMG_PDF = Target.the("Imagen pdf")
            .located(By.xpath("(//td/a[@title='Guía para afiliación a compra'])[2]"));
}
