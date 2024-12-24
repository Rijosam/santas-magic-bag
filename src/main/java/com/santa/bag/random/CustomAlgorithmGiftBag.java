package com.santa.bag.random;

import java.util.random.RandomGenerator;

public class CustomAlgorithmGiftBag {
    
    void main() {
        String[] gifts = {"Toy Car", "Doll", "Puzzle", "Book", "Teddy Bear"};

        // Create a random number generator with the "L128X1024MixRandom" algorithm
        RandomGenerator random = RandomGenerator.of("L128X1024MixRandom");
        System.out.println("Algorithm used: " +random.getClass().getName());

        int randomIndex = random.nextInt(gifts.length);
        String selectedGift = gifts[randomIndex];
        System.out.println("Santa has selected: " + selectedGift);
    }
}
