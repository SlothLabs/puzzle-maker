package com.github.slothLabs.puzzles.puzzleMaker.main;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Main application window.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        super("Puzzle Maker");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
                MainFrame.this.setVisible(false);
                MainFrame.this.dispose();
            }
        });

        final JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        final JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        final NewPuzzleAction newPuzzleAction = new NewPuzzleAction();
        fileMenu.add(newPuzzleAction);
    }
}
