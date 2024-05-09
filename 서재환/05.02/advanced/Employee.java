package homework._2024_05_02.advanced;

public abstract class Employee {
    int eno;
    String name;
    int pay;
    int type; //1: 정규직, 2: 계약직, 3. 임시직

    public Employee(int eno, String name, int pay, int type) {
        this.eno = eno;
        this.name = name;
        this.pay = pay;
        this.type = type;
    }

    abstract double getMonthPay();

     void showEmployeeInfo(){
         System.out.println("Eno: " + eno);
         System.out.println("Name: " + name);
         System.out.println("Pay: " + pay);
         System.out.println("Type: " + type);
     }
}
