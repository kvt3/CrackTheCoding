package practice;

/* Given two string, write a method to decide if one is a permutation of the other.
 * Time complexity of the algorithm is O(n) n = n+n
 * Space complexity is constant so O(1)
 *  */

public class StringPerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPermutation("god","dog");
		isPermutation("god ","dog");
		isPermutation("kittay1","ttayik1");
		isPermutation("man","ram");
		isPermutation("15_4m","m514_");

	}
	
	public static void isPermutation(String str1, String str2){
		
		int flag = 0;
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		
		
		int[] arr = new int[200];
		
		if(len1 != len2){
			System.out.println("Second string is not permentation of the 1st string");
		}else{
			for(int i = 0 ; i<len1 ; i++){
				arr[str1.charAt(i)]++;
				arr[str2.charAt(i)]++;
				
			}
			
			for(int i = 0 ; i<len1 ; i++){
				if(arr[str2.charAt(i)]%2 != 0){
					
					System.out.println("Second string is not permentation of the 1st string");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0){
					System.out.println("Second string is permentation of the 1st string");
			}
				
		}
		
		
	}

}
