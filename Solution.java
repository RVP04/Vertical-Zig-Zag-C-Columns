import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		for(int i =0;i<rows;i++)
		{
		    for(int j=0;j<cols;j++)
		    {
		        if(j%2==0)
		        {
		            System.out.print((rows*(j)+i+1)+" ");
		        }
		        else
		        {
		            System.out.print((rows*(j+1)-i)+" ");
		        }
		    }
		    System.out.println();
		}
        
	}
}
