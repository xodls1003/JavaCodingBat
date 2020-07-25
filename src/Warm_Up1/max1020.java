package Warm_Up1;

public class max1020 {
	public int max1020(int a, int b) {
		  int result=0;
		  if((b<10 || 20<b) && (a<10 || 20<a)){
		    return result;
		  }else if ((b<10 || 20<b) && (a>=10 && a<=20)){
		    return a;
		  }else if((b>=10 && 20>=b) && (a<10 || a>20)){
		    return b;
		  }else if((b>=10 && 20>=b) && (a>=10 && a<=20) && a-b>=0) {
		    return a;
		  }else {return b;}
		}

}
