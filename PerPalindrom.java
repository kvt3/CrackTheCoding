package practice;

/* Given a string write a function to check if it is 
 * a permutation of a palindrome. A palindrome is a word or 
 * phrase that is same forwards and backwards. A permutation is a 
 * rearrangement of letters. The palindrome does not need to be 
 * limited to just dictionary words.Example:
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 * Time Complexity of program is O(n)

*/

public class PerPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPal("Tact coao");
		checkPal("Tact coai");
		checkPal("Tact coa pp");
		checkPal("Tact coa  to");
	}
	
	public static void checkPal(String str){
		int [] arr = new int[256];
		str = str.toLowerCase();
		str = str.replaceAll("\\s","");
		int flag =0;
		int cnt = 0;
		
		int len  = str.length();
		for(int i=0 ;i<len; i++ ){
			arr[str.charAt(i)]++;
		}
		for(int i=0; i<len; i++){
			if(arr[str.charAt(i)]%2 != 0){
				cnt++;
			}
		}
		
		if(len%2 == 0){
			if(cnt == 0){
					flag =1;
				}
			
			
		}else{
			if(cnt == 1){
					flag = 1;
			}
		}
		if(flag == 1){
			System.out.println("One of the permntation matches with Palindrom");
		}else{
			System.out.println("None of the permntation is not matches with Palindrom");
		}
		
	}
	

}
