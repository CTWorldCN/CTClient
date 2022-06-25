package com.xyz8848.ctclient.mod;

/**
 * @author xyz8848
 */

public class Mod {
    private final String name;
    private final boolean enable;

    public Mod(String name, boolean enable) {
        this.name = name;
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public boolean isEnable() {
        return enable;
    }

    public void render() {

    }

    public void update() {

    }
}
