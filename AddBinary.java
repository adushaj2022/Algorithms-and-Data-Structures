package practiceEx;

public class AddBinary {

	public static void main(String[] args){
		String a = "10111";
		String b = "101111";
		int total = getVal(a) + getVal(b);
		
        String str = Integer.toBinaryString(total);
        
        System.out.println(getVal(a) + " Binary value is " + a);
        System.out.println(getVal(b) + " Binary value is " + b);
        System.out.println(getVal(a) + " + " + getVal(b) + " is " + total);
        System.out.println(total + " Binary value is " + str);

	}
    
    public static int getVal(String s){
        StringBuilder input1 = new StringBuilder();  
        input1.append(s); 
        input1 = input1.reverse();
        int sum = 0;
        int par;
        
        if(input1.length() == 1){
             sum += Integer.parseInt(String.valueOf(input1.charAt(0)));
            return sum;
        }
        
        if(input1.length() == 2){
            sum += Integer.parseInt(String.valueOf(input1.charAt(0)));
            sum += Integer.parseInt(String.valueOf(input1.charAt(1))) * 2;
            return sum;
        }
        
        for(int i = 2; i < input1.length(); i++){
            int k = i;
            par = Integer.parseInt(String.valueOf(input1.charAt(i)));
            sum += Math.pow(2, k) * par; 
        }
    
        sum += Integer.parseInt(String.valueOf(input1.charAt(0)));
        sum += Integer.parseInt(String.valueOf(input1.charAt(1))) * 2;
        
        return sum;

    }
    
}
