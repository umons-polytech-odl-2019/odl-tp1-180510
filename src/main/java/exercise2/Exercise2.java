package exercise2;

public class Exercise2 {

	// Ajoutez un champ age à chaque instance de la classe Person.
	// Créez-y une méthode statique "computePopulationSize" pour retourner la taille de la population.
	// Créez-y une méthode statique "computeAveragePopulationAge" pour calculer l'âge moyen de la population.
	// Implémentez-y une méthode statique "resetPopulation" pour remettre les compteurs à zéro.

	static void createPerson(int age) {
		Person p = new Person(age);
	}

	static int computePopulationSize() {
		return Person.computePopulationSize();
		//return 0;
	}

	static float computeAveragePopulationAge() {
		return Person.computeAveragePopulationAge();
		//return 0.0F;
	}

	static void resetPopulation() {
		Person.resetPopulation();
	}
}
