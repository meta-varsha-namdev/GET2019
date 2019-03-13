import static org.junit.Assert.*;

import org.junit.Test;


public class CompoundTests {

	Compound mole = new Compound();
	
	@Test
	public void test() 
	{
		assertEquals(16, mole.solveCompound("CH4"));
		assertEquals(44, mole.solveCompound("CO2"));
		assertEquals(86, mole.solveCompound("CHOC(CH3)3"));
		assertEquals(28, mole.solveCompound("CO"));
		assertEquals(198, mole.solveCompound("CO(OH)10"));
		assertEquals(398, mole.solveCompound("CO(O2H5)10"));
	}

}
