
public class StaticBlock {

	
	 static
	    {
	        System.out.println("Class A SIB");
	    }
	 
	 public static void main(String args[]) {
		 
		 	// strip method in string --> Remove all leading and trailing space in a string 
		 	String str = "  Java\tConcept\tOf\tThe\tDay     ".strip();
	        System.out.println(str);

	        
	        // Concatenate 2 string as "abc" and "def" into "adbecf"
	        String a = "abc";
			String b = "def";
			char a1[]=a.toCharArray();
			char b1[]=b.toCharArray();
			
			for(int i=0;i<a.length();i++) {
			System.out.print(a1[i]);
			System.out.print(b1[i]);
			}

		 
	 }
}
