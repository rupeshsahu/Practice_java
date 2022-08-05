package java_practice;

public class check_prime {

	public static void main(String[] args) {
		
		System.out.println(CheckPrime(0));
		
		

	}
	
	public static boolean CheckPrime(int n){
		boolean flag=false;
if(n==1 || n==0){
	return false;
}

		for (int i=2;i<=n/2;i++)
		{
			System.out.println(i);
			if (n%i==0){
				
				return false;
				
			}
		
		}
		
		return true;
	}

}
