package lab11;

public class RightTriangle extends Shape2D{
	
	private double sideA, sideB, hyp;
	
	
	
	public RightTriangle(double sA, double sB){
		sideA = sA;
		sideB = sB;
		hyp = (double) Math.sqrt((Math.pow(sA, 2)) + (Math.pow(sB, 2)));
		angles = 3;
	}
	
	public double getArea(){
		return  (sideA * sideB) / 2.0;
	}
	
	public double getCircumference(){
		return sideA + sideB + hyp;
	}
	
}