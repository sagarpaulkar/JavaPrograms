
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="How are you";
		String result = "";
		String[] st= s.split(" ");
		
		for (String word:st) {
			String reverseWord= "";
		int j= word.length()-1;
		
		while(j>=0) {
			char ch= word.charAt(j);
			reverseWord=reverseWord+ch;
			j--;
		}
		result=result+reverseWord+" ";
		}
		System.out.println(result);
	}

}
