import com.npru.se65.id011.HumanBeing;


public class TestDrive {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(170);
		hb.setWeight(70);
		hb.calculateBMI();
		System.out.println("BMI : "+hb.getBmi()); 
		System.out.println(hb.analyzeBmi()); 
	}

	
}
