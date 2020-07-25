package Warm_Up1;

public class front3 {
	public String front3(String str) {
		  if(str.length()<3) return str+str+str;
		  String triple=str.substring(0,3);
		  return triple+triple+triple;
		}

}
