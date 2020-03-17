package com.demo.invoker;

import java.util.ArrayList;
import java.util.List;

import com.demo.command.CommitCommand;
import com.demo.command.ISQLCommand;
import com.demo.command.RollbackCommand;

public class SQLCommandExecutor {
	
	private final List<ISQLCommand> sqlCommands = new ArrayList<ISQLCommand>();

	public void executeOperation(ISQLCommand command) {

		if(command instanceof CommitCommand) {
			for(ISQLCommand com : sqlCommands) {
				com.execute();
			}
			command.execute();
		}else if(command instanceof RollbackCommand){
			sqlCommands.clear();
			command.execute();
		}else {
			sqlCommands.add(command);
		}
	}

}
