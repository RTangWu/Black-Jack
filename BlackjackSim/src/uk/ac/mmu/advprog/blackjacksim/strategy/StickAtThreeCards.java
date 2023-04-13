package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class StickAtThreeCards implements PlayerStrategy {
	@Override
	public boolean willHit(Card[] hand) {
		if ( hand.length==3  ) { return false; /*stick*/ }
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
	}