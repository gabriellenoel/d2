
public class hierarchy {

    interface Shape {
        public float calculateArea(); // interface method (does not have a body)
        public void display(); // interface method (does not have a body)
    }

    public static class Rectangle implements Shape {
        private float length, width;

        public Rectangle(float length, float width) {
            this.length = length;
            this.width = width;
        }

        public float calculateArea() {
            return length*width;
        }
        public void display() {
            System.out.println("The rectangle length is " + length + " and the width is " + width);
            System.out.println("The area of this rectangle is: " + calculateArea());
        }
    }

    public static class Circle implements Shape {
        private float radius;

        public Circle(float radius) {
            this.radius = radius;
        }

        public float calculateArea() {
            return (float) Math.PI * (radius * radius);
        }
        public void display() {
            System.out.println("The radius of the circle is " + radius);
            System.out.println("The area of circle is " + calculateArea());
        }
    }

    public static class Triangle implements Shape {

        private float base, height;

        public Triangle(float base, float height) {
            this.base = base;
            this.height = height;
        }

        public float calculateArea() {
            return (base * height)/2;
        }
        public void display() {
            System.out.println("The triangle width is " + base + " and the height is " + height);
            System.out.println("The area of the triangle is " + calculateArea());
        }
    }

        public static void main(String[] args) {

                Triangle triangle = new Triangle(5, 5);
                triangle.display();

                Rectangle rect = new Rectangle(5,5);
                rect.display();

                Circle circle = new Circle(5);
                circle.display();
            }
        }
