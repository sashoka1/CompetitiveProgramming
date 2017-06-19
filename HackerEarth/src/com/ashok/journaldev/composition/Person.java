/**
 * 
 */
package com.ashok.journaldev.composition;

/**
 * @author ashoks
 *
 */
public class Person {

	 //composition has-a relationship
	private Job job;
	
	public Person() {

		this.job=new Job();
		job.setSalary(20000);
	}
	
	public long getSalary()	{
	return job.getSalary();
	}
}
