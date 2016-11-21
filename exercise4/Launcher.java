public class Launcher{
	public static void main(String[] args){
		PatientRecord pr = new PatientRecord();
		Patient a = new Patient("enric", 1980);
		System.out.println("registered enric 1980");
		pr.add(a);
		 a = new Patient("fasfa", 1923);
 		System.out.println("registered fasfa 1923");

		pr.add(a);
		 a = new Patient("enric", 1809);
		pr.add(a);
		 a = new Patient("enric", 1980);
		pr.add(a);	
		 a = new Patient("enric", 1980);
		pr.add(a);		
		 a = new Patient("enric", 1980);
		pr.add(a);
	}
}