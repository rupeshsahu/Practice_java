package java_practice;

public class LowestElement {

	public static void main(String[] args) {

		int arr[]={4,12,3,12,412,23,21,3133};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)

		{if(min>arr[i])
			min=arr[i];
		}
		System.out.println(min);


		System.out.println(max(6,5));
	}

	public static int max(int a,int b){

		return(a>b?a:b);


	}



}
