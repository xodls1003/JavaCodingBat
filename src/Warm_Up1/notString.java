package Warm_Up1;

public class notString {
	public String notString(String str) {
		  String str1;
		  if (str.length()>=3 && str.substring(0,3).equals("not")){
		    return str;
		    
		  }else 
		  return "not " + str;
		}

}
