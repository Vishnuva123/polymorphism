package aggregation;

public class Child 
{
	public Child(String n1,int id1,Parent p)
	{
		System.out.println("parent class is"+ p.name);
		System.out.println("parent class is"+ p.id);
		System.out.println("parent class is"+ n1);
		System.out.println("parent class is"+ id1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent add=new Parent("vishnu",100);
Child plus=new Child("ajitha",200,add);
	}

}
