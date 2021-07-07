import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONObject;


public class NestedListOperation implements NestedList
{
	private List<Object> object_list=new ArrayList<>();
	private JSONObject jsonObject;
	
	NestedListOperation(JSONObject JSONObject)
	{
		if(JSONObject!=null)
		{
			this.jsonObject=JSONObject;
		}
		
	}
	
	public void createNestedList()
	{
		if(jsonObject!=null)
		{
			this.object_list=createNestedListRecursion(jsonObject);
		}
		else
		{
			throw new NullPointerException("empty json object");
		}
	}
	
	public List<Object> createNestedListRecursion(JSONObject jsonObject)
	{
		LinkedList<Object> nested_list=new LinkedList<>();
		try
		{
			for(Object key:jsonObject.keySet())
			{
				if(key !=null)
				{
					if(jsonObject.get(key) instanceof Long)
					{
						long value = (Long) jsonObject.get(key);
						nested_list.add(value);
					}
					else
					{
						JSONObject newJson = (JSONObject) jsonObject.get(key);
						List<Object> list_json = createNestedListRecursion(newJson);
						nested_list.add(list_json);
					}
				}
				else
				{
					throw new NullPointerException("Empty json object");
				}
			}
			return nested_list;
		}
		catch (NullPointerException e)
		{
            throw new NullPointerException("Empty key value");
        }
	}
	
	@Override
    public long sumOfList() {
        if (object_list != null) {
            return sumOfAllValues(object_list);
        } else {
            throw new AssertionError("Empty nested list");
        }

    }

    /**
     * private helper method to get the sum of all values of nested list
     * 
     * @param nestedList whose value's sum is to be calculated
     * @return sum of all values of nested list
     * @throws Assertion error
     */
    private long sumOfAllValues(List<Object> object_list) {
        long sum = 0;
        for (Object object : object_list) {
            if (object instanceof List) {
                sum += sumOfAllValues((List<Object>) object);
            } else if (object instanceof Long) {
                sum += (long) object;
            } else {
                throw new AssertionError("Invalid Input");
            }
        }
        return sum;
    }

    @Override
    public long findLargest() {
        if (object_list != null) {
            return largestValue(object_list);
        } else {
            throw new AssertionError("Empty nested list");
        }
    }

    /**
     * largest value from nested list
     * 
     * @param nestedList whose largest value is to be find
     * @return largest value of nested list
     * @throws Assertion error
     */

    private long largestValue(List<Object> nestedList) {

        long max = 0;
        long temp = 0;
        for (Object object : nestedList) {
            if (object instanceof List) {
                temp = largestValue((List<Object>) object);
            } else if (object instanceof Long) {
                temp = (long) object;
            } else {
                throw new AssertionError("Invalid Input");
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    @Override
    public boolean searchValue(int element) {
        if (object_list != null) {
            return searchValue(object_list, element);
        } else {
            throw new AssertionError("Empty nested list");
        }
    }

    /**
     * search value in nested list
     * 
     * @param nestedList in which element is to be searched
     * @param element    which is to be searched in list
     * @return true if element is present in list else false
     */
    private boolean searchValue(List<Object> nestedList, int element) {

        for (Object object : nestedList) {
            if (object instanceof List) {
                if (searchValue((List<Object>) object, element)) {
                    return true;
                }
            } else if (object instanceof Long) {
                if ((long) object == element) {
                    return true;
                }
            } else {
                throw new AssertionError("Invalid Input");
            }

        }
        return false;
    }

}
