package rectangle.area.perimeter;
public class TestRectangle {
	public static void main(String[] args) {
		// object of Rectangle.
		Rectangle rectangle = new Rectangle();
		// Details of default rectangle.
		System.out.println("Default Rectangle: ");
		System.out.println("Length : " + rectangle.getLength());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area Of Rectangle : " + rectangle.getArea());
		System.out.println("Perimeter Of Rectangle : " + rectangle.getPerimeter());
		System.out.println("  ");
		// set values of length and width and update rectangle.
		rectangle.setLength(16.9);
		rectangle.setWidth(12.9);
		// Details of updated rectangle.
		System.out.println("Updated Rectangle: ");
		System.out.println("Length : " + rectangle.getLength());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area Of Rectangle : " + rectangle.getArea());
		System.out.println("Perimeter Of Rectangle : " + rectangle.getPerimeter());
	}
}
