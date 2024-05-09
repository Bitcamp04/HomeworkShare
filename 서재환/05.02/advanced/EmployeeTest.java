package homework._2024_05_02.advanced;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new EmployeePermanent(1,"a",10000,1000);
        employee.showEmployeeInfo();
        System.out.println(employee.getMonthPay());
        employee=new temporaryPosition(2,"b",10000,2024);
        employee.showEmployeeInfo();
        System.out.println(employee.getMonthPay());
        employee=new contractWorker(3,"c",10,15);
        employee.showEmployeeInfo();
        System.out.println(employee.getMonthPay());
    }
}
