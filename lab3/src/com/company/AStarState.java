package com.company;

import java.util.HashMap;
import java.util.Iterator;

public class AStarState
{
    private Map2D map;
    private HashMap<Location, Waypoint> open = new HashMap();
    private HashMap<Location, Waypoint> close = new HashMap();

    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    public Map2D getMap()
    {
        return this.map;
    }

    public Waypoint getMinOpenWaypoint()
    {
        if (this.open.size() == 0)
        {
            return null;
        }
        else
        {
            Waypoint[] massWaypoin = new Waypoint[this.numOpenWaypoints()];
            int i = 0;

            for(Iterator var4 = this.open.values().iterator(); var4.hasNext(); ++i) {
                Waypoint a = (Waypoint)var4.next();
                massWaypoin[i] = a;
            }

            Waypoint min = massWaypoin[0];

            for(i = 1; i < this.numOpenWaypoints(); ++i)
            {
                if (massWaypoin[i].getTotalCost() < min.getTotalCost())
                {
                    min = massWaypoin[i];
                }
            }

            return min;
        }
    }

    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Location newLoc = newWP.getLocation();
        Waypoint w = (Waypoint)this.open.get(newLoc);
        if (w != null && !(newWP.getPreviousCost() < w.getPreviousCost())) {
            return false;
        } else {
            this.open.put(newLoc, newWP);
            return true;
        }
    }

    public int numOpenWaypoints()
    {
        return this.open.size();
    }

    public void closeWaypoint(Location loc)
    {
        this.close.put(loc, (Waypoint)this.open.get(loc));
        this.open.remove(loc);
    }

    public boolean isLocationClosed(Location loc)
    {
        return this.close.containsKey(loc);
    }
}