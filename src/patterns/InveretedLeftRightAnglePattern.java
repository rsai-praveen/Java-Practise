package patterns;

public class InveretedLeftRightAnglePattern {

	public static void pattern(int n)
	{
		for (int i=4;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("@  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);

	}

}
