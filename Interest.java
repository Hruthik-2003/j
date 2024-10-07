import java.util.*;

class FindInterest{

	private double principleAmount;
	private double rateOfIntersest;
	private int year;


	public FindInterest(double p,double r,int t)
	{
		this.principleAmount=p;
		this.rateOfIntersest=r;
		this.year=t;
	}

	public double simpleInterest()
	{
		return (principleAmount*rateOfIntersest*year)/100;
	}

}

/**
 * Interest
 */
public class Interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("principleAmount = ");
		double p = sc.nextDouble();
		System.out.print("rateOfIntersest = ");
		double r = sc.nextDouble();
		System.out.print("year = ");
		int t = sc.nextInt();

		FindInterest obj = new FindInterest(p, r, t);

		System.out.println("Simple interest is " + obj.simpleInterest());

		sc.close();
	}
}