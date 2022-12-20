public interface EmployeeWage {
    //Constants for class
    int IS_PART_TIME = 1;
    int IS_FULL_TIME = 2;

    //Methods for Calculating Employee Wages
    void calculateEmpWage();

    int calculateEmpWage(CompanyEmpWage companyEmpWage);
}