import java.util.ArrayList;

public class Problem7_Euler {
	public static void main(String args[]){
		boolean[] numbers = new boolean[125000];
		ArrayList<Integer> primes = new ArrayList<Integer>(); 
		for(int i = 2; i<numbers.length; i++){
			if(!numbers[i]){
				primes.add(i);
				int num_multiples = (numbers.length - 1)/i; 
				for(int j=1; j<=num_multiples; j++){
					numbers[i*j] = true; 
				}
			}
		} 
		System.out.println(primes.get(10000)); 
	}
}
