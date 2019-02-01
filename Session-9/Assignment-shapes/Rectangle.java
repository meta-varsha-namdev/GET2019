 class Rectangle implements Shape
 {
	 private double length, width;
	 private Point point;
	 private final String shape="rectangle";
	 public Rectangle(Point point,double length,double width)//passing arguments to constructor
	 {
	     	this.point = point;
	     	this.width = width;
	     	this.length = length;
	 }
	 public double getlength()//getting length of rectangle
	 {
	  	return this.length;
	 }
	 public double getwidth()//getting width of rectangle
	 {
	  	return this.width;
	 }
	 public String getType()// getting type of shape
	 {
	  	return this.shape;
	 }
	 @Override
	 public double getArea() // calculating area of the rectangle
	 {
	  	double area = length*width;
	  	return area;
	 }
	 @Override
	 public double getPerimeter() // calculating the perimeter of the rectangle
	 {
	  	double perimeter = 2*(length+width);
	  	return perimeter;
	 }
	 @Override
	 public Point getOrigin()// getting origin co-ordinates
	 {
	  	return this.point;
	 }
	 @Override
	 public boolean isPointEnclosed(Point point)// checking if the given point is enclosed by the rectangle
	 {
	   	if(point.getX()>this.point.getX() && point.getX()<this.point.getX()+length && point.getY()>this.point.getY() && point.getY()<this.point.getY()+width)
	   	return true;
	   	return false;
	 }
}
