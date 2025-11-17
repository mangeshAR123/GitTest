package MProgrammes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ChracterOccur {
	public static void FindHowManyTimeCharoccurInGivenString() {
		String s = " Purpose Of Education ";

		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		char ch = 0;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);

			// for(int j=i+1;j<s.length();j++) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.print(ch + " ");
			}

			// System.out.println(count);
		}
	}

	public static Map<Character, Integer> getVowels() {
		String x = " Purpose Of Education ";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : x.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		return map;

	}

	public static void FindCountOfVowelsInGivenSrting() {

		String x = " Purpose Of Education ";
		int acount = 0;
		int ecount = 0;
		int icount = 0;
		int ocount = 0;
		int ucount = 0;
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);

			if (c == 'a') {
				acount++;
			} else if (c == 'e') {
				ecount++;
			} else if (c == 'i') {
				icount++;
			} else if (c == 'o') {
				ocount++;
			} else if (c == 'u') {
				ucount++;
			}
		}

		System.out.println("count of vowels is : ");
		System.out.println("a--> :" + acount);
		System.out.println("e--> :" + ecount);
		System.out.println("i--> :" + icount);
		System.out.println("o--> :" + ocount);
		System.out.println("u--> :" + ucount);

	}

	public static void main(String[] args) {
		Map<Character, Integer> map = getVowels();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}

		//FindHowManyTimeCharoccurInGivenString();
		//FindCountOfVowelsInGivenSrting();
	}
}
