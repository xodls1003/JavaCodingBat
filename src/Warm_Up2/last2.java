package Warm_Up2;

public class last2 {
	public int last2(String str) {
		if(str.length()<2) return 0;
		int count=0;
		String last=str.substring(str.length()-2);
		for(int i=0;i<str.length()-2;i++) {
			if(last.equals(str.substring(i, i+2))) {
				count++;
			}
		}return count;
	}

}
