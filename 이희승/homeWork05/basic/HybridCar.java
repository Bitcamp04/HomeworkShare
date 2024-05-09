package homeWork.homeWork05.basic;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedup() {
		// TODO Auto-generated method stub
		System.out.println("속도를 높인다");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 내린다");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료를 채운다");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("전기를 충전한다");
	}

	
}
