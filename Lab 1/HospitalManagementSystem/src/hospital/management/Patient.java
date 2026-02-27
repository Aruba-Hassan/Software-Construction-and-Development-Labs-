package hospital.management;
public class Patient extends Users{
	int P_id;
	String P_name;
	public Patient(int P_id , String P_name) {
		this.P_id = P_id;
		this.P_name = P_name;
	}
	void payBill(int P_id , String P_name) {
		System.out.println(P_id + ":" + P_name + "Pay bill.");
	}
}
