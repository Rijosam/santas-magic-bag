package com.santa.bag.securerandom;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class CustomAlgorithmGiftBag {
    void main() throws NoSuchAlgorithmException {

        String[] gifts = {"Toy Car", "Doll", "Puzzle", "Book", "Teddy Bear"};

        // Use SecureRandom instance with the "SHA1PRNG" algorithm to generate
        // a cryptographically secure random number.
        // This may throw NoSuchAlgorithmException if the algorithm is not available.
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        System.out.println("Algorithm used: " + secureRandom.getAlgorithm());

        int randomIndex = secureRandom.nextInt(gifts.length);
        String selectedGift = gifts[randomIndex];
        System.out.println("Santa has selected: " + selectedGift);
    }
}
