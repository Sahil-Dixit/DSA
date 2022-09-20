package seaching_sorting_algorithms;

public class NextAlphabet {
	public static char search(char[] chs, char key) {
		char ch = '#';
		int N = chs.length;
		int start = 0;
		int end = chs.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(chs[mid]==key) {
//				ch = chs[(mid+1)%N];
//				break;
				start = mid+1;
			}else if(chs[mid]<key) {
				start = mid+1;
			}else {
				ch = chs[mid];
				end = mid-1;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		char[] chs = { 'a', 'c', 'f', 'h' };
		char key = 'f';
		System.out.println(search(chs,key));
	}

}
