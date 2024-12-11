package BrowserAutomation;

public class IrregularSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "  My    name    is Raga   ";
		String name1 = name.trim();
		String name2=name1.replaceAll("\\s+", " ");
		System.out.println(name2);
	}

}
