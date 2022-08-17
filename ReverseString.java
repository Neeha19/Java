package loop.main;

import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			String originalstr=sc.nextLine();
			char ch;
			String reversestr="";
			for(int i=originalstr.length()-1;i>=0;i--){
			    ch=originalstr.charAt(i);
			    reversestr=reversestr+ch;
			}
			System.out.println(reversestr);


	}

}
