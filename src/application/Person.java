package application;

public class Person {
	String name;
	int age;

	// setter
	void setName(String theName) {
		name = theName;
	}

	/*
	 * Had to use theAge for the parameter name so that it does't clash with the age
	 * instance variable. But you can use keyword this to refer to the instance
	 * variable 
	 * 
	 * void setAge(int theAge) { 
	 * age = theAge;
	 */
	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
}
