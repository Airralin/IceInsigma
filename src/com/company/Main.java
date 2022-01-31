package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main (String[]args)
    {
        // number of rows and columns in grid
        final int FRAME_WIDTH=640;
        final int FRAME_HEIGHT=480;
        final int ROWS=15;
        final int COLS=20;
        //key constants
        final int UP = 38;
        final int DOWN = 40;
        final int LEFT = 37;
        final int RIGHT = 39;
        final int STOP = -1;
        final int SLOW = 1000;
        final int MED = 500;
        final int FAST = 100;

        JFrame frame = new JFrame();
        JButton[][] button = new JButton[ROWS][COLS];
        JPanel panel = new JPanel();
        //JLabel[] status = new JLabel[COLS];
        //images
        ImageIcon lord = new ImageIcon("src/character-icons/Lord.png");
        GridLayout grid;
        grid = new GridLayout( ROWS,COLS );
        frame.setLayout( grid );
        //
        Map map = new Map(ROWS, COLS);
        Character Chrom = new Character(1,22,7,6,3,8,false,lord);
        map.placeCharacter(Chrom, 11,3);
        //
        //Create JButtons initialize, activate listeners,
        for (int r=0; r < button.length; r++)
        {
            for(int c=0; c < button[r].length; c++)
            {

                button[r][c] = new JButton();

                button[r][c].setBorderPainted(true);
                Character temp = map.getCharacterAt(r,c);
                if(temp != null)
                {
                    button[r][c].setIcon(temp.getPic());
                }
                frame.add(button[r][c]);
            }
        }
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
}