package com.company;

import java.util.ArrayList;

public class Map {
    private Tile[][] map;

    private Map(){}
    public Map(int rows, int cols)
    {
        map = new Tile[rows][cols];
        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                map[r][c] = new Tile();
            }
        }
    }

    public boolean placeCharacter(Character character, int row, int col)
    {
        return map[row][col].placeCharacter(character);
    }

    public Character getCharacterAt(int row, int col)
    {
        return map[row][col].getCharacter();
    }
}
