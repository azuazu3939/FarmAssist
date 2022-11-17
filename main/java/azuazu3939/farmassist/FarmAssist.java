package azuazu3939.farmassist;

import org.bukkit.plugin.java.JavaPlugin;

public final class FarmAssist extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FarmAssistListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
