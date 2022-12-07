package es.chiteroman.AntiSnowballCrash.modules;

import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;

public class AntiSnowballCrash extends Module {
    public AntiSnowballCrash() {
        super(Categories.Render, "Anti snowball crash", "Drops snowball spawn packet");
    }
}
