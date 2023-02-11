package Wk6Project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<>();
	int score;
	String playerName;
	
	public Player(String playerName, int score) {
		this.playerName = playerName;
		this.score = score;
	}
	
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	public Player() {}

public void describe() {
	for (Card card : hand) {
		card.describe();
		}
	}

public Card flip() {
	Card flippedCard = hand.remove(0);
	return flippedCard;
	}

public void draw(Deck deck) {
	Card drawCard = deck.draw();
	hand.add(drawCard);
}
public int incrementScore() {
	return score += 1; 
}

}

