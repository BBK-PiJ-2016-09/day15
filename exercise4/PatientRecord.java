public class PatientRecord{
	private Patient first = null;
	public PatientRecord(){
		
	}
	public void add(Patient patient) {
		if(first == null){
			first = patient;
		} else {
			Patient current = first;
			while(patient.next != null){
				current = current.next;
			}
			current.next = patient;
		}
	}
}