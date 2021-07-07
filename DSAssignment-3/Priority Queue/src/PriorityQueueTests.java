import static org.junit.Assert.*;

import org.junit.Test;


public class PriorityQueueTests {

	PriorityQueue priority = new PriorityQueue(6);

	@Test
	public void isEmptytest() 
	{
		assertEquals(true, priority.isEmpty());
		priority.insert("job1",1);


		assertEquals(false, priority.isEmpty());

		priority.remove();

		assertEquals(true, priority.isEmpty());
	}

	@Test
	public void isFulltest() 
	{
		assertEquals(false, priority.isFull());
		priority.insert("job1",1);
		priority.insert("job2",2);
		priority.insert("job3",3);
		priority.insert("job4",4);
		priority.insert("job5",5);
		priority.insert("job6",6);
		assertEquals(true, priority.isFull());
	}

	@Test
	public void sizetest()
	{
		assertEquals(0, priority.size());
	}


}
