package homework._2024_05_13.basic;


import lombok.Getter;

@Getter
public enum BasicEnum {
    KOR("한국","불고기"),
    CHI("중국","짜장면"),
    JAP("일본","초밥"),
    USA("미국","햄버거");

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
