package ar;

import com.google.inject.Inject;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

public class GoodPlayer implements Player{

    @Inject
    public GoodPlayer(){

    }

    public void bat() {
        System.out.println("I can hit any ball");
    }

    public void bowl() {
        System.out.println("I can also bowl");
    }
}
