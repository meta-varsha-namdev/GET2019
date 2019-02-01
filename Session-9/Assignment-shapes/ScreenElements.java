import java.util.Date;
public class ScreenElements 
{
	private Shape shape;
    	private Date timestamp;

    	public ScreenElements(Shape shape)
    	{
        	this.shape = shape;
       	 	timestamp = new Date();
    	}
    	public Date getDate()
    	{
    		return this.timestamp;
    	}
    
    	public Shape getShape()
    	{
    		return shape;
    	}
}
