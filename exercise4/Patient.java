public class Patient{
	private int year;
	private String name;
	public Patient next;
	public Patient(String name, int year) {
		int age = 2016 - year;
		
		if(age > 130 ) {
			throw new IllegalArgumentException("We do not accept such old patients");
		} else {
			if(age < 0 ){
				throw new IllegalArgumentException("We do not accept patients not yet born");
			} else {
				year = year;
				name = name;
			}
		}
	}
}