import java.util.random.RandomGenerator;

void main() {
    String[] gifts = {"Toy Car", "Doll", "Puzzle", "Book", "Teddy Bear"};

    // Create a random number generator with the default algorithm
    RandomGenerator random = RandomGenerator.getDefault();
    System.out.println("Algorithm used: " + random.getClass().getName());

    int randomIndex = random.nextInt(gifts.length);
    String selectedGift = gifts[randomIndex];
    System.out.println("Santa has selected: " + selectedGift);
}


