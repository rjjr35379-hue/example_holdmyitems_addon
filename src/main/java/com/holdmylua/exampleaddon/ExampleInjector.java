package com.holdmylua.exampleaddon;

import com.holdmylua.source.resource_controller.LuaScriptManager; //for shared globals
import org.luaj.vm2.Globals; //luaj stuff
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import com.holdmylua.exampleaddon.script_wrappers.*; //your own script_wrappers goes here
import org.slf4j.Logger; //loggers for warns if you want
import org.slf4j.LoggerFactory;

import static com.holdmylua.exampleaddon.Example.MOD_ID;

public class ExampleInjector {

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    //create a new static instance with your scriptWrapper
    // add more static instances for more wrappers
    private static final ExampleScriptWrapper EXAMPLE_SCRIPT_WRAPPERInstance = new ExampleScriptWrapper();


    public static void register() {
        try {

            Globals globals = LuaScriptManager.getInstance().sharedGlobals; //get shared globals
//add more globals per wrapper
            globals.set("ExampleScriptWrapper", CoerceJavaToLua.coerce(EXAMPLE_SCRIPT_WRAPPERInstance));
            //translates Java objects to lua compatible objects at runtime

        } catch (Exception e) {
            LOGGER.info("goodbye fabric!");
        }
    }
}
