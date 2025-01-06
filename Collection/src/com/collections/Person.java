package com.collections;

public class Person implements Comparable{
	String name;
	int age;
	int id;
	Person(String name, int age, int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	@Override
	public String toString() {
		return name + " " + age + " " + id;
	}
	public int compareTo(Object o) {
		Person p = (Person) o;
//		Person p1 = (Person) o;
//		return this.name.compareTo(p1.name);
		return this.name.compareTo(p.name);
//		return this.name.compareTo(p.name)*-1;      // for sorting custom objects on the basis of string for descending order......
//		if (this.age>p.age) {                 // for sorting custom objects on the basis of int for descending order......
//			return -1;
//		}
//		else if (this.age<p.age) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
	}
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
