package test.test;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this,this);
        getLogger().info("플러그인활성화!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인비활성화!");
    }

    @EventHandler
    public void a1(PlayerMoveEvent a){
        Player p = a.getPlayer();
        p.sendMessage("move");
    }

    @EventHandler
    public void a2(PlayerJoinEvent a){
        Player p = a.getPlayer();
        p.sendMessage("어서오세요"+p.getName()+"님");

    }

    @EventHandler
    public void a3(PlayerChatEvent a){
        Player p = a.getPlayer();
        p.sendMessage("a ");
    }
}
