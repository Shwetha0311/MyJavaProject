package Practice;

public class Person {
	String name, email; long ph_num;
	public Person(String name,String email,long ph_num)
	
	{
		
	}
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
}
class Student extends Person
{
	String college;int yearofpassing;
}
class employee extends Person
{
	String company,designation; int salary;
	public void printempdetails()
	{
		System.out.println("Name"+name);
		System.out.println("Email"+email);
		System.out.println("Phone number"+ph_num);
		System.out.println("Company"+company);
		System.out.println("Designation"+designation);
		System.out.println("Salary"+salary);

	}

}



