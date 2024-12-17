package dev.lpsmods.morepumpkins;

import net.fabricmc.api.ModInitializer;

public class MorePumpkins implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        Bootstrap.init();
    }
}
