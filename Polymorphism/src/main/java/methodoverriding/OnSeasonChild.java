package methodoverriding;

public class OnSeasonChild extends OffSeasonParent
{
	int r;
	int d;
	int t;
	public void discount()
	{
	super.discount();	
	r=100;
	d=45/100;
	t=r*d;
	if(t<=0)
	{
		System.out.println("discount is 40%");
	}
	else
	{
		System.out.println("no discount");
	}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OnSeasonChild s=new OnSeasonChild();
		s.discount();
	}

}
