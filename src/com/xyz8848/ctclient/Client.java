package com.xyz8848.ctclient;

import com.xyz8848.ctclient.mod.ModManager;
import org.lwjgl.opengl.Display;

/**
 * @author xyz8848
 */

public class Client {
    public static final String NAME = "CTClient";
    public static final String VERSION = "v1.0.0-pre1";

    public static ModManager modManager;

    public static void start() {
        System.out.println("CTClient loading...");
        System.out.println("CTClient made by xyz8848");
        modManager = new ModManager();
        modManager.load();
        Display.setTitle(NAME + " " + VERSION + " | " + "Made by xyz8848");
    }

    public static void stop() {
        System.out.println("CTClient stopping...");

    }
}
