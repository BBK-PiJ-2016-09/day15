
public class PrimeDivisorList{
	public Integer[] myIntArray;
	public PrimeDivisorList() {
		Integer[] a = new Integer[0];
		myIntArray = a;
	}
	
	public void add(Integer n) {
		if(n==null){
			throw new NullPointerException("Number is null");		
		}
		
		if(!isPrime(n)) {
			throw new IllegalArgumentException("Number is not prime");
		}
		
		Integer[] newArray = new Integer[myIntArray.length +1];
		int i = 0;
		
		while(i < myIntArray.length){
			newArray[i] = myIntArray[i];
			i++;
		}
		
		newArray[i] = n;
		myIntArray = newArray;
	}
	
	public boolean isPrime(Integer n){
		int i =2;
		while(i<(n-1)){
			if((n%i)==0){return false;}
			i++;
		}
		return true;
	}
	
	public String toString() {
		int i = 0;
		int t = 0;
		int happens = 0;
		String string = "[";
		Integer[] blackList = myIntArray;
		while(i < myIntArray.length) {
			if(blackList[i] != -1){
			int num = myIntArray[i];
			t = i + 1;
			happens = 1;
			while(t < myIntArray.length) {
				if(blackList[t] != -1) {
					if(myIntArray[t] == num) {
						happens++;
						blackList[t] = - 1;
					}
				}
				t++;
			}
			string = string + num;
			if(happens > 1) {
				string = string + " ^ " + happens + " "; 
			}
			string= string + "*";		
			}
			i++;
		}
		string = string + "1 ]";
		return string;
	} 
}