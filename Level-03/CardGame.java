import java.util.Arrays;
import java.util.Random;

public class CardGame {

    // Define the suits and ranks
    static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
       
        int numOfCards = 5;  // Example number of cards per player
        int numOfPlayers = 4; // Example number of players

        
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Distribute the deck to players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);

        // Print the cards each player has
        printPlayersCards(players);
    }

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Generate a random card number between i and n-1
            int randomCardNumber = i + rand.nextInt(n - i);

            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        int totalCards = numOfCards * numOfPlayers;

        // Check if there are enough cards to distribute
        if (deck.length < totalCards) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0]; // Return an empty array
        }

        // Create a 2D array to store the players' cards
        String[][] players = new String[numOfPlayers][numOfCards];

        // Distribute the cards to the players
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            System.out.println(Arrays.toString(players[i]));
        }
    }
}
