/**
 * 
 */
package com.demo.receiver;

/**
 * @author vishakhabhavsar
 *
 */
public interface IQueryManager {
	// issues a SQL INSERT operation for tableName setting the provided
	  // column values
	  //
	  // an IDictionary<string, object> is an interface that maps string keys
	  // onto object values, for java developers think Map<String, Object> and
	  // for javascript/typescript developers think 'hash'
	  void insert();

	  // issues a SQL UPDATE operation for tableName setting the provided column
	  // values and creating a WHERE clause from the predicates
	  //
	  // an IList<IPredicate> is an order list of predicate objects.
	  //
	  // java developers can think of IList much like ArrayList if that helps
	  void update();

	  // issues a SQL DELETE operation for tableName with a WHERE clause
	  // from the predicates
	  void delete();

	  // causes the requested database operations to execute (returns true if at
	  // least one row is effected), check the individual IQuery returns
	  // from the above methods to determine the actual impact of each
	  boolean commit();

	  // abandons the requested database operations (returns false if there are
	  // no operations)
	  boolean rollback();
}
