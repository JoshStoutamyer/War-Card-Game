package Wk6Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//List to hold the cards of the deck
	List<Card> cards = new ArrayList<>();
	//Deck constructor, by instantiating a new Deck() you create another 52 deck.
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	//auto populate the deck
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number + " of " + suit, count);
				cards.add(card);
				count++;
			}
		}
	}
	// calls from Collections since Lists are technically collections.
	public void shuffle() {
		Collections.shuffle(cards);
	}
	// Draw to remove cards from the deck and place them in the hand.
	public Card draw() {
		Card card = cards.remove(0);
		return card;
	}
//	Test to see whether the deck populated correctly.
//	public void describe() {
//		for (Card card : cards) {
//			card.describe();
//		}
//	}
}	
	

