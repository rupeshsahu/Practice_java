package java_practice;

public class reverseString {

	public static void main(String[] args) {

		System.out.println(reverse("RupeshSahu"));
		
		
	

	}

//	public static String reverse(String str){
//
//		char a[]=str.toCharArray();
//		int start=0;
//		int end=str.length()-1;
//		for (int i=0;i<=str.length()/2;i++){
//			char temp=' ';
//
//			temp=a[i];
//			a[i]=a[end];
//			a[end]=temp;
//			end--;
//
//		}
//String str1=new String(a);
//
//		return(str1);
//
//	}


	public static String reverse(String str){

		char a[]=str.toCharArray();
		int start=0;
		int end=str.length()-1;
		while(start<end){
			char temp=' ';
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;

		}
		String str1=new String(a);

		return(str1);

	}
	

}
