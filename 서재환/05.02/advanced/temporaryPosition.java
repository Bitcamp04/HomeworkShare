package homework._2024_05_02.advanced;

public class temporaryPosition extends Employee{
    static final int type=3;
    int hireYear;
    public temporaryPosition(int eno, String name, int salary, int hireYear) {
        super(eno, name, salary, type);
        this.hireYear = hireYear;
    }
    @Override
    double getMonthPay() {
        return pay/12;
    }

    @Override
    void showEmployeeInfo(){
        System.out.println("Eno: " + eno);
        System.out.println("Name: " + name);
        System.out.println("Pay: " + pay);
        System.out.println("Type: " + type);
        System.out.println("Hire Year: " + hireYear);
    }
}
