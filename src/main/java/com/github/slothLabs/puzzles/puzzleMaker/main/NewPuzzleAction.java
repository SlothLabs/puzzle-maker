package com.github.slothLabs.puzzles.puzzleMaker.main;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

/**
 * Action for creating a new puzzle.
 */
public class NewPuzzleAction extends AbstractAction {
    public NewPuzzleAction() {
        super("New Puzzle");
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        System.err.println("New puzzle!!!");
    }
}
