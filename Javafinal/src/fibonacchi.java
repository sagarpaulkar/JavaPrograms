
public class fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1;
		int c = 0;
		for (int i=1; i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
		
		System.out.println(c+" ");
	}

}
}
