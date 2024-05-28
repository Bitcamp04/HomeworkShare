package homework._2024_05_03.basic;

public class HybridCar implements ElectronicCar,FuelCar{
    @Override
    public void charge() {
        System.out.println("배터리 충전");
    }

    @Override
    public void addFuel() {
        System.out.println("주유 중");
    }

    @Override
    public void speedUp() {
        System.out.println("속도 증가");
    }

    @Override
    public void speedDown() {
        System.out.println("속도 감소");
    }
}
