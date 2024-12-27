public class ApiTestSuite {
    public static void main(String[] args) {
    	
        //POST - Create Employee
        CreateEmployeeTest.createEmployee();

        //GET - Retrieve the Employee
        GetEmployeeTest.getEmployee(CreateEmployeeTest.employeeId);

        //PATCH - Update the Employee
        UpdateEmployeeTest.updateEmployee(CreateEmployeeTest.employeeId);

        //DELETE - Remove the Employee
        DeleteEmployeeTest.deleteEmployee(CreateEmployeeTest.employeeId);
    }
}
