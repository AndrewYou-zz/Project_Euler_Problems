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
