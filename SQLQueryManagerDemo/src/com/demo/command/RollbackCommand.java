/**
 * 
 */
package com.demo.command;

import com.demo.receiver.IQueryManager;

/**
 * @author vishakhabhavsar
 *
 */
public class RollbackCommand implements ISQLCommand {

	IQueryManager sqlQueryManager;
	
	/**
	 * 
	 */
	public RollbackCommand(IQueryManager sqlQueryManager) {
		this.sqlQueryManager = sqlQueryManager;
	}

	@Override
	public void execute() {
		this.sqlQueryManager.rollback();
	}
}
