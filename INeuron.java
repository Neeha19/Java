import java.util.Scanner;

public class INeuron{

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) { //I
				if(j==(n-1)/2 || i==n-1 || i==0)
					System.out.print("*  ");		
				else {
					System.out.print("   ");
				}
				
			}
			System.out.print("   ");
			
			for(int j=0;j<n;j++) { //N
				if(i==j || j==0 || j==n-1)
					System.out.print("*  ");
				else
					System.out.print("   ");
				
				
			}
	System.out.print("  ");
	
	for(int j=0;j<n;j++){ //E
        
	       if(j==0 || i==n-1 || i==0|| i==(n-1)/2 ||(i>0 && j==0))
	       {
	           System.out.print("* ");
	       }
	       else
	           System.out.print("  ");
	 }
	System.out.print("  ");
			
			
			for(int j=0;j<n;j++) {  //U
				if(j==(n-1) || i==n-1 || j==0)
					System.out.print("*  ");		
				else {
					System.out.print("   ");
				}
				
			}
			System.out.print("  ");
			
			
			for(int j=0;j<n;j++) {  //R
				//if(i==0|| j==0 || i==n-1 || j== (n-1) || i+j<=(n-1)/2 || j-i >=(n-1)/2 || i-j >=(n-1)/2 || i+j >=n-1 + n/2)
				//if(i==n-1 || ((i>=(n-1)/2)&& j==0) || i>=(n-1)/2 && j==n-1 || i-j >=(n-1)/2 || i+j >=n-1 + n/2)
				if(i==0 && j<=(n-1)/2 || j==0 || i<=(n-1)/2 && j==(n-1)/2 || i-j==(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)
					System.out.print("*  ");
				else
					System.out.print("   ");
				
				
			}
			System.out.print("");
			
			for(int j=0;j<n;j++){ //O
		           if(i==0||i==n-1 ||j==0 ||j==n-1)
		                System.out.print("* ");
		          else
		             System.out.print("  ");
		   
		       }
			 System.out.print("  ");
			 for(int j=0;j<n;j++) { //N
					if(i==j || j==0 || j==n-1)
						System.out.print("*  ");
					else
						System.out.print("   ");
					
					
				}
			
	System.out.println(" ");
			
			
		}		
		
}
	
	
}


	

o/p:
6
*  *  *  *  *  *     *              *    * * * * * *   *              *    *  *  *           * * * * * *   *              *   
      *              *  *           *    *             *              *    *     *           *         *   *  *           *   
      *              *     *        *    * * * * * *   *              *    *  *  *           *         *   *     *        *   
      *              *        *     *    *             *              *    *  *              *         *   *        *     *   
      *              *           *  *    *             *              *    *     *           *         *   *           *  *   
*  *  *  *  *  *     *              *    * * * * * *   *  *  *  *  *  *    *        *        * * * * * *   *              *   

 
 
 