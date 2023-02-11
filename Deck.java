package Wk6Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<>();
	
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	//auto instantiate the deck
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number + " of " + suit, count);
				cards.add(card);
				count++;
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card card = cards.remove(0);
		return card;
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
		
	}
}	
	

