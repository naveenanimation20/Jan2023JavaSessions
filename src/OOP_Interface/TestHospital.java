package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHopital fh = new FortisHopital();
		fh.cardioService();
		fh.dentalService();
		fh.emergencyService();
		fh.pediaServices();
		fh.neuroServices();
		fh.medicalClaim();
		fh.medicalTraining();
		fh.medicalRD();
		fh.medicalTest();
		
		System.out.println(USMedical.min_fee);
		System.out.println(fh.min_fee);
		System.out.println(FortisHopital.min_fee);
		
		System.out.println(USMedical.isApproved);
		
		
		//top casting: child class object can be referred by parent interface ref variable:
		USMedical us = new FortisHopital();
		us.physioService();
		us.dentalService();
		us.cardioService();
		us.emergencyService();
		us.medicalTest();
		
		WHO wh = new FortisHopital();
		wh.covidVaccinationCamp();
		

		//down casting: NA
		
		//calling static method:
		USMedical.billing();
		FortisHopital.billing();
		
		
	}

}
