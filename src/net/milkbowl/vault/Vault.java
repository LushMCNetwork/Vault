package net.milkbowl.vault;

import io.papermc.paper.ServerBuildInfo;
import net.kyori.adventure.key.Key;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vault extends JavaPlugin {

    private static final Key FOLIA = Key.key("papermc", "folia");

    @Override
    public void onEnable() {
        if (!ServerBuildInfo.buildInfo().isBrandCompatible(FOLIA)) {
            throw new IllegalStateException("Vault requires Folia 26.1.2");
        }

        getLogger().info("Enabled " + getPluginMeta().getVersion());
    }
}
