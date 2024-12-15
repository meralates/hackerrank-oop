
//https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
public class Main {
    interface GeometricShape {
        double area();
    }
    static class Circle implements GeometricShape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }
    static class Rectangle implements GeometricShape {
        private double length;
        private double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        public double area() {
            return length * width;
        }
    }
    public static void main(String[] args) {
        GeometricShape circle = new Circle(2.0);
        GeometricShape rectangle = new Rectangle(3.0, 4.0);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}