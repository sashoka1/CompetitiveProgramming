package com.ashok.journaldev;
import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsMethodImportance {

	public static void main(String[] args) {

		Set<Emp> emps = new HashSet<Emp>();
		emps.add(new Emp(1,"Pankaj"));
		emps.add(new Emp(2, "David"));
		emps.add(new Emp(1, "Pankaj"));
		
		System.out.println(emps);
	}

}

class Emp {
	private String name;
	private int id;

	public Emp(int i, String n) {
		this.id = i;
		this.name = n;
	}
	
	@Override
	public String toString(){
		return "{"+id+","+name+"}";
	}
}