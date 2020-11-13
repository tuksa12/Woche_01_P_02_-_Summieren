package pgdp.intro;

import static pgdp.MiniJava.*;

public class Sum {

	public static void main(String[] args) {

		int x = -1;
		int sum = 0;

		while(x!=0) {
				x = readInt("Bitte Zahl eingeben:");
				sum += x;
		}
		write("Summe:\n"+ sum);
	}
}