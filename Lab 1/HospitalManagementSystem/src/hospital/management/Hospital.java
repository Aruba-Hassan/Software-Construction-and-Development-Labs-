package hospital.management;
public class Hospital {
	public static void main(String[] args) {
		Receptionist R1 = new Receptionist(1,"Aruba1");
		Doctor D1 = new Doctor(11,"Aruba2");
		Patient P1 = new Patient(111,"Aruba3");
		Billing B1 = new Billing(122,111,"Aruba3",5000);
		R1.choice("Receptionist");
		D1.choice("Doctor");
		P1.choice("Patient");
		R1.generateBill(111, 500);
		R1.giveAppointment(111, "Aruba3", 11, "Aruba2");
		P1.payBill(111, "Aruba3");
		D1.checkPatient(111, 11, "Aruba2");
		B1.details();
	}
}
