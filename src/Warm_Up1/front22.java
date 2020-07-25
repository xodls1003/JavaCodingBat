package Warm_Up1;

public class front22 {
	public String front22(String str) {
		  
		  if(str.length()<2){ return str+str+str;}
		  String d = str.substring(0,2);
		  return d+str+d;
		}

}
