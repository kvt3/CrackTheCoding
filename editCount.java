package practice;
/* complexit is O(n) */

public class editCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = checkEdit("pale","ple");
		boolean b = checkEdit("pales","pale");
		boolean c = checkEdit("pale","bale");
		boolean d = checkEdit("pale","bake");
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
	}
	
	public static boolean checkEdit(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int cnt=0;
		int i = 0; 
		int j = 0;
		
		while(j< len2 && i < len1){
		
		if(len1 == len2){
			/*replace operation*/
				if(str1.charAt(i) != str2.charAt(j)){
					cnt++;
					}
			}
		else if((len1 - len2) == 1){
			/*remove operation*/
				if(str1.charAt(i) != str2.charAt(j)){
					cnt++;
					j--;
					}
			}else if((len2 - len1) == 1){
			/*insert operation*/
				if(str1.charAt(i) != str2.charAt(j)){
					cnt++;
					i--;
				}
				
			}else{
				return false;
			}
		i++;
		j++;
		}
		
		if(cnt > 1){
			return false;
		}else{
			return true;
		}
		
	}

}
