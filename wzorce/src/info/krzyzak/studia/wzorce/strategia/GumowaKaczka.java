package info.krzyzak.studia.wzorce.strategia;

/**
 * Created by IntelliJ IDEA.
 * User: karolkrzyzak
 * Date: 12/9/11
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumowaKaczka extends Kaczka{
    public GumowaKaczka() {
        latanieIntefejs = new NieLatam();
        kwakanieInterfejs = new Piszcze();
    }

    @Override
    public void wyswietl() {
        System.out.println("Pływam tylko w wannie");
    }
}
