package Warm_Up1;

public class close10 {
	public int close10(int a, int b) {
		  int diffa=Math.abs(10-a);
		  int diffb=Math.abs(10-b);
		  if(diffa>diffb){
		    return b;
		  }else if (diffb>diffa){
		    return a;
		  }else return 0;
		}

}
