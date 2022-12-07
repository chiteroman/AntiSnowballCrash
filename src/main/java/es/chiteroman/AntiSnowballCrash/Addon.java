package es.chiteroman.AntiSnowballCrash;

import com.mojang.logging.LogUtils;
import es.chiteroman.AntiSnowballCrash.modules.AntiSnowballCrash;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        Modules.get().add(new AntiSnowballCrash());
    }

    @Override
    public String getPackage() {
        return "es.chiteroman.AntiSnowballCrash";
    }
}
