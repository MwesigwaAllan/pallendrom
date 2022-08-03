package pallendrom;

import java.util.Scanner;

public class Pallendrom_checker {
	
	public static char[] reverse(String input) {
		int wordLength=input.length();
		char[]reversal=new char[wordLength];
		int inputIndex=0;
		for (int i = wordLength-1; i >=0 ; i--) {
			reversal[inputIndex]=input.charAt(i);
			inputIndex++;
		}
		return reversal;
	}
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("please insert word to reverse:");
		String tempInput=scanner.next();
		System.out.println("************************************");
		char[] tempOutput=reverse(tempInput);
		char[] stringToChar=tempInput.toCharArray();
		System.out.println(stringToChar);
		System.out.println(tempOutput);
		
		
	}

}
