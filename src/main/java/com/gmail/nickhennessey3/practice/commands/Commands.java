package com.gmail.nickhennessey3.practice.commands;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandCallable;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.command.source.CommandBlockSource;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import org.spongepowered.api.command.CommandManager;

import java.util.Collections;
import java.util.List;
import java.util.Optional;



public class Commands implements CommandCallable 

{
	
	private final Optional<Text> desc = Optional.of(Text.of("Why Hello There!"));
    private final Optional<Text> help = Optional.of(Text.of("Type /practice to get started!"));
    private final Text usage = Text.of("<Howdy>");
    
    
    public CommandResult process(CommandSource source, String arguments) throws CommandException {
        Sponge.getServer().getBroadcastChannel().send(Text.of(arguments));
        return CommandResult.success();
    }


	@Override
	public Optional<Text> getHelp(CommandSource source) {
		
		return null;
	}

	@Override
	public Optional<Text> getShortDescription(CommandSource source) {
		
		return null;
	}

	@Override
	public List<String> getSuggestions(CommandSource arg0, String arg1, Location<World> arg2) throws CommandException {
		
		return null;
	}

	@Override
	public Text getUsage(CommandSource source) {
		
		return null;
	}

	

	@Override
	public boolean testPermission(CommandSource source) {
	
		return false;
	}

	
	
}
