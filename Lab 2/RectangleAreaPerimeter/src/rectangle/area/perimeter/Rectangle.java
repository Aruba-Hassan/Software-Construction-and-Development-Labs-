package rectangle.area.perimeter;
public class Rectangle {
	double length;
	double width;
	// Default value of length and width.
	public Rectangle() {
		this.length = 1;
		this.width = 1;}
	// Parameterized Constructor.
	public Rectangle(double length , double width) {
		this.length = length;
		this.width = width;}
	// Method for perimeter of rectangle.
	public double getPerimeter() {
		return 2 * (length + width);}
	// Method for area of rectangle.
	public double getArea() {
		return length * width;}
	// getLength method.
	public double getLength() {
		return length;}
	// getArea method.
	public double getWidth() {
		return width;	}
	// set length of rectangle between 0.0 to 20.0.
	public void setLength(double length) {
		if(length > 0.0 && length < 20.0) {
			this.length = length;
		}else {
			System.out.println("Length must be greater than 0.0 and less than 20.0. ");}}
	// set area of rectangle between 0.0 to 20.0.
	public void setWidth(double width) {
		if(width > 0.0 && width < 20.0) {
			this.width = width;
		}else {
			System.out.println("Width must be greater than 0.0 and less than 20.0. ");
		}
	}
}
