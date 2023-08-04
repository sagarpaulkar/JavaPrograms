
public class ExtractStringPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "www.erostrum.com";
		
		String firstfour= s.substring(0, 4);
		
		System.out.println(firstfour);
		
		String lastfour=s.substring(s.length()-4, s.length());
		
		System.out.println(lastfour);
		
		String website=s.substring(4,s.length()-4);
		
		System.out.println(website);
	}

}
