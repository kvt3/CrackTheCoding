package practice;
/* Time complexity O(n)*/

public class ReapeatCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String st =	getString("aaaaabbaaccccd");
	System.out.println(st);
	}
	
	public static String getString(String str){
		int len = str.length();
		int cnt = 1;
		StringBuilder st = new StringBuilder();
		
		for(int i =0; i<len-1; i++){
			if(str.charAt(i) == str.charAt(i+1)){
				cnt++;
			}
			else{
				
				st.append(str.charAt(i));
				st.append(cnt);
				cnt = 1;
			}
			
			
		}
		
		st.append(str.charAt(len-1));
		st.append(cnt);
		if(st.toString().length() > str.length()){
			return st.toString();
		}else
			return str;
		
	}
}
