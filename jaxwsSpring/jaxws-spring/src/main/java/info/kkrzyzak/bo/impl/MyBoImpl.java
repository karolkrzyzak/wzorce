package info.kkrzyzak.bo.impl;

import info.kkrzyzak.bo.MyBo;

/**
 * Created by IntelliJ IDEA.
 * User: karolkrzyzak
 * Date: 1/31/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBoImpl implements MyBo{
    @Override
    public String getName() {
        return "Karol";
    }

    @Override
    public String getLastName() {
        return "Krzyzak";
    }

    @Override
    public int getAge() {
        return 31;
    }


}
