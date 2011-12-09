package info.krzyzak.studia.wzorce.strategia;

/**
 * Created by IntelliJ IDEA.
 * User: karolkrzyzak
 * Date: 12/9/11
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 *
 * Założenie jest takie że klasa Kaczka została nam dostarczona.
 * I posiadała metody wyswietl i plywaj.
 */
public abstract class Kaczka {

    protected LatanieIntefejs latanieIntefejs;
    protected KwakanieInterfejs kwakanieInterfejs;

    protected Kaczka() {
    }

    public abstract void wyswietl();

    public void wykonajLec(){
        latanieIntefejs.lec();
    }

    public void wykonajKwacz(){
        kwakanieInterfejs.kwacz();
    }

    public void plywaj(){
        System.out.println("Wszystkie kaczki plywaja nawet te sztuczne.");
    }

}
