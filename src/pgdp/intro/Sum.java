package pgdp.intro;

import static pgdp.MiniJava.*;

public class Sum {

	public static void main(String[] args) {

		//int x = -1;
		//int sum = 0;

		//while(x!=0) {
				//x = readInt("Bitte Zahl eingeben:");
				//sum += x;
		//}
		//write("Summe:\n"+ sum);



		//Kontrollflussdiagram
		int n, p, s, q;
		n = readInt();
		p = readInt();
		s = 100;
		q = 0;
		while (s > 0) {
			if (n < p * s) {
				write(q);
				q = 0;
				s = s / 10;
				}
			else {
				n = n - p * s;
				q = q + 1;
				}
			}
		write(n);
	}
}