package org.akatrox;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class AkatroxTempBlocks extends JavaPlugin implements Listener {

    private Map<Material, Integer> blockRemovalTimes = new HashMap<>();

    @Override
    public void onEnable() {
        File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
        String fileName = jarFile.getName();

        if (fileName.endsWith(".jar")) {
            fileName = fileName.substring(0, fileName.length() - 4);
        }

        if (!fileName.equals(getDescription().getName())) {
            getLogger().info(ColorUtil.color("&cPlugin name cannot be changed. Plugin is being disabled."));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        saveDefaultConfig();
        loadConfigValues();

        Bukkit.getPluginManager().registerEvents(this, this);



        System.out.println(" ");
        System.out.println(" ");
        getLogger().info(ColorUtil.color("&aAkatroxTempBlocks plugin is enabled"));
        getLogger().info(ColorUtil.color("&aDeveloped by benakatrox"));
        getLogger().info(ColorUtil.color("&awww.akatrox.com.tr - discord.gg/akatrox"));
        System.out.println(" ");
        System.out.println(" ");




    }

    @Override
    public void onDisable() {

        System.out.println(" ");
        System.out.println(" ");
        getLogger().info(ColorUtil.color("&cAkatroxTempBlocks plugin is disabled"));
        getLogger().info(ColorUtil.color("&cDeveloped by benakatrox"));
        getLogger().info(ColorUtil.color("&cwww.akatrox.com.tr - discord.gg/akatrox"));
        System.out.println(" ");
        System.out.println(" ");

    }


}
