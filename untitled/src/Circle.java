public class Circle {
    private Point Centre = new Point();
    private Point point = new Point();

    public void setCentreXY(double x,double y) {
        Centre.setX(x);
        Centre.setY(y);
    }
    public void setPointXY(double x,double y)
    {
        point.setX(x);
        point.setY(y);
    }
    public String toString1()
    {
        return "Centre {" +
                "x= " + Centre.getX() +
                ", y= "+ Centre.getY() + "}";
    }
    public String toString2()
    {
        return "Point {" +
                "x= " + point.getX() +
                ", y= "+ point.getY() + "}";
    }
    public Circle() {
    }
}
