package Warm_Up1;

public class mixStart {
	public boolean mixStart(String str) {
		  if(str.length()<3){
		    return false;
		  }
		  else if(str.substring(1,3).equals("ix")){
		    return true;
		  }else{
		    return false;
		  }
		}

}
