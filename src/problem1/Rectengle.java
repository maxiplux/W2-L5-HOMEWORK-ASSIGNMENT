package problem1;

public class Rectengle extends Shape {

	double  width;
	double height;
	
	
	
	public Rectengle(double width, double height,String color ) {
		super(color);
		this.width = width;
		this.height = height;
	}
	double calcualteArea()  {
		return this.width * this.height;	
	}
	double calculatePerimeter() {
		return 2*this.width + 2* this.height;	
		
	} 
	
}
