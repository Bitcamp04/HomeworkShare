package homework._2024_05_02.advanced;

public class EmployeePermanent extends Employee{
    static final int type=1;
    int bonus;
    public EmployeePermanent(int eno, String name, int salary ,int bonus) {
        super(eno, name, salary, type);
        this.bonus = bonus;
    }
    @Override
    double getMonthPay() {
        return pay/12+bonus/12;
    }

    @Override
    void showEmployeeInfo(){
        System.out.println("Eno: " + eno);
        System.out.println("Name: " + name);
        System.out.println("Pay: " + pay);
        System.out.println("Type: " + type);
        System.out.println("Bonus: " + bonus);
    }
}
