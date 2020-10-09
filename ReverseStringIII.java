//time limit exceeded, will improve this
package practiceEx;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringIII {

	public static void main(String[] args) {
		String str = "Windows Operating System";
		List<String> result = new ArrayList<String>();
		int spot = 0;
		for(int i = 0; i < str.length(); ++i) {	
			if(str.toCharArray()[i] == ' ') {
				String e = rev_str((String) str.subSequence(spot, i));
				result.add(e);
				spot = i + 1;
			}
		}
		
		
		String c = rev_str((String) str.subSequence(spot, str.length()));
		result.add(c);
		
		String res = "";
		for(int i = 0; i < result.size(); ++i) {
			res = res + result.get(i) + " ";
		}
	
		System.out.println(res.trim());

	}
	
	public static String rev_str(String s){
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
		
	    }	

}
