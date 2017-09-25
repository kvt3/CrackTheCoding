package practice;

/*replace all spaces in a string with '%20'
 * Time complexity of the Algorithm is O(n) but the algorithm is not inplace
 */

public class replaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceStr("I am KT");
		replaceStr(" sky is blue ");
		replaceStr("Apple is red");
	}
	
	public static void replaceStr(String string){
		int len = string.length();
		char[] str = string.toCharArray();
		int cnt = 0;
		
		for(int i=0;i<len;i++){
			if(str[i]==' ' ){
				cnt++;
			}
		}
		
		char[] str1 = new char[len+2*cnt];
		int j = 0;
		for(int i = 0; i<(len);i++){
			
			if(str[i]==' '){
				str1[j] = '%';
				j++;
				str1[j] = '2';
				j++;
				str1[j] = '0';
				j++;
			}else{
			str1[j] = str[i];
			
			j++;
			}
		}
		String str2 = String.copyValueOf(str1);
		System.out.println("number of blank space: "+ cnt +" string: "+str2);
		
		
	}

}
