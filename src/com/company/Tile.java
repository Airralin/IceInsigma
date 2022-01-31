package com.company;

public class Tile {
    private TileType tileType;
    private Character character;

    public Tile()
    {
        this(TileType.PLAIN, null);
    }

    public Tile(TileType type)
    {
        this(type, null);
    }

    public Tile(TileType type, Character character)
    {
        tileType = type;
        this.character = character;
    }

    public TileType getTileType()
    {
        return tileType;
    }

    public Character getCharacter()
    {
        return character;
    }

    //checks for a character, if there isn't one it places the character on the tile
    public boolean placeCharacter(Character character)
    {
        if(this.character == null && character != null)
        {
            this.character = character;
            return true;
        }

        return false;
    }

    public void deleteCharacter()
    {
        this.character = null;
    }

}
