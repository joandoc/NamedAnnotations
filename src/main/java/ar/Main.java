package ar;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class Main {

    //Occasionally you'll want multiple bindings for a same type.
    /**
     * @param args
     */
    public static void main(String[] args) {

        PlayerModule module = new PlayerModule();
        Injector injector = Guice.createInjector(new PlayerModule());

        Player goodPlayer = (Player) injector.getInstance(Key.get(Player.class, Names.named("Good")));
        goodPlayer.bat();
        goodPlayer.bowl();

        Player badPlayer =  (Player) injector.getInstance(Key.get(Player.class, Names.named("Bad")));
        badPlayer.bat();
        badPlayer.bowl();

        Service s = injector.getInstance(Service.class);


    }

}
