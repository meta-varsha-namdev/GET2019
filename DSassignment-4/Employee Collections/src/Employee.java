
public class Employee 
{
	String name;
	static int id=0;
	private int employee_id;
	String address;
	
	Employee(String name, String address)
	{
		this.name=name;
		this.address=address;
		this.employee_id=getIdInstance();
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getIdInstance()
	{
		return id++;
	}
	
	public String toString()
	{
	return "[id=" + this.employee_id + ", name=" + this.name + ", address=" + this.address + "]";
	}
	
}
