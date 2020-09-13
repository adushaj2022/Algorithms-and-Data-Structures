package practiceEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String s = sc.next();
		char[] c = s.toCharArray();
		System.out.println("Before: " + Arrays.toString(c).replace(',', ' ').replace('[', ' ').replace(']', ' '));
		reverse(c);
		System.out.println("After: " + Arrays.toString(c).replace(',', ' ').replace('[', ' ').replace(']', ' '));
		sc.close();
	}

	private static void reverse(char[] crr) {
		Stack<Character> vd = new Stack<Character>();
		for(char c: crr) {
			vd.push(c);
		}
		
		for(int i = 0; i < crr.length; i++) {
			crr[i] = vd.pop();
		}
	}

}
