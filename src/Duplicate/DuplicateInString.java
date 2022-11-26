package Duplicate;

public class DuplicateInString {

	public static void main(String[] args) {
		
		String s = "Hi Hello Hello Good Hi Namaste Hi Hello Good Namaste Hi Good Good Namaste";
		
		String spl[]= s.split(" ");
		
		for(int i=0; i<spl.length; i++) {
			int count=0;
			for(int j=i+1; j<spl.length; j++) {
				if(spl[i].equals(spl[j])) {
					count++;
					spl[j]="";
				}
			}
			if(count>0 && spl[i]!="") {
				System.out.print(spl[i]+" ");
			}			
		}		
	}
}
