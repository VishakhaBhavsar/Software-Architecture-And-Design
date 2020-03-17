/**
 * 
 */
package com.demo.command;

import com.demo.receiver.IQueryManager;

/**
 * @author vishakhabhavsar
 *
 */
public class InsertCommand implements ISQLCommand {

	IQueryManager sqlQueryManager;
	
	/**
	 * 
	 */
	public InsertCommand(IQueryManager sqlQueryManager) {
		this.sqlQueryManager = sqlQueryManager;
	}

	@Override
	public void execute() {
		this.sqlQueryManager.insert();
	}
}
