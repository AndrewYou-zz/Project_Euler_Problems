import java.util.ArrayList;
import java.util.List;

public class Problem3_Euler{
	public static void main(String args[]){
		long n = 600851475143L; 
		List<Long> primeFactors = new ArrayList<Long>(); 
		for(long i=2; i<=n; i++){
			while(n%i == 0){
				primeFactors.add(i); 
				n = n/i; 
			}
		}
		
		int length = primeFactors.size(); 
		System.out.println(primeFactors.get(length-1));
	}
}