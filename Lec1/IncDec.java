package Lec1;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 5;
		
		int d = a++ + ++a - --b + ++b - b--;
		System.out.println(d);

	}

}
