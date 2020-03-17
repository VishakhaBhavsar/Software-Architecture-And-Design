/**
 * 
 */
package com.demo.client;

import com.demo.command.CommitCommand;
import com.demo.command.DeleteCommand;
import com.demo.command.InsertCommand;
import com.demo.command.RollbackCommand;
import com.demo.command.UpdateCommand;
import com.demo.invoker.SQLCommandExecutor;
import com.demo.receiver.IQueryManager;
import com.demo.receiver.SQLQueryManager;

/**
 * @author vishakhabhavsar
 *
 */
public class SQLClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IQueryManager queryManager = new SQLQueryManager();
		SQLCommandExecutor commandExecutor = new SQLCommandExecutor();
		
		InsertCommand insertCommand = new InsertCommand(queryManager);
		commandExecutor.executeOperation(insertCommand);
		
		UpdateCommand updateCommand = new UpdateCommand(queryManager);
		commandExecutor.executeOperation(updateCommand);
		
		DeleteCommand deleteCommand = new DeleteCommand(queryManager);
		commandExecutor.executeOperation(deleteCommand);
		
		CommitCommand commitCommand = new CommitCommand(queryManager);
		commandExecutor.executeOperation(commitCommand);
		
		
		commandExecutor.executeOperation(insertCommand);
		commandExecutor.executeOperation(updateCommand);
		RollbackCommand rollbackCommand = new RollbackCommand(queryManager);
		commandExecutor.executeOperation(rollbackCommand);
		
	}

}
