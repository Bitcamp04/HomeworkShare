package homework._2024_05_03.basic;

public class HybridCar implements ElectronicCar,FuelCar{
    @Override
    public void charge() {
        System.out.println("���͸� ����");
    }

    @Override
    public void addFuel() {
        System.out.println("���� ��");
    }

    @Override
    public void speedUp() {
        System.out.println("�ӵ� ����");
    }

    @Override
    public void speedDown() {
        System.out.println("�ӵ� ����");
    }
}
