package azuazu3939.farmassist;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Farmland;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class FarmAssistListener implements Listener {


    @EventHandler
    public void onWalk(PlayerMoveEvent event) {

        Player player = event.getPlayer();
        World world = player.getWorld();
        Block block = player.getLocation().add(0, -0.5, 0).getBlock();

        if (!(world.getName().equals("farm"))) return;
        BlockData blockData = Material.FARMLAND.createBlockData();
        Farmland farmland = (Farmland) blockData;

        farmland.setMoisture(7);

        for (int i = 0; i < 360; i++) {

            int y = block.getY();
            int x = (int) (block.getX() + Math.sin(i) * 64);
            int z = (int) (block.getZ() + Math.cos(i) * 64);
            Location loc = new Location(block.getWorld(), x, y, z);
            Block b = loc.getBlock();

            if (b.getType() == Material.GRASS_BLOCK) {

                b.setType(Material.FARMLAND);
                b.setBlockData(farmland);
            }
        }

        for (int i = 0; i < 360; i++) {

            int y = block.getY();
            int x = (int) (block.getX() + Math.sin(i) * 60);
            int z = (int) (block.getZ() + Math.cos(i) * 60);
            Location loc = new Location(block.getWorld(), x, y, z);
            Block b = loc.getBlock();

            if (b.getType() == Material.GRASS_BLOCK) {

                b.setType(Material.FARMLAND);
                b.setBlockData(farmland);
            }
        }

        for (int i = 0; i < 360; i++) {

            int y = block.getY();
            int x = (int) (block.getX() + Math.sin(i) * 56);
            int z = (int) (block.getZ() + Math.cos(i) * 56);
            Location loc = new Location(block.getWorld(), x, y, z);
            Block b = loc.getBlock();

            if (b.getType() == Material.GRASS_BLOCK) {

                b.setType(Material.FARMLAND);
                b.setBlockData(farmland);
            }
        }

        for (int i = 0; i < 360; i++) {

            int y = block.getY();
            int x = (int) (block.getX() + Math.sin(i) * 52);
            int z = (int) (block.getZ() + Math.cos(i) * 52);
            Location loc = new Location(block.getWorld(), x, y, z);
            Block b = loc.getBlock();

            if (b.getType() == Material.GRASS_BLOCK) {

                b.setType(Material.FARMLAND);
                b.setBlockData(farmland);
            }
        }

        for (int i = 0; i < 360; i++) {

            int y = block.getY();
            int x = (int) (block.getX() + Math.sin(i) * 48);
            int z = (int) (block.getZ() + Math.cos(i) * 48);
            Location loc = new Location(block.getWorld(), x, y, z);
            Block b = loc.getBlock();

            if (b.getType() == Material.GRASS_BLOCK || b.getType() == Material.DIRT || b.getType() == Material.GRASS_PATH) {

                b.setType(Material.FARMLAND);
                b.setBlockData(farmland);
            }
        }
    }

    @EventHandler
    public void onBlockDamage(BlockDamageEvent event) {

        Player player = event.getPlayer();
        World world = player.getWorld();
        Block block = event.getBlock();

        if (!(world.getName().equals("farm"))) return;
        if (block.getY() <= 3) event.setCancelled(true);
    }

    @EventHandler
    public void onJumpBlock(BlockFadeEvent event) {

        Block block = event.getBlock();
        World world = block.getWorld();

        if (!(world.getName().equals("farm"))) return;
        if (block.getType() == Material.FARMLAND) event.setCancelled(true);
    }
}
