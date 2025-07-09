public class emplyoeedetails {
    public class employeedetails {
    public static void main(String[] args) {
        String[][] employees = new String[10][2];
        {
            employees[0][0] = "15000";
            employees[0][1] = "thara";
            employees[1][0] = "20000";
            employees[1][1] = "thara";
            employees[2][1] = "25000";
            employees[2][2] = "thara";
            System.out.println("EmployeeDetails:");
            for (String[] employee : employees) {
                System.out.println("salary:" + employee[0] + "Name:" + employee[1]);
            }
            
        }
    }
}




    
}
