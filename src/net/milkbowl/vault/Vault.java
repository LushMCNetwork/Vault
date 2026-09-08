package net.milkbowl.vault;

import org.bukkit.plugin.java.JavaPlugin;

public final class Vault extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer", false, getClassLoader());
        } catch (ClassNotFoundException exception) {
            throw new IllegalStateException("Vault requires a Folia-based server", exception);
        }

        getLogger().info("Enabled " + getPluginMeta().getVersion());
    }
}
