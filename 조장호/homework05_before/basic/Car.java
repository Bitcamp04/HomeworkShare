package homework05.basic;

/*
 * 1. Car(void speedUp(), void speedDown()) 인터페이스를 만들고
 *   Car를 상속받는 ElectronicCar(void charge()), FuelCar(void addFuel()) 인터페이스를 만들고
 *   ElectronicCar, FuelCar를 상속받는 HybridCar 클래스로 구현하세요.
 */
public interface Car {

	void speedUp();
	void speedDown();
}
