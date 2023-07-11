package aggregation;

public class Address
{
	public Address(String address,Student s)
	{
		System.out.println("Name is "+ s.name);
		System.out.println("Roll No is "+ s.rollno);
		System.out.println("Address is "+ address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("vishnu",25);
Address s2=new Address("athira villa",s1);

	}

}
