package Inlab;

public class MyPoint {
    private double x;
    private double y;

    // No-arg constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x-coordinate
    public double getX() {
        return x;
    }

    // Getter for y-coordinate
    public double getY() {
        return y;
    }

    // Method to compute the distance to another MyPoint
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    // Method to compute the distance to a point with specified coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Test program
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(); // (0, 0)
        MyPoint p2 = new MyPoint(10, 30.5);

        // Display distance between p1 and p2
        System.out.println("Distance between points: " + p1.distance(p2));
    }
}

