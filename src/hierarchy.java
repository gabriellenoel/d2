
public class hierarchy {

    interface Shape {
        public void shapeName(); // interface method (does not have a body)
        public void shapeFeatures(); // interface method (does not have a body)
    }

    public static class Rectangle implements Shape {
        public void shapeName() {
            System.out.println("This shape is a circle.");
        }
        public void shapeFeatures() {
            System.out.println("This shape has four sides.");
        }
    }

    public static class Circle implements Shape {
        public void shapeName() {
           System.out.println("This shape is a circle.");
        }
        public void shapeFeatures() {
            System.out.println("This shape is round.");
        }
    }

    public static class Triangle implements Shape {
        public void shapeName() {
            System.out.println("This shape is a triangle.");
        }
        public void shapeFeatures() {
            System.out.println("This shape has three sides.");
        }
    }

        public static void main(String[] args) {
            Circle firstShape = new Circle();
            firstShape.shapeName();
            firstShape.shapeFeatures();
        }
}
