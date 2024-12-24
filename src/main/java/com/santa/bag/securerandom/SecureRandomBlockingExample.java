package com.santa.bag.securerandom;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * An example class to test the performance difference between blocking
 * and non-blocking SecureRandom algorithms.
 */
public class SecureRandomBlockingExample {

    void main() {
        try {
            // Use a blocking algorithm
            SecureRandom blockingRandom = SecureRandom.getInstance("NativePRNGBlocking");
            // Measure the time to generate a large random byte array multiple times
            long totalBlockingTime = 0;
            for (int i = 0; i < 10; i++) {
                long startBlocking = System.currentTimeMillis();
                byte[] blockingBytes = new byte[1024 * 1024];
                blockingRandom.nextBytes(blockingBytes);
                long endBlocking = System.currentTimeMillis();
                totalBlockingTime += (endBlocking - startBlocking);
            }
            System.out.println("Average Blocking time: " + (totalBlockingTime / 10) + "ms");

            // Use a non-blocking algorithm
            SecureRandom nonBlockingRandom = SecureRandom.getInstance("NativePRNGNonBlocking");
            // Measure the time to generate a large random byte array multiple times
            long totalNonBlockingTime = 0;
            for (int i = 0; i < 10; i++) {
                long startNonBlocking = System.currentTimeMillis();
                byte[] nonBlockingBytes = new byte[1024 * 1024];
                nonBlockingRandom.nextBytes(nonBlockingBytes);
                long endNonBlocking = System.currentTimeMillis();
                totalNonBlockingTime += (endNonBlocking - startNonBlocking);
            }
            System.out.println("Average Non-blocking time: " + (totalNonBlockingTime / 10) + "ms");

        } catch (NoSuchAlgorithmException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
