package Warm_Up1;

public class endUp {
	public String endUp(String str) {
		  
		  if(str.length()<3)
		   return str.toUpperCase();
		  
		 int cut = str.length()-3;
		  String front = str.substring(0,cut);
		  String back = str.substring(cut).toUpperCase();
		  
		  return front+back;
		  
		}

}
