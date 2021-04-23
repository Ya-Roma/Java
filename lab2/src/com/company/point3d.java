package com.company;

public class point3d
{
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public point3d ( double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public point3d ()
    {
        this(0, 0, 0);
    }
    public double getX ()
    {
        return xCoord;
    }
    public double getY ()
    {
        return yCoord;
    }
    public double getZ ()
    {
        return zCoord;
    }
    public void setX ( double val)
    {
        xCoord = val;
    }
    public void setY ( double val)
    {
        yCoord = val;
    }
    public void setZ ( double val)
    {
        zCoord = val;
    }
    public boolean Comparison ( point3d point1, point3d point2)
    {
        boolean Bool = false;
        if(point1.xCoord == point2.xCoord && point1.yCoord == point2.yCoord &&
                point1.zCoord == point2.zCoord)
            Bool = true;

        return Bool;
    }

    public point3d distanceTo ( point3d point1, point3d point2, point3d point3)
    {
        double x = (point1.xCoord - point2.xCoord);
        double y = (point1.yCoord - point2.yCoord);
        double z = (point1.zCoord - point2.zCoord);
        return new point3d(Math.sqrt(x*x), Math.sqrt(y*y), Math.sqrt(z*z));
    }

    public double computeArea ( point3d point1, point3d point2, point3d point3)
    {
        if(Comparison(point1, point2) || Comparison(point1, point3) || Comparison(point2, point3))
            return 0;

        point3d side = distanceTo(point1, point2, point3);
        double a = side.xCoord;
        double b = side.yCoord;
        double c = side.zCoord;

        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
