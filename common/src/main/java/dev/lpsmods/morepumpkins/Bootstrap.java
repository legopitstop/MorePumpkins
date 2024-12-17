package dev.lpsmods.morepumpkins;

import dev.lpsmods.morepumpkins.core.ModBlocks;
import dev.lpsmods.morepumpkins.core.ModCreativeModeTabs;
import dev.lpsmods.morepumpkins.core.ModItems;

/**
 * Author: legopitstop
 */
public class Bootstrap {
    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}