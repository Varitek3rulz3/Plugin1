package com.gmail.nickhennessey3.practice.commands;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.command.source.CommandBlockSource;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.command.args.GenericArguments;
import org.spongepowered.api.command.spec.CommandSpec;

public class PracticePluginExecutor implements CommandExecutor
{

	@Override
	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException 
	{

		
		if(src instanceof Player)
		{
			
			Player player = (Player) src;
			src.sendMessage(Text.of("Hello, " + player.getName() + "!"));
			return CommandResult.success();
			
			}
		
		
		else if(src instanceof ConsoleSource)
		{
			src.sendMessage(Text.of("Hey Console!"));
			return CommandResult.success();
			
		}
		
		else if(src instanceof CommandBlockSource)
		{
			
			src.sendMessage(Text.of("The Mightly Cube!"));
			return CommandResult.success();
			
		}
		
		else 
		{
			
			src.sendMessage(Text.of("Who is this?"));
			
			
		}
		
		
		
		
		return CommandResult.empty();
		
	}

	
	
}
