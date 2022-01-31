package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Map {
    private Tile[][] map;
    private JButton buttons[][];
    private GridLayout grid;
    private JFrame mapFrame;


    private Map(){}
    public Map(int rows, int cols)
    {
        map = new Tile[rows][cols];
        buttons = new JButton[rows][cols];
        grid = new GridLayout(rows, cols);
        mapFrame = new JFrame();
        mapFrame.setLayout(grid);

        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                map[r][c] = new Tile();
                buttons[r][c] = new JButton();
                buttons[r][c].setBorderPainted(true);
                mapFrame.add(buttons[r][c]);
            }
        }
    }

    public boolean placeCharacter(Character character, int row, int col)
    {
        if(map[row][col].placeCharacter(character))
        {
            buttons[row][col].setIcon(character.getPic());
            return true;
        }
        return false;
    }

    public Character getCharacterAt(int row, int col)
    {
        return map[row][col].getCharacter();
    }

    public JFrame getMapFrame()
    {
        return mapFrame;
    }
}
