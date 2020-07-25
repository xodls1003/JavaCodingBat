package Warm_Up2;

public class doubleX {
	boolean doubleX(String str) {
		int od = str.indexOf("x");
		if(od == -1) {
			return false;
		}else if(od+1==str.length()){
			return false;
		}
		
		else if(str.charAt(od+1) =='x') {
			return true;
			
		}else {return false;
		}

	}

}
