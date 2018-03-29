package at.refugeescode.pset2.controller.player;

import at.refugeescode.pset2.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}
