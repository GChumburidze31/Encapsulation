package Circle;

public class Circle {

    private double radius = 1;  // Instance Fields
    private int numberOfObjects = 0;
    // ******************************************************
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
        numberOfObjects++;
    }
    //***************************************************************

    public double getRadius() {return radius;}

    public void setRadius(double radius) {

        this.radius = (radius >= 0) ? radius : 0;

    }

    public int getNumberOfObject() {
        return numberOfObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
