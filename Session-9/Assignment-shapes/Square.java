public class Square implements Shape
{
	private double length;
	 private Point point;
	 private final String shape="square";
	 public Square(Point point,double length)// passing the arguments to the constructor
	 {
	     this.point = point;
	     this.length = length;
	 }
	 public double getlength()// getting the length of the side of the square
	 {
	  return this.length;
	 }
	 public String getType()// getting the type of the shape
	 {
	  return this.shape;
	 }
		@Override
	 public double getArea()// calculating the area of the square
	 {
	  double area = length*length;
	  return area;
	 }
		@Override
	 public double getPerimeter()// getting the perimeter of the square
	 {
	  double perimeter = 4*length;
	  return perimeter;
	 }
		@Override
	 public Point getOrigin()// getting the origin of the square
	 {
	  return this.point;
	 }
		@Override
	 public boolean isPointEnclosed(Point point)// checking if the given point is enclosed by the square or not
	 {
	   if(point.getX()>this.point.getX() && point.getX()<this.point.getX()+length && point.getY()>this.point.getY() && point.getY()<this.point.getY()+length)
	   return true;
	   return false;
	 }
}