package dev.lpsmods.morepumpkins.platform;

import dev.lpsmods.morepumpkins.Constants;
import dev.lpsmods.morepumpkins.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

/*
 * Author: legopitstop
 * */
public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        Constants.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}