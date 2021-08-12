package org.entitylabs.learning.simulator;

import org.entitylabs.learning.interfaces.GenericPredicate;
import org.entitylabs.learning.model.Bird;

public class Simulator {

	public static void main(String[] args) {

		GenericPredicate<Bird> endangeredBirdPredicate = bird -> bird.isEndangered();

		Bird bird = new Bird(false, "Sparrow", false);

		// Test Predicate
		var result = endangeredBirdPredicate.test(bird);

		System.out.println("Is " + bird.getName() + " endangered: " + result);

		Bird eagle = new Bird(true, "Himalayan Eagle", true);

		System.out.println(eagle.getName() + " is endangered: " + birdTest(eagle, endangeredBirdPredicate));

		GenericPredicate<Bird> carnivorousBirdTest = birdVar -> birdVar.isCarnivorous();

		System.out.println(eagle.getName() + " is carnivorous: " + birdTest(eagle, carnivorousBirdTest));
	}

	/**
	 * Passing Different Behavior
	 * 
	 * @param bird
	 * @param birdPredicate
	 * @return
	 */
	public static boolean birdTest(Bird bird, GenericPredicate<Bird> birdPredicate) {

		return birdPredicate.test(bird);

	}
}
