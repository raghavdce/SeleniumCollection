package com.selenium.javapractice;

public class RemoveLeadAndTrialSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  Java\tConcept\tOf\tThe\tDay    ".trim();
        
        System.out.println(str);
        
        String s = "\t a\tbc \n";
        System.out.println(s.trim());
        //System.out.println(s.strip());					//strip should work but based on JDK compiler version
        
        String s1 = "--->"+"\u2000Ragavendran\u2000".trim()+"<---";		//unicode for space this will not work and the output will have spaces becuase
        //trim will not work if unicode is >u020
        System.out.println(s1);
        System.out.println('\u0906');	// this is unicode for aa in hindi letter


	}

}
