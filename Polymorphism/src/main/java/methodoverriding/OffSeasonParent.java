package methodoverriding;

public class OffSeasonParent
{
	int r;
	int d;
	int t;
public void discount()
{
	r=100;
	d=15/100;
	t=r*d;
	if(t<=0)
	{
		System.out.println("discount is 15%");
	}
	else
	{
		System.out.println("no discount");
	}
}
}