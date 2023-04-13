package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Card.Value;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class HitSoftSeventeen implements PlayerStrategy {
	@Override
	public boolean willHit(Card[] hand) {
		if (Game.scoreHand(hand) > 17  ) { return false; /*stick*/ }
		else if(Game.scoreHand(hand)==17) {
			return isAce(hand);
		} 
		else { return true; /*hit*/ }
	}
	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deckShuffled() {
		// TODO Auto-generated method stub
		
	}
	private boolean isAce(Card[]hand) {
		for(int i =0; i<hand.length;i++) {
			if(hand[i].getValue().equals(Card.Value.ACE));
		return true;
		}
		return false;
	}
	}