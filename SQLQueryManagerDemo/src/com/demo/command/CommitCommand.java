/**
 * 
 */
package com.demo.command;

import com.demo.receiver.IQueryManager;

/**
 * @author vishakhabhavsar
 *
 */
public class CommitCommand implements ISQLCommand {

	IQueryManager sqlQueryManager;
	
	/**
	 * 
	 */
	public CommitCommand(IQueryManager sqlQueryManager) {
		this.sqlQueryManager = sqlQueryManager;
	}

	@Override
	public void execute() {
		this.sqlQueryManager.commit();
	}
}
