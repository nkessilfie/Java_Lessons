package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
//		int count = 0;
//		while(count < 100) {
//			System.out.println(count);
//			count ++;
//		}
		
		String str = "We have a large inventory of things"
				+ " in our warehouse falling in the category:"
				+ " apperal and the slightly more in demand"
				+ " category: makeup along with the category:"
				+ " furniture and...";
		
//		printCategories1(str);
		printCategories2(str);
		
		

	}
	
	//Extract all categories from string argument
	public static void printCategories1(String str) {
		
		//take the index of the beginning word of category: in every instance of the string
		int a = str.indexOf("category: "); // first category: appearing
		int b = str.indexOf("category: ", a + 1); // second category: appearing 
		int c = str.indexOf("category: ", b + 1); // third category: appearing
		
		String d = "category: ";
		int e = d.length();
		
		String f = str.substring(a + e);
//		System.out.println(f);
		char [] x = new char [a];
		char [] z = f.toCharArray();
		for(int i=0; i<f.length(); i++) {
			x[i] = z[i];
			if(z[i] == ' ') {
				break;
			}
		}
		System.out.println(x);

		String g = str.substring(b + e);
//		System.out.println(g);
		char [] l = new char [a];
		char [] m = g.toCharArray();
		for(int i=0; i<f.length(); i++) {
			l[i] = m[i];
			if(m[i] == ' ') {
				break;
			}
		}
		System.out.println(l);
		
		String h = str.substring(c + e);
//		System.out.println(h);
		char [] n = new char [a];
		char [] k = h.toCharArray();
		for(int i=0; i<f.length(); i++) {
			n[i] = k[i];
			if(k[i] == ' ') {
				break;
			}
		}
		System.out.println(n);
	}
	//Instructor Solution Which Isn't Running on Mine
	public static void printCategories2(String string) {
		int i = 0;
		while (true) {
			int found = string.indexOf("category:  ", i);
			if (found == -1) break;
			int start = found + 9;
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end + 1;
		}
	}
}
