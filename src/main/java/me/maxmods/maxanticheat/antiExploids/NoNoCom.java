package me.maxmods.maxanticheat.antiExploids;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class NoNoCom implements Listener {
    void OnPlayerBlockInteract(PlayerInteractEvent e){
        int BlockX = e.getClickedBlock().getLocation().getBlockX();
        int BlockZ = e.getClickedBlock().getLocation().getBlockZ();
        int PlayerX = e.getPlayer().getLocation().getBlockX();
        int PlayerZ = e.getPlayer().getLocation().getBlockZ();

        double DistanceX = BlockX - PlayerX;
        double DistanceZ = BlockZ - PlayerZ;
        double Distance;

        DistanceX = DistanceX * DistanceX;
        DistanceZ = DistanceZ * DistanceZ;
        Distance = Math.sqrt(DistanceX + DistanceZ);

        if(Distance > 8){
            e.setCancelled(true);
        }
        else if(Distance < -8){
            e.setCancelled(true);
        }

    }
}
