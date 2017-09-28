package practice;
/*Write a function rotate(arr[], d, n) 
 * that rotates arr[] of size n by d elements in place.
 * Complexity of both the method is O(n) but first method is not inplace
 */

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rajani";
		char[] arr = str.toCharArray();
		char[] arr1 = str.toCharArray();
		int n  = arr.length;
		//System.out.println(n);
		rotate(arr,n,3);
		rott(arr1,n,3);

	}
	
	/* 1st method to rotate the string */
	public static void rotate(char[] arr,int l, int d){
		
		int ptr = l-d;
		int i = l-1;
		char[] temp = new char[d];
		if(d <= l){
		for(int j=0; j<d;j++){
			temp[j] = arr[ptr];
			ptr++;
			
		}
		ptr = l-d-1;
		while(ptr>=0){
			arr[i]=arr[ptr];
			i--;
			ptr--;
			
		}
		for(int j = d-1; j>=0; j--){
			arr[i] = temp[j];
			i--;
		}
		System.out.println("string: "+String.copyValueOf(arr));
		}else{
			System.out.println("Can't rotate the String");
		}
		
	}
	
	/* 2nd method to rotate string */
	public static void rott(char[] arr,int l, int d){
		 arr = reverse(arr,l,0);
		 arr = reverse(arr,d,0);
		 arr = reverse(arr,l,d);
		 System.out.println("str: "+String.copyValueOf(arr));
		
	}
	public static char[] reverse(char[] arr,int l,int s){
		
		int i =s;
		int j = l-1;
		int cnt = (j-i+1)/2;
		char temp;
		while(0<cnt){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			cnt -- ;
		}
		return arr;
		
	}
	

}
