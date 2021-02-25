/*
 * Calculate a file's chi squared entropy.
 * demo how java does file IO.
 */ 

import java.io.FileInputStream;

public class ChiSquaredEntropy
{
	public static void main(String[] args) {
		if ((args.length == 0) || (args.length > 1)) {
			System.out.println("Wrong args!");
			return;
		}
		int[] counts = new int[256];
		int total = 0;
		try {
			FileInputStream file = new FileInputStream(args[0]);
			int c = file.read();
			while (c != -1) {
				counts[c]++;
				total++;
				c = file.read();
			}
			file.close();
		} catch (Exception e) {
			System.out.println("Can not open file " + args[0]);
		}

		if (total == 0) {
			System.out.println("empty file " + args[0]);
			return;
		}

		double exp = (double)total/256;
		System.out.println("Total = " + total + 
			" Expect = " + exp);

		double chisqu = 0;
		for (int i : counts) {
			chisqu += Math.pow((i - exp), 2);
		}
		chisqu /= exp;
		System.out.println("Java code File's " + 
			"Chi-Squared value is " + 
			chisqu);
		return;
	}
}

