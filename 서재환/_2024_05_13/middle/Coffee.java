package homework._2024_05_13.middle;


import lombok.Getter;

@Getter
public enum Coffee {
    AMERICANO(2000) {
        @Override
        int totalPrice(int optionorder, int nomarlorder) {
            return ((this.getValue()+300)*optionorder)+(nomarlorder*this.getValue());
        }
    }, LATTE(3000) {
        @Override
        int totalPrice(int optionorder, int nomarlorder) {
            return ((this.getValue()+500)*optionorder)+(nomarlorder*this.getValue());
        }
    }, MOCHA(4000) {
        @Override
        int totalPrice(int optionorder, int nomarlorder) {
            return ((this.getValue()+1000)*optionorder)+(nomarlorder*this.getValue());
        }
    }, COLDBREW(4500) {
        @Override
        int totalPrice(int optionorder, int nomarlorder) {
            return ((this.getValue()+200)*optionorder)+(nomarlorder*this.getValue());
        }
    };
    private int value;
    private Coffee(int value) {
        this.value = value;
    }


    abstract int totalPrice(int optionorder,int nomarlorder);
}
