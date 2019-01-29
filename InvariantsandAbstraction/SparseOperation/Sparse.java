public final class Sparse
{
	private final int[][] matrix;
	
	public Sparse(int matrix[][])
	{
		this.matrix=matrix;
	}
	
	public int[][] transpose()
	{
		int length= this.matrix.length;
		
		int[][] transpose_matrix= new int[length][length];
		for(int row=0; row<length;row++)
		{
			for(int column=0; column<length; column++)
			transpose_matrix[column][row]=matrix[row][column];
		}
		return transpose_matrix;
	}
	
	public boolean symmetry()
	{
		int flag=0;
		for(int row=0,column=0; row<this.matrix.length && column<this.matrix.length; row++,column++)
		{
			if(this.matrix[row][column]==this.matrix[column][row])
				flag=1;
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
	public int[][] add(int matrix_2[][])
	{
		int[][] matrix_add= new int[this.matrix.length][this.matrix.length];
		for( int row=0; row<this.matrix.length;row++)
		{
			for( int column=0; column<this.matrix.length;column++)
				matrix_add[row][column]=this.matrix[row][column]+matrix_2[row][column];
		}
		return matrix_add;
	}
	
	public int[][] multiply(int matrix_3[][])
	{
		int[][] matrix_multiply= new int[this.matrix.length][this.matrix.length];
		
		for( int row=0; row<this.matrix.length;row++)
		{
			for( int column=0; column<this.matrix.length;column++)
			{
				matrix_multiply[row][column]=0;
				for(int index=0; index<this.matrix.length; index++)
				{
					matrix_multiply[row][column]= matrix_multiply[row][column]+this.matrix[row][index]*matrix_3[index][column];
				}
			}
		}
		return matrix_multiply;
	}
}