package exercise2;

class Person {
	private static int count = 0;
	private static int sumAges = 0;
	private int age;

	public Person(int age)
	{
		this.age = age;
		this.sumAges += age;
		this.count++;
	}

	public static int computePopulationSize() {
		return count;
	}

	public static float computeAveragePopulationAge() {
		return (float)sumAges/count;
	}

	public static void resetPopulation() {
		count = 0;
		sumAges = 0;
	}

}
