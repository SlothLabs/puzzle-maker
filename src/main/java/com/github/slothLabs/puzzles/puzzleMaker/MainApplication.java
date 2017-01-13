package com.github.slothLabs.puzzles.puzzleMaker;

import com.github.slothLabs.puzzles.puzzleMaker.main.MainFrame;

import javax.swing.SwingUtilities;

/**
 * Main application class.
 */
public class MainApplication {
    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            final MainFrame wnd = new MainFrame();
            wnd.setVisible(true);
        });
    }
}
