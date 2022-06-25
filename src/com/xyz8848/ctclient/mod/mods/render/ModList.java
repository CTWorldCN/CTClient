package com.xyz8848.ctclient.mod.mods.render;

import com.xyz8848.ctclient.Client;
import com.xyz8848.ctclient.mod.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

import java.util.List;

/**
 * @author xyz8848
 */

public class ModList extends Mod {
    public ModList() {
        super("ModList", true);
    }

    @Override
    public void render() {
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int height = scaledResolution.getScaledHeight();
        int width = scaledResolution.getScaledWidth();

        List<Mod> enableMods = Client.modManager.getEnableMods();
        FontRenderer font = Minecraft.getMinecraft().fontRendererObj;
        enableMods.sort((o1, o2) -> font.getStringWidth(o2.getName()) - font.getStringWidth(o1.getName()));

        int y = 0;
        for (Mod enableMod : enableMods) {
            font.drawString(enableMod.getName(),width - font.getStringWidth(enableMod.getName()),y,0xFFFFFFFF);
            y+= font.FONT_HEIGHT + 1;
        }
    }
}
