package day09;

public class program04 {

	public static void main(String[] args) {
		String input = "Aeroplane";
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
		sb.append("abc");
		System.out.println(sb.reverse().toString());
		
		sb.append("xyz");
		
		System.out.println(sb.reverse());
		sb.append("srt");
		System.out.println(sb.reverse());
		
	}

}
