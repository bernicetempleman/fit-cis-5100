//Programmer	: Bernice Templeman
//Date			: 10/10/2015
//Course		: CIS 5100
//Homework  	: 
//Exercise		: 8.4
//Description   : Class Rectangle
//				: with length & width default to 1
//				: methods to calculate perimeter & area
//				: set & get for length & width
//				: set verifies floating pt number larger than 0.0 and less than 20.0

public class Rectangle {
	
	private double length;
	private double width;
	
	//no-arg constructor: length & width default to 1
	public Rectangle()
	{
		this(1,1);
	}
	
	// Constructor with length, default width
	public Rectangle(int length)
	{
		this(length, 1);
	}
	
	// Constructor: length & width supplied
	public Rectangle(double length, double width) {
		
		if( length <= 0.0 || length >= 20.0)
			throw new IllegalArgumentException("Length must be greater than 0.0 and less than 20.0");
		
		if( width <= 0.0 || width >= 20.0)
			throw new IllegalArgumentException("Width must be greater than 0.0 and less than 20.0");
		
		this.length = length;	
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	// validate & set length
	public void setLength(double length) {
		
		if( length <= 0.0 || length >= 20.0)
			throw new IllegalArgumentException("Length must be greater than 0.0 and less than 20.0");
		
		this.length = length;
	}
	
	
	public double getWidth() {
		return width;
	}
	
	//validate & set width
	public void setWidth(double width) {
		
		if( width <= 0.0 || width >= 20.0)
			throw new IllegalArgumentException("Width must be greater than 0.0 and less than 20.0");
		
		this.width = width;
	}

	// calculate the perimeter of a rectangle
	public double perimeter()
	{
		
		return getLength() * 2 + getWidth() * 2;
	}
	
	//calculate the area of a rectangle
	public double area()
	{
		return getLength() * getWidth();
	}
	

}
