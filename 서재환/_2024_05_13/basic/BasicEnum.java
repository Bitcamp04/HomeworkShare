package homework._2024_05_13.basic;


import lombok.Getter;

@Getter
public enum BasicEnum {
    KOR("�ѱ�","�Ұ��"),
    CHI("�߱�","¥���"),
    JAP("�Ϻ�","�ʹ�"),
    USA("�̱�","�ܹ���");

    private String CountyName;
    private String FoodName;
    BasicEnum(String CountyName, String FoodName) {
        this.CountyName = CountyName;
        this.FoodName = FoodName;
    }

    public void notifyFood(String countyName){
        if(countyName.equals(BasicEnum.USA.getCountyName())){
            System.out.println(BasicEnum.USA.getFoodName());
        }
        else if(countyName.equals(BasicEnum.CHI.getCountyName())){
            System.out.println(BasicEnum.CHI.getFoodName());
        }
        else if(CountyName.equals(BasicEnum.KOR.getCountyName())){
            System.out.println(BasicEnum.KOR.getFoodName());
        }
        else if(CountyName.equals(BasicEnum.JAP.getCountyName())){
            System.out.println(BasicEnum.JAP.getFoodName());
        }
    }
}
