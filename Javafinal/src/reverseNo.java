
public class reverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ori=2345;
		int rev= 0;
		while(ori>0) {
			int rem= ori%10;
			rev=rev*10+rem;
			ori=ori/10;
		}
		System.out.println(rev);
	}

}
