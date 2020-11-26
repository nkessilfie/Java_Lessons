package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "there";
		String c = null;
		String d = "What is happening there is phenomenal";
		System.out.println(a.length());
		
		String [] list = new String [3];
		list[2] = "haha";
		System.out.println(list[(list.length -1)]);
		
		//substring - extracts part of the String variable
		System.out.println(a.substring(2 , 4));
		
		//Compare Strings with 'equals' not ==
		if(a.equalsIgnoreCase(b)) {
			
		}
		
		//To get character from index
		System.out.println(a.charAt(1));
		
		//To get the index of the beginning of a word from left to right
		System.out.println(d.indexOf("is"));
		
		//To get the index of the beginning of a word from left to right and indicating where to begin from
//		System.out.println(d.indexOf("is", 19));
		
		//To get the index beginning from right to left
		System.out.println(d.lastIndexOf("is"));
		
//		System.out.println();
		int count = 0;
		char [] r = d.toCharArray();
		System.out.println(r.length);
		for (int i=0; i<r.length; i++) {
			if(r[i] == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}	

}
