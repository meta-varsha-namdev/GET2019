import java.util.List;


public interface Dictionary 
{
	boolean add(Node node);
	
	boolean delete(String key);
	
	String getValue(String key);
	
	List<String> getSortedList();
	
	List<String> getSortedList( String key1, String key2);
}
