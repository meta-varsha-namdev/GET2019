public class Triangle implements Shape
{
	 private double length_1, length_2, length_3;
	 private Point point;
	 private final String shape="triangle";
	 public Triangle(Point point,double length_1, double length_2, double length_3)// passing the arguments to the constructor
	 {
	     this.point = point;
	     this.length_1=length_1;
	     this.length_2=length_2;
	     this.length_3=length_3;
	 }
	// getting the length of the three sides of the triangle
	 public double getlength_1()
	 {
	  return this.length_1;
	 }
	 public double getlength_2()
	 {
	  return this.length_2;
	 }
	 public double getlength_3()
	 {
	  return this.length_3;
	 }
	 
	 public String getType()// getting the type of the shape
	 {
	  return this.shape;
	 }
		@Override
	 public double getArea()//calculating the area of the triangle
	 {
      double semiperimeter=(length_1+length_2+length_3)/2;//calculating the semi-perimeter
	  double area =Math.pow(((semiperimeter)*(semiperimeter-length_1)*(semiperimeter-length_2)*(semiperimeter-length_3)),0.5);//Heron's formula
	  return area;
	 }
		@Override
	 public double getPerimeter()// calculating the perimeter of the triangle
	 {
	  double perimeter = (length_1+length_2+length_3);
	  return perimeter;
	 }
		@Override
	 public Point getOrigin()// getting the origin of the triangle
	 {
	  return this.point;
	 }
		@Override
	 public boolean isPointEnclosed(Point point)//checking if the given point is enclosed by the triangle or not
	 {
	   
	 }
}