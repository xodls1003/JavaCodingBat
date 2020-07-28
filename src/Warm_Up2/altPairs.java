package Warm_Up2;

public class altPairs {
	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
	 * ... so "kittens" yields "kien".
	 * 
	 * 
	 * altPairs("kitten") → "kien" altPairs("Chocolate") → "Chole"
	 * altPairs("CodingHorror") → "Congrr"
	 */
	
	public String altPairs(String str) {
		  String mod4 = "";
		  for(int i=0; i<str.length();i+=4) {
				
			  int end = i+2;
			  if(end>str.length()) {
				  end=str.length();
			  }
			  mod4 = mod4 +str.substring(i, end);
			  }
		 return mod4;
		}

	
	
}
