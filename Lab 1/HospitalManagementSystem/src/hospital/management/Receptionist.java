package hospital.management;
public class Receptionist extends Users{
	int R_id;
	String R_name;
	public Receptionist(int R_id,String R_name) {
		this.R_id = R_id;
		this.R_name = R_name;
	}
	void giveAppointment(int P_id, String P_name , int D_id , String D_name) {
		System.out.println("Patient:" + P_id + " : " +  P_name +
				" take appointment of Doctor " + D_id + " : " + D_name);
	}
	void generateBill( int P_id, float amount) {
		System.out.println("Bill paid by patient:" + P_id + " amounting Rs. " + amount);
	}
}
