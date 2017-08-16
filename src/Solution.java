
public class Solution {
	public int romanToInt(String s){
		char[] chars = s.toCharArray();
		int l = chars.length;
		
		int[] integer = new int[l];
		
		for(int i = 0; i < l; i++){
			
			if (chars[i] == 'I'){
				integer[i] = 1;
			}else if(chars[i] == 'X'){
				integer[i] = 10;
			}else if(chars[i] == 'C'){
				integer[i] = 100;
			}else if(chars[i] == 'M'){
				integer[i] = 1000;
			}else if(chars[i] == 'V'){
				integer[i] = 5;
			}else if(chars[i] == 'L'){
				integer[i] = 50;
			}else if(chars[i] == 'D'){
				integer[i] = 500;
			}
		}
		
		int number = 0;
		
		for(int i = 0; i < l -1; i++){
			if(integer[i] < integer[i + 1]){
				number -= integer[i];
			}else{
				number += integer[i];
			}
		}
		number = number + integer[l-1];
		return number;
	}
	
}
