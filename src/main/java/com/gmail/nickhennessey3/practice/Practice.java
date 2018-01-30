package com.gmail.nickhennessey3.practice;


import java.util.logging.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandCallable;
import org.spongepowered.api.command.CommandManager;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;
import com.gmail.nickhennessey3.practice.commands.PracticePluginExecutor;
import com.google.common.collect.Lists;
import com.google.inject.Inject;


@Plugin(id = "practice", name = "Practice", version = "1.0")

public class Practice {
	
	private static final String String = null;
	@Inject
	
	private Logger logger;
	
	public Logger getLogger() 
	{
	
		return logger;
	
	
	}
	
	@Listener
	public void onInitialize(GameInitializationEvent event)
	{
		
		getLogger().info(String);
	    
		this.getLogger().info("Loading...");
		
		CommandManager cmdManager = Sponge.getCommandManager();
		
		CommandCallable myCommandSpec = null;
		
		cmdManager.register(this, myCommandSpec, "alias1", "alias2", "alias3");
		
		CommandSpec practiceCommandSpec = CommandSpec.builder()
				.description(Text.of("Output based on Source"))
				.executor(new PracticePluginExecutor())
				.build();
		
		Sponge.getCommandManager().register(this, practiceCommandSpec, Lists.newArrayList("practice"));
		
		this.getLogger().info("Loaded!");
		
	}


  }

