public class EmployeeWageBuilder implements EmployeeWage {
    private int noOfCompanies = 0;
    private CompanyEmpWage[] companyEmpWages;

    public EmployeeWageBuilder() {
        companyEmpWages = new CompanyEmpWage[2];
    }

    public static void main(String[] args) {

        EmployeeWageBuilder employeeWageBuilderArray = new EmployeeWageBuilder();
        employeeWageBuilderArray.addCompanyEmpWages("Accenture", 20, 25, 100);
        employeeWageBuilderArray.addCompanyEmpWages("Wipro", 25, 25, 100);
        employeeWageBuilderArray.calculateEmpWage();
    }

    private void addCompanyEmpWages(String company, int wagePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyEmpWages[noOfCompanies] = new CompanyEmpWage(company, wagePerHr, numOfWorkingDays, maxHrsPerMonth);
        noOfCompanies++;
    }

    public void calculateEmpWage() {
        for (int i = 0; i < noOfCompanies; i++) {
            companyEmpWages[i].setTotalEmpWage(this.calculateEmpWage(companyEmpWages[i]));
            System.out.println(companyEmpWages[i].toString());
        }
    }

    //Method to Calculate Employee Wage by Hours and Type
    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
        // Local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Compute Emp Wage for Month
        while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;     //Incrementing Working Days
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No :" + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.wagePerHr;
    }
}
