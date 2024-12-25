import java.security.SecureRandom;

void main() {
    String[] gifts = {"Toy Car", "Doll", "Puzzle", "Book", "Teddy Bear"};

    // Create a SecureRandom instance to generate a cryptographically
    // secure random number.
    SecureRandom secureRandom = new SecureRandom();
    System.out.println("Algorithm used: " + secureRandom.getAlgorithm());

    int randomIndex = secureRandom.nextInt(gifts.length);
    String selectedGift = gifts[randomIndex];
    System.out.println("Santa has selected: " + selectedGift);
}

