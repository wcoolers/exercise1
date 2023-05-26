package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Adegoke Akanbi May 26, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(1 + (int)(Math.random()* (13-1) + 1));
            
            card.setSuit(Card.SUITS[(int)(Math.random()* 4)]);
            hand[i]=card;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
//        for (Card a: hand){
//            System.out.println(a.getValue() + " " + a.getSuit());
//        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("enter card and suit values. Card: 1-13 , suits 0-3 seperated by space_");
        int userCardValue = input.nextInt();
        int userSuitValue = input.nextInt();
        Card userCard = new Card();
        userCard.setValue(userCardValue);
        userCard.setSuit(Card.SUITS[userSuitValue]);
        for (int i =0; i < hand.length; i++){
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit() == userCard.getSuit()){
                printInfo();
                break;
            };
        }
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        
        
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Adegoke, but you can call me goks, goke or gk");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Reach Ninja Level in coding");
        System.out.println("-- Continue to have a perfect GPA!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing video games");
        System.out.println("-- Visiting sites");
        System.out.println("-- Relaxing with popcorn, and a drink while watching War movies");
        System.out.println("-- Teaching");

        System.out.println();
        
    
    }

}
