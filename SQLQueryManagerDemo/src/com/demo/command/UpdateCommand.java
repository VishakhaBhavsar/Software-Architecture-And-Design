/**
 * 
 */
package com.demo.command;

import com.demo.receiver.IQueryManager;

/**
 * @author vishakhabhavsar
 *
 */
public class UpdateCommand implements ISQLCommand {

	IQueryManager sqlQueryManager;
	
	/**
	 * 
	 */
	public UpdateCommand(IQueryManager sqlQueryManager) {
		this.sqlQueryManager = sqlQueryManager;
	}

	@Override
	public void execute() {
		this.sqlQueryManager.update();
	}
}
