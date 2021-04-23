package com.company;

public class Waypoint
{
    Location loc;//Местоположение этой путевой точки
    Waypoint prevWaypoint;//Предыдущая путевая точка на этом пути
    private float prevCost;//Общая предыдущая стоимость
    private float remainingCost;//оценка оставшейся стоимости поездки

    public Waypoint(Location loc, Waypoint prevWaypoint)//новая путевая точка для указанного места
    {
        this.loc = loc;
        this.prevWaypoint = prevWaypoint;
    }

    public Location getLocation()//местоположение путевой точки
    {
        return loc;
    }

    public Waypoint getPrevious()
    {
        return prevWaypoint;
    }

    public void setCosts(float prevCost, float remainingCost)
    {
        this.prevCost = prevCost;
        this.remainingCost = remainingCost;
    }

    public float getPreviousCost()//Возвращает фактическую стоимость перехода к этой точке
    {
        return prevCost;
    }

    public float getRemainingCost()//Возвращает оценку оставшейся стоимости поездки
    {
        return remainingCost;
    }

    public float getTotalCost()//Возвращает общую оценку стоимости данной путевой точки
    {
        return prevCost + remainingCost;
    }
}
