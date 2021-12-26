package application;

import application.Person;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		/* This violates APIE because we are accessing an attribute
		 * of Person outside of the Person class
		 */
		//person1.name = "Joe";

		//better implementation
		//but still accessing values directly
		person1.setName("Joe");
		person1.setAge(35);
		System.out.printf("My name is %s and I am %d years old.", person1.name, person1.age);
		
		//use getter methods
		System.out.printf("I am %s and I am %d years old.", person1.getName(), person1.getAge());

	}

}
