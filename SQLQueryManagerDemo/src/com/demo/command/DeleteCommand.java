/**
 * 
 */
package com.demo.command;

import com.demo.receiver.IQueryManager;

/**
 * @author vishakhabhavsar
 *
 */
public class DeleteCommand implements ISQLCommand {

	IQueryManager sqlQueryManager;
	
	/**
	 * 
	 */
	public DeleteCommand(IQueryManager sqlQueryManager) {
		this.sqlQueryManager = sqlQueryManager;
	}

	@Override
	public void execute() {
		this.sqlQueryManager.delete();;
	}
}
