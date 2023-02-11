package Wk6Project;

public class App {

	public static void main(String[] args) {
		
		Player player1 = new Player("Billy Bubba Buck", 0);
		Player player2 = new Player("Sally Suzy Snoozy", 0);
		System.out.println("Welcome " + player1.playerName + " & " + player2.playerName + 
				" to the game!");
		
		Deck deckOne = new Deck();
		System.out.println("The deck is set with " + deckOne.cards.size() + " cards!\n");
		
		deckOne.shuffle();
		
		for (int i = 1; i <= 52; i++) {
			if (i % 2 != 0) {
				Card player1Draw = deckOne.draw();
				player1.hand.add(player1Draw);
			} else {
				Card player2Draw = deckOne.draw();
				player2.hand.add(player2Draw);
			}
		}
		System.out.println(player1.playerName + " has a hand of " +
				player2.hand.size() + " cards."); 
		System.out.println(player2.playerName + " has a hand of " +
				player1.hand.size() + " cards.\n");
		
		for (int j = 0; j < 26; j++) {
			Card player1FlippedCard = player1.flip();
			System.out.print(player1.playerName + " flips a(n) ");
			player1FlippedCard.describe();
			
			Card player2FlippedCard = player2.flip();
			System.out.print(player2.playerName + " flips a(n) ");
			player2FlippedCard.describe();
			
			if (player1FlippedCard.getValue() > player2FlippedCard.getValue()) {
				player1.incrementScore();
				System.out.println(player1.playerName + " won round " + (j +1) + " " +
				player1.playerName + "'s score is: " + player1.score + "\n");
			} else if (player2FlippedCard.getValue() > player1FlippedCard.getValue()) {
				player2.incrementScore();
				System.out.println(player2.playerName + " won round " + (j +1) + " " +
						player2.playerName + "'s score is: " + player2.score + "\n");
			} else {
				System.out.println("It's a DRAW! No points awarded.\n");
			}
			
		}
		
		if (player1.score > player2.score) {
			System.out.println(player1.playerName + " has WON with a score of: " +
		player1.score);
		} else if (player2.score > player1.score) {
			System.out.println(player2.playerName + " has WON with a score of: " +
		player2.score);
		} else {
			System.out.println("IT'S A DRAW!!!");
		}
	
	}

}