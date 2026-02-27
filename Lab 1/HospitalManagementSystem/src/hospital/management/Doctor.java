package hospital.management;
public class Doctor extends Users{
	int D_id;
	String D_name;
	public Doctor(int D_id, String D_name) {
		this.D_id = D_id;
		this.D_name = D_name;
	}
	void checkPatient(int P_id, int D_id , String D_name) {
		System.out.println( D_id + " : "+ D_name + " Check Patient " + P_id + " and prescribed medicines.");
	}

}
