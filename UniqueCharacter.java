package practice;

/*
From, Cracking the Coding Interview, 6th Edition
Chapter 1. Arrays and Strings
1.1 Is Unique: Implement an algorithm to determine if a string
has all unique characters.

Complexity of algorithm is O(n), where n is the number of character in the String
*/

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isUnique("Kalyani");
		isUnique("Amar");
		isUnique("kilo gram");
		isUnique("set_unique");
		

	}
	
	public static void isUnique(String str){
		
		int arr[] = new int[200];
		int flag = 0;
		str = str.toLowerCase();  
		
		for(int i = 0; i<str.length();i++){
			arr[str.charAt(i)]++;
			if(arr[str.charAt(i)] > 1){
				System.out.print("String Does not have uniue Characters: "+str+"\n");
				flag = 1;
				break;
			}
		}
		
		if(flag == 0){
			System.out.print("String Does have uniue Characters: "+str+"\n");
		}
		
	}

}

