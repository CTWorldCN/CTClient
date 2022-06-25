package com.xyz8848.ctclient.mod;

import com.xyz8848.ctclient.mod.mods.movement.Sprint;
import com.xyz8848.ctclient.mod.mods.render.Hud;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xyz8848
 */

public class ModManager {
    private final List<Mod> mods = new ArrayList<>();

    public List<Mod> getMods() {
        return mods;
    }

    public List<Mod> getEnableMods() {
        return mods.stream().filter(Mod::isEnable).collect(Collectors.toList());
    }

    public void load() {
        mods.add(new Hud());
        mods.add(new Sprint());
    }
}
