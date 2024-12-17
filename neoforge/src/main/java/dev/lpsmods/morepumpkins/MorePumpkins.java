package dev.lpsmods.morepumpkins;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MorePumpkins {

    public MorePumpkins(IEventBus eventBus) {
        Bootstrap.init();
    }
}