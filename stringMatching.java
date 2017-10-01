package practice;
/*Ch01_Q09 / String Rotation: Assume you have a method isSubstring which checks if one word is a substring of another. 
Given two strings, s1 and s2, write a code to check if s2 is a rotation of s1 using only one call to isSubstring
Example:
"waterbottle" is a rotation of "erbottlewat"
Time Complexity is O(n) 2n->n
*/

public class stringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		isSub(str1,str2);
	}
	public static void isSub(String str1, String str2){
		int j =0;
		int flag = 1;
		String str = str2+str2;
		if(str1.length() == str2.length()){
			for(int i=0; i<str.length(); i++){
				if(str1.charAt(j) == str.charAt(i)){
					String temp = str.substring(i, (i+str1.length()));
					if(temp.equals(str1)){
						System.out.println(temp);
						flag = 0;
						break;
					}
				}
			}
		}
		
		if(flag == 0){
			System.out.println("equal string");
		}else{
			System.out.println("Not an equal string");
		}
		
	}
	
}
