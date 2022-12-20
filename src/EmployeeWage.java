public interface EmployeeWage {
    //Constants for Class
    int IS_PART_TIME = 1;
    int IS_FULL_TIME = 2;

    //Methods for Calculating Employee Wages
    void calculateEmpWage();

    int calculateEmpWage(CompanyEmpWage companyEmpWage);
}