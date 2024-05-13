package homework._2024_05_13.middle;

public class CoffeeTest {
    public static void main(String[] args) {
        System.out.println(Coffee.AMERICANO.totalPrice(2,1)+Coffee.LATTE.totalPrice(1,0)
        +Coffee.MOCHA.totalPrice(2,0)+Coffee.COLDBREW.totalPrice(0,2));
    }
}
