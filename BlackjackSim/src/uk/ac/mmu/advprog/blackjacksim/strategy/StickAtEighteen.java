package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class StickAtEighteen implements PlayerStrategy {
	@Override
	public boolean willHit(Card[] hand) {
		if ( Game.scoreHand(hand) >= 18 ) { return false; /*stick*/ }
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