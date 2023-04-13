package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Card.Value;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class AlwaysStick implements PlayerStrategy {
	@Override
	public boolean willHit(Card[] cards) {
	  return false; /*stick*/ 
	}
	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deckShuffled() {
		// TODO Auto-generated method stub
		
	}
	}