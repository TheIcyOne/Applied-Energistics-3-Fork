
package appeng.debug;


import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

import appeng.core.AppEng;
import appeng.core.lib.AEConfig;
import appeng.core.lib.module.AEModule;
import appeng.core.lib.module.Module;


@AEModule( "debug" )
/*
 * TODO 1.10.2-MODUSEP - Do we even want some modules be @Mod at the same time? Weird.
 */
/*
 * The only module not built with gradle.
 */
@Mod( modid = AppEngDebug.MODID, name = AppEngDebug.NAME, version = AEConfig.VERSION, dependencies = "required-after:" + AppEng.MOD_ID, acceptedMinecraftVersions = ForgeVersion.mcVersion )
public class AppEngDebug implements Module
{

	public static final String MODID = AppEng.MOD_ID + "|debug";

	public static final String NAME = AppEng.MOD_NAME + " | debug";

	@EventHandler
	public void preInit( final FMLPreInitializationEvent event )
	{

	}

	@EventHandler
	public void init( final FMLInitializationEvent event )
	{

	}

	@EventHandler
	public void postInit( final FMLPostInitializationEvent event )
	{

	}

	@EventHandler
	public void handleIMCEvent( IMCEvent event )
	{

	}

	@EventHandler
	public void serverAboutToStart( FMLServerAboutToStartEvent event )
	{

	}

	@EventHandler
	public void serverStarting( FMLServerStartingEvent event )
	{

	}

	@EventHandler
	public void serverStopping( FMLServerStoppingEvent event )
	{

	}

	@EventHandler
	public void serverStopped( FMLServerStoppedEvent event )
	{

	}

}
