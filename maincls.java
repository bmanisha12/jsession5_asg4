class RBI
{
	protected void roi(double p, double n)
	{double r=2.3;
		System.out.println("Simple interest calculated by RBI is: " +(p*n*r));
	}
}
class BOI extends RBI
{ 
	protected void roi(double p, double n)
	{double r=3.5;
		System.out.println("Simple interest calculated by BOI is: " +(p*n*r));
	}
	 }
class SBI extends RBI
{
	protected void roi(double p, double n)
	{double r=5.6;
		System.out.println("Simple interest calculated by SBI is: " +(p*n*r));
	}
	 }


public class maincls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI i = new RBI();
		i.roi(2300,2);
		RBI b = new BOI();
		b.roi(2300,2);
		RBI s = new SBI();
		s.roi(2300,2);

	}

}
