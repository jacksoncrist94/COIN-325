package lab11;

public class Circle extends Shape2D{
	
	double mRadius;
	
	public Circle(double radius){
		mRadius = radius;
		angles = 0;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(mRadius, 2);
	}
	
	public double getCircumference(){
		return 2 * Math.PI * mRadius;
	}
	
}