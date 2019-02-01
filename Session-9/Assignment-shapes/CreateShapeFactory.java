import java.util.List;
public class CreateShapeFactory
{
	public static Shape createShape(Shape.ShapeType shape ,Point point, List<Double> parameters)
 	{
  		Shape createshape = null;
  		switch(shape)
  		{
			case rectangle:
	   		{
	   			createshape=new Rectangle(point, parameters.get(0),parameters.get(1));
	   			break;  
	   		}
	  		case square:
	  		{
	   			createshape=new Square(point, parameters.get(0));
	   			break;
	  		}
	  		case circle:
	  		{
	   			createshape=new Circle(point, parameters.get(0));
	   			break;
	  		}
	  		case triangle:
	  		{
	   			createshape=new Triangle(point,parameters.get(0),parameters.get(1),parameters.get(2));
	   			break;
	  		}
	  		default:
	  		{
				System.out.println("Entered shape is not found in library");
				break;
	  		}
  		}
  		return createshape;
 	}
}
