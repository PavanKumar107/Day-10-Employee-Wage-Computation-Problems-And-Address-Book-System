import java.util.Random;

public class UC7 {

	static int random(){
		Random ran = new Random();
		int i = ran.nextInt(3)+1;
		return i;
	}
	static int hours(){
		int emphrs=0;
		int days =0;
		while (emphrs<=99 && days<=20) {
			switch (random()) {
			case 1:
				emphrs = emphrs + 8;
				days= days +1;
				break;
			case 2:
				emphrs = emphrs + 4;
				break;
			default:
				break;
			}
		}
		System.out.println("Number of days Employee Worked is "+days);   

		return emphrs;
	}
	static int total_wage(){
		int total_wage=no_of_hours*wage_per_hour;
		return total_wage;
	}

	public static final int random = random();
	public static int wage_per_hour =20;
	public static final int no_of_hours=hours();

	public static void main(String[] args){

		System.out.println("Number of hours employee Worked is "+no_of_hours);
		System.out.println("The total wage of employee is "+total_wage());

	}
} 