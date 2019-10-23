package exercise1;

import java.util.Scanner;

class Person {

	private String name;
	private int age;

	public Person()
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Nom: ");
		this.name = cin.next();
		System.out.print("Age: ");
		this.age = cin.nextInt();
	}

	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

}
