
public class Countwords {
	public static int countWords(String s) {
		int OUT = 0;
		int IN = 1;
		int START = OUT;
		int wc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t') {
				START = OUT;
			} else if (START == OUT) {
				START = IN;
				wc++;
			}
		}
		return wc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "one two    three\n four\tfive";
		System.out.println(countWords(str));
	}

}
