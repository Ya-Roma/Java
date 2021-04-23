package com.company;

public class Location
{
    public int xCoord;
    public int yCoord;

    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        else if (obj == null)
        {
            return false;
        }
        else if (this.getClass() != obj.getClass())
        {
            return false;
        }
        else
        {
            Location other = (Location)obj;
            if (this.xCoord != other.xCoord)
            {
                return false;
            }
            else
            {
                return this.yCoord == other.yCoord;
            }
        }
    }

    public int hashCode()
    {
        boolean prime = true;
        return 31 + this.xCoord;
    }
}