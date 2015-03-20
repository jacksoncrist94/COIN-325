package lab11;

public class Rectangle extends Shape2D{
	
	private double width, height;
	
	public Rectangle(double h, double w){
		height = h;
		width = w;
		angles = 4;
	}
	
	public double getArea(){
		return height * width;
	}
	
	public double getCircumference(){
		return (2 * height) + (2 * width);
	}
	
}