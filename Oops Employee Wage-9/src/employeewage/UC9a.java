package employeewage;

public class UC9a extends UC9{
	int totalWage;
	String nameOfCompany;

	UC9a(String name, int workDays, int workHours, int wage) {
		super(workDays, workHours, wage);
		this.nameOfCompany = name;
	}
	void calcTotalWage(){
		while (this.totalDays != this.MAX_WORKING_DAYS && this.totalHrs < this.MAX_WORKING_HRS) {
			this.totalDays++;
			int empCheck = empChoice();
			this.setTotalHrs(empCheck);
		}
		this.totalWage = calSalary();
		System.out.println(this.nameOfCompany +" - Days Worked: " +this.totalDays);
		System.out.println(this.nameOfCompany +" - Hours Worked: " + this.totalHrs);
		System.out.println(this.nameOfCompany +" - Total wage earned: " + this.totalWage);
		System.out.println("\n");
	}
	public static void main(String[] args) {
		UC9a company1 = new UC9a("TCS" ,25, 110,23);
		UC9a company2 = new UC9a("CGI" ,22, 100,28);

		company1.calcTotalWage();
		company2.calcTotalWage();

	}
}
