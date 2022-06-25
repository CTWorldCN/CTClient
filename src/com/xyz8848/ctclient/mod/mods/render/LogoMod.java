package com.xyz8848.ctclient.mod.mods.render;

import com.xyz8848.ctclient.Client;
import com.xyz8848.ctclient.mod.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

/**
 * @author xyz8848
 */

public class LogoMod extends Mod {
    public LogoMod() {
        super("Logo", true);
    }

    @Override
    public void render() {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();
        Minecraft.getMinecraft().fontRendererObj.drawString("CTClient" + " " + Client.VERSION, 0, 0, 0xFFFFFFFF);
        Minecraft.getMinecraft().fontRendererObj.drawString("@xyz8848", 0, 9, 0xFFFFFFFF);
    }
}
