public interface Shape 
{
	public double getArea();
	public double getPerimeter();
	public Point getOrigin();
	public boolean isPointEnclosed(Point point);
	public String getType();
	// creating enum function for the shapes which can be created
	public enum ShapeType
	{
		rectangle,square,circle,triangle;
	}
}
