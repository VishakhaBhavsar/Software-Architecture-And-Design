/**
 * 
 */
package com.demo.receiver;

/**
 * @author vishakhabhavsar
 *
 */
public class SQLQueryManager implements IQueryManager {

	/**
	 * 
	 */
	public SQLQueryManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert() {
		System.out.println("Executed INSERT");
	}

	@Override
	public void update() {
		System.out.println("Executed UPDATE");

	}

	@Override
	public void delete() {
		System.out.println("Executed DELETE");

	}

	@Override
	public boolean commit() {
		System.out.println("Executed COMMIT");
		return false;
	}

	@Override
	public boolean rollback() {
		System.out.println("Executed ROLLBACK");
		return false;
	}

}
