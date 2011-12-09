package info.krzyzak.studia.wzorce.strategia;

/**
 * Created by IntelliJ IDEA.
 * User: karolkrzyzak
 * Date: 12/9/11
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class MiniSymulatorKaczki {
    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        dzika = new GumowaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLec();
    }
}
