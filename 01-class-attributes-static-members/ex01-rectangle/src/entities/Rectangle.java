package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return height*width;
	}
	public double perimeter() {
		return (width*2) + (height*2);
	}
	public double diagonal() {
		return Math.sqrt((width*width) + (height*height));
	}
	public String toString() {
		return "Area = " + String.format("%.2f", area() )+ "\n"
				+ "PERIMETER = " + String.format("%.2f", perimeter()) + "\n"
				+ "DIAGONAL = " + String.format("%.2f",  diagonal());	
	}
}
