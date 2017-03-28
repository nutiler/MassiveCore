package com.massivecraft.massivecore.command.massivecore;

import com.massivecraft.massivecore.ConfServer;
import com.massivecraft.massivecore.command.MassiveCommand;

public class CmdMassiveCoreId extends MassiveCoreCommand
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdMassiveCoreId()
	{

	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void perform()
	{
		this.msg("<i>The id of this server is \"<h>%s<i>\".", ConfServer.serverid);
	}

}
