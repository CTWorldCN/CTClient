package com.xyz8848.ctclient.mod.mods.movement;

import com.xyz8848.ctclient.mod.Mod;
import net.minecraft.client.Minecraft;

/**
 * @author xyz8848
 */

public class Sprint extends Mod {
    public Sprint() {
        super("Sprint", false);
    }

    @Override
    public void update() {
        if (Minecraft.getMinecraft().gameSettings.keyBindForward.isKeyDown()
                || Minecraft.getMinecraft().gameSettings.keyBindLeft.isKeyDown()
                || Minecraft.getMinecraft().gameSettings.keyBindRight.isKeyDown()) {
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }
    }
}
