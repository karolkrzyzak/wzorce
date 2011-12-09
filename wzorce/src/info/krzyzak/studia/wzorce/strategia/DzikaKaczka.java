package info.krzyzak.studia.wzorce.strategia;

/**
 * Created by IntelliJ IDEA.
 * User: karolkrzyzak
 * Date: 12/9/11
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class DzikaKaczka extends Kaczka{

    public DzikaKaczka() {
        latanieIntefejs  = new LatamBoMamSkrzydla();
        kwakanieInterfejs = new Kwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem prawdziwą sztuczną kaczką");
    }
}
