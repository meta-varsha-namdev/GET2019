public class Circle implements Shape
{
	private double radius;
	 private Point point;
	 private final String shape="circle";
	 double PI=3.1415;
	 public Circle(Point point,double length)//passing arguments to the constructor
	 {
	     this.point = point;
         this.radius = length;
	 }
	 public double getradius()// getting radius of the circle
	 {
	  return this.radius;
	 }
     public String getType()// getting type of the shape
	 {
	  return this.shape;
	 }
		@Override
	 public double getArea()// calculating the area of the circle
	 {
	  double area = PI*radius*radius ;
	  return area;
	 }
		@Override
	 public double getPerimeter()// calculating the perimeter of the circle
	 {
	  double perimeter = 2*PI*radius;
	  return perimeter;
	 }
		@Override
		public Point getOrigin()// getting the point on the circle which lie on the line joining the center of the circle and the origin of the screen
	 {
	  
	 }
		@Override
	 public boolean isPointEnclosed(Point point)// checking if the given point is enclosed by the circle or not
	 {
		double radius_2=Math.sqrt(Math.pow((this.point.getX()-point.getX()),2)+Math.pow((this.point.getY()-point.getY()),2));
		if(radius_2<radius)
		return true;
		return false;
	   
	 }
}