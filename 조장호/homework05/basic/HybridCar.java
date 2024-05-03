package homework05.basic;

public class HybridCar implements ElectronicCar, FuelCar{

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도를 올립니다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 줄입니다.");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료를 채웁니다.");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("전기를 충전합니다.");
	}

}
