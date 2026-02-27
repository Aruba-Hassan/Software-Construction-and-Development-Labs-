package hospital.management;
public class Billing {
	int B_id;
	int P_id;
	String P_name;
	float amount;
	public Billing (int B_id, int P_id, String P_name, float amount) {
		this.B_id = B_id;
		this.P_id = P_id;
		this.P_name = P_name;
		this.amount = amount;
	}
	void details() {
		System.out.println("Bill No: " + B_id);
		System.out.println("Patient Name: " + P_name);
		System.out.println("Patient ID: " +P_id);
	}
}
