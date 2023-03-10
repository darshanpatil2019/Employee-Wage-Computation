public class CompanyEmpWage {
    //Instance Variables
    public String companyName;
    public int wagePerHr;
    public int numOfWorkingDays;
    public int maxHrsPerMonth;
    public int totalEmpWage;

    //Parameterised Constructor for Initializing Variables
    public CompanyEmpWage(String companyName, int wagePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    //Override the toString() from String Class
    @Override
    public String toString() {
        return "Total Employee Wage for Company : " + companyName + " is : " + totalEmpWage;
    }
}