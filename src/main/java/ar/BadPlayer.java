package ar;

import com.google.inject.Inject;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class BadPlayer implements Player{

    @Inject
    public BadPlayer(){

    }

    public void bat() {
        System.out.println("I think i can face the ball");
    }

    public void bowl() {
        System.out.println("I dont know bowling");
    }

}