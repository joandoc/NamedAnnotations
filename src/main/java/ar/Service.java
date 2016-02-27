package ar;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class Service {

    Player goodPlayer;
    Player badPlayer;

    public Service() {
    }

    @Inject
    public void createPlayer(@Named("Good") Player player) {

        System.out.println("En service");
        player.bat();

    }


}
