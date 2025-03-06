package main;

public class Test {

	public static void main(String[] args) {
		sealed interface Shape permits Circle, Rectangle { 
		    double area();
		}

		record Circle(double radius) implements Shape {
		    @Override
		    public double area() {
		        return Math.PI * radius * radius;
		    }
		}

		record Rectangle(double width, double height) implements Shape {
		    @Override
		    public double area() {
		        return width * height;
		    }
		}

		public class TestSealedRecords {
		    public static void main(String[] args) {
		        Shape shape = new Circle(3);
		        
		        String result = switch (shape) {
		            case Circle c -> "Circle with area: " + c.area();
		            case Rectangle r -> "Rectangle with area: " + r.area();
		        };

		        System.out.println(result);
		    }
		} 

	}

}
