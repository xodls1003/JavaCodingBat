package Warm_Up1;

public class startHi {
	public boolean startHi(String str) {
		  if(str.length()<2 ){return false;}
		  if(str.substring(0,2).equals("hi")){
		    return true;
		  }
		  else return false;
		}

}
