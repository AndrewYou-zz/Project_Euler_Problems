/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

*/

public class Problem6_Euler {
	public static void main(String args[]){
		int sum = 0; 
		for(int i = 1; i<=100; i++){
			for(int j = 1; j<=100; j++){
				if(j != i){
					sum = sum + j*i; 
				}
			}
		}
		System.out.println(sum);
	}
}
