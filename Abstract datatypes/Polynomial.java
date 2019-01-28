public final class Polynomial 
{
	private final int coefficients[];
	public Polynomial(int[] coefficients)
	{
		this.coefficients=coefficients;
	}
	// calculating degree of polynomial
	public int degree()
	{
		return(this.coefficients.length)-1;
	}
	//evaluating the value of polynomial
	 public float evaluate(float value)
	 {
		double result=0;
		float result_is=0;
		double Value= (double)value;
		for(int index=0; index<=this.degree(); index++)
		{
			result=result+(coefficients[index]*(Math.pow(Value,index)));
		}
		return result_is=(float)result;
	 }
	 //Addition of two polynomials
	 public Polynomial add(Polynomial poly1)
	 {
		 int size= this.degree()>poly1.degree()? (this.degree()+1): (poly1.degree()+1);
		 int[] add= new int[size];
		 for(int index=0; index<=this.degree();index++)
		 {
			 add[index]=this.coefficients[index];
		 }
		 for(int index=0; index<=poly1.degree();index++)
		 {
			 add[index]=add[index]+poly1.coefficients[index];
		 }
		 return new Polynomial(add);
	 }
	 //Multiplcation of two polynomials:
	 public Polynomial multiply(Polynomial poly1)
	 {
		 int size=this.degree()+poly1.degree()+1;
		 int product[] =new int[size];
		 for(int index=0; index<size;index++)
			 product[index]=0;
		 for(int index=0; index<=this.degree();index++)
		 {
			 for(int index_1=0; index_1<=poly1.degree();index_1++)
			 {
				 product[index+index_1]= product[index+index_1]+this.coefficients[index]*poly1.coefficients[index_1];
			 }
		 }
		 return new Polynomial(product);
	 }
	 //To print a polynomial with variable representation
	 void printPolynomial()
	 {
		 for(int index=0; index<=this.degree();index++)
		 {
			 System.out.print(this.coefficients[index]);
			 if(index!=0)
				 System.out.print("x^"+index);
			 if(index!=this.degree())
			 {
				 System.out.print("+");
			 }
		 }
	 }
}
