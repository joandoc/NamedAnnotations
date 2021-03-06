package ar;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class PlayerModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(Player.class).annotatedWith(Names.named("Good")).to(GoodPlayer.class);
        bind(Player.class).annotatedWith(Names.named("Bad")).to(BadPlayer.class);

    }

}