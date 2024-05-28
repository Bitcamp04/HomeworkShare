package homework._2024_05_02.advanced;

public class contractWorker extends Employee{
    static final int type=2;
    int workDay;
    public contractWorker(int eno, String name, int salary,int workDay) {
        super(eno, name, salary, type);
        this.workDay = workDay;
    }
    @Override
    double getMonthPay() {
        return pay*workDay;
    }

    @Override
    void showEmployeeInfo(){
        System.out.println("Eno: " + eno);
        System.out.println("Name: " + name);
        System.out.println("Pay: " + pay);
        System.out.println("Type: " + type);
        System.out.println("workDay: " + workDay);
    }

}
