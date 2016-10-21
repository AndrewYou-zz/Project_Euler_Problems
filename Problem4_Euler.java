import java.util.ArrayList;
import java.util.Collections;

public class Problem4_Euler {
	
	public static int largestPalindrome(){
		ArrayList<Integer> potential = new ArrayList<Integer>(); 
		for(int i = 999; i > 0; i--){
			for(int j = i; j>0; j--){
				int product = i*j; 
				String product2 = Integer.toString(product); 
				if(product2.equals(new StringBuffer().append(product2).reverse().toString())){
					potential.add(product); 
				}
			}
		}
		return Collections.max(potential);
	}
	public static void main(String args[]){
		int sol = largestPalindrome(); 
		System.out.println(sol);
		
	}
}
