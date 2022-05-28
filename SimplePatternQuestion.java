package SimplePatternQuestions;
import java.util.Scanner;
public class SimplePatternQuestion {
	

	static Scanner s = new Scanner(System.in);

	static int n = s.nextInt();
	static int m = s.nextInt();
	static String patternShape = s.next();
	
	public void printInfo()
	{
		System.out.println("Enter The Value of Row : " + n);
		System.out.println("Enter The Value of Column : " + m);
		System.out.println("Enter The Value of PatternShape : " + patternShape );


	}
	
	
	public void simplePattern1()
	{
	    
		for(int i=0 ; i<n; i++) 
		{
			for(int j =0; j<m; j++)
			{
				System.out.print(patternShape);
			}
			System.out.println();
		}
	}
	
	public void simplePattern2()
	{
		 for(int i=0 ; i<n; i++)
		 {
			for(int j=0; j<m; j++)
			{
	            if(i == 0 || i == n-1 || j == 0 || j == m-1)
	            {
	                 System.out.print(patternShape);
	            } else
	            {
	                 System.out.print(" ");
	            }

			System.out.println();
		   }
	     }
	
    }
	
	public void simplePattern3()
	{
		for(int i=1; i<=n; i++) 
		{
	        for(int j=1; j<=i; j++)
	        {
	           System.out.print(patternShape);
	        }
	           
	       System.out.println();
	    }

	}
	
	
	public void simplePattern4()
	{
		for(int i=n; i>=1; i--)
		{
	           
			for(int j=1; j<=i; j++) 
			{
	                   
				System.out.print(patternShape);
	        }
	           
			System.out.println();
	     }

		
	}
	
	public void simplePattern5()
	{
		for(int i=n; i>=1; i--)
		{
	        for(int j=1; j<i; j++)
	        {
	           System.out.print(" ");
	        }
	 
	        for(int j=0; j<=n-i; j++)
	        {
	            System.out.print(patternShape);
	           
	        }
	          
	        System.out.println();
	     }

	}
	
	public void simplePattern6()
	{
		for(int i=1; i<=n; i++) 
		{
	           for(int j=1; j<=i; j++)
	           {
	               System.out.print(j);
	           }
	           
	           System.out.println();
	       }


	}
	
	public void simplePattern7()
	{
		for(int i=n; i>=1; i--)
		{
	           for(int j=1; j<=i; j++)
	           {
	               System.out.print(j);
	           }
	           
	           System.out.println();
	       }


	}
	
	public void simplePattern8()
	{
		for(int i=1; i<=n; i++)
		{
	           for(int j=1; j<=i; j++) 
	           {
	               if((i+j) % 2 == 0) 
	               {
	                   System.out.print(1+" ");
	               } else {
	                   System.out.print(0+" ");
	               }
	           
	           }
	           System.out.println();
	       }


	}

	
}

