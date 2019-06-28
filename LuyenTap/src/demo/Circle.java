package demo;

/**
 * Created by FPT on 6/26/2019 at 4:17 PM.
 */
public class Circle {
    private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Ban kinh: " + radius;
    }
}
