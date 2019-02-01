import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Screen 
{
  private List<ScreenElements> screenElements=new ArrayList<ScreenElements>();// list for storing shape objects
  private List<Double> shapeArea=new ArrayList<Double>();// list for storing the area of the created shapes
  private List<Double> shapePeri=new ArrayList<Double>();// list for storing the perimeter of the created shapes
  
  // returning screen elements
  public List<ScreenElements> getScreenElements()
  {
	return screenElements;
  }
  // adding shapes on screen
  public void addShape(Shape shape)
  {
   screenElements.add(new ScreenElements (shape));
   shapeArea.add(shape.getArea());
   shapePeri.add(shape.getPerimeter());
  }
  // deleting given shape
  public void deleteShape(int index)
  {
   screenElements.remove(index);
   shapeArea.remove(index);
   shapePeri.remove(index);
  }
  // deleting shapes of a specified type 
  public void deleteAllShapesOfType(String shape_type) throws Exception
  {
   Iterator<ScreenElements> element = screenElements.iterator();
   checkForEmptyAndThrowException();
    while(element.hasNext())
  	{
     ScreenElements shapeGet = element.next();
  	 if(shape_type.equals(shapeGet.getShape()))
  	 screenElements.remove(shapeGet);
  	}  	
  }
  // returning objects in ascending order
 
  // exception handling
  public void checkForEmptyAndThrowException() throws Exception {
      if (screenElements.size() == 0) {
          System.out.println("List of Shapes Empty");
          throw new Exception("!! Empty !!");
      }
  }
}