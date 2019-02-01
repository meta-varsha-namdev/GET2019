import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
public class GraphicsTest 
{
	List<Double> dimension = new ArrayList<Double>();
    	double area, perimeter;
    	boolean enclosed;
    	Screen screen = new Screen();

    	@Test
    	public void testSquare()
    	{
		//origin of shape on screen new Point(xCordinates,yCordinates)
		Point point = new Point(5.0,5.0);

		//side of square=5 adding to 0th index of list
		dimension.add(5.0);

		//creating square shape from shape factory
		Shape shapeSquare = CreateShapeFactory.createShape(Shape.ShapeType.square, point,dimension);

		//calculating area of Square
		area = shapeSquare.getArea();
		assertEquals(25.0, area, 0.002);

		//calculating perimeter of square
		perimeter = shapeSquare.getPerimeter();
		assertEquals(20, perimeter, 0.002);

		//checking point inclusion in 
		enclosed = shapeSquare.isPointEnclosed(new Point(11.0,11.0));
		assertEquals(false, enclosed);
		enclosed = shapeSquare.isPointEnclosed(new Point(2.0,3.0));
		assertEquals(false, enclosed);
		enclosed = shapeSquare.isPointEnclosed(new Point(8.0,8.0));
		assertEquals(true, enclosed);

		//adding shape to screen
		screen.addShape(shapeSquare);
   	}
    
    	@Test
     	public void testRectangle() 
    	{
         
		 //origin of shape on screen new Point(xCordinates,yCordinates)
		 Point point = new Point(5.0,5.0);

		 //width and height of rectangle
		 dimension.add(5.0);
		 dimension.add(6.0);

		 //creating Rectangle shape from shape factory
		 Shape shapeRectangle = CreateShapeFactory.createShape(Shape.ShapeType.rectangle, point, dimension);

		     //calculating area of Rectangle
		 area = shapeRectangle.getArea();
		 assertEquals(30.0, area, 0.002);

		 //calculating perimeter of Rectangle
		 perimeter = shapeRectangle.getPerimeter();
		 assertEquals(22.0, perimeter, 0.002);

	       //checking point inclusion in Rectangle
		 enclosed = shapeRectangle.isPointEnclosed(new Point(1.0,1.0));
		 assertEquals(false, enclosed);
		 enclosed = shapeRectangle.isPointEnclosed(new Point(11.0,11.0));
		 assertEquals(false, enclosed);
		 enclosed = shapeRectangle.isPointEnclosed(new Point(8.0,8.0));
		 assertEquals(true, enclosed);
		 enclosed = shapeRectangle.isPointEnclosed(new Point(10.0,11.0));
		 assertEquals(false, enclosed);

		 screen.addShape(shapeRectangle);
    	}
	
    	@Test
    	public void testTriangle() 
   	{
		//origin of shape on screen new Point(xCordinates,yCordinates)
		Point point = new Point(5.0,5.0);

		//3 sides of triangle
		dimension.add(2.0);
		dimension.add(3.0);
		dimension.add(4.0);

		//creating Triangle shape from shape factory
		Shape shapeTriangle = CreateShapeFactory.createShape(Shape.ShapeType.triangle, point, dimension);

			  //calculating area of Triangle
		area = shapeTriangle.getArea();
		assertEquals(2.9047, area, 0.002);

		//calculating perimeter of Triangle
		perimeter = shapeTriangle.getPerimeter();
		assertEquals(9.0, perimeter, 0.002);
	}
	
    	@Test
    	public void testCircle() 
    	{
       
		//origin of shape on screen new Point(xCordinates,yCordinates)
		Point point = new Point(5.0,5.0);

		//radius of circle
		dimension.add(3.0);

		//creating Circle shape from shape factory
		Shape shapeCircle = CreateShapeFactory.createShape(Shape.ShapeType.circle, point, dimension);

			  //calculating area of Circle
		area = shapeCircle.getArea();
		assertEquals(28.274, area, 0.002);

		//calculating perimeter of Circle
		perimeter = shapeCircle.getPerimeter();
		assertEquals(18.849, perimeter, 0.002);

		//checking point inclusion in Circle
		enclosed = shapeCircle.isPointEnclosed(new Point(1.0,1.0));
		assertEquals(false, enclosed);
		enclosed = shapeCircle.isPointEnclosed(new Point(11.0,11.0));
		assertEquals(false, enclosed);
		enclosed = shapeCircle.isPointEnclosed(new Point(3.0,3.0));
		assertEquals(true, enclosed);
		enclosed = shapeCircle.isPointEnclosed(new Point(10.0,11.0));
		assertEquals(false, enclosed);

		screen.addShape(shapeCircle);
    	}
}
