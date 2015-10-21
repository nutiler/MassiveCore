package com.massivecraft.massivecore.cmd.massivecore;

import com.massivecraft.massivecore.MassiveCorePerm;
import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.Multiverse;
import com.massivecraft.massivecore.cmd.MassiveCommand;
import com.massivecraft.massivecore.cmd.req.ReqHasPerm;
import com.massivecraft.massivecore.cmd.type.TypeMultiverse;
import com.massivecraft.massivecore.cmd.type.TypeString;

public class CmdMassiveCoreUsysUniverseNew extends MassiveCommand
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdMassiveCoreUsysUniverseNew()
	{
		// Aliases
		this.addAliases("new");
		
		// Parameters
		this.addParameter(TypeString.get(), "universe").setDesc("name of universe to create");
		this.addParameter(TypeMultiverse.get(), "multiverse").setDesc("the multiverse of the universe to create");
		
		// Requirements
		this.addRequirements(ReqHasPerm.get(MassiveCorePerm.USYS_UNIVERSE_NEW.node));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void perform() throws MassiveException
	{
		String universe = this.readArg();
		Multiverse multiverse = this.readArg();
		
		if (multiverse.containsUniverse(universe))
		{
			msg("<b>The universe <h>%s<b> already exists in multiverse <h>%s<b>.", universe, multiverse.getId());
			return;
		}
		
		multiverse.newUniverse(universe);
		
		msg("<g>Created universe <h>%s<g> in multiverse <h>%s<g>.", universe, multiverse.getId());
	}
	
}
