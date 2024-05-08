package homework._2024_05_02.basic;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cat extends animal{
    @Override
    public void speak(){
        System.out.println("으르렁 대다");
    }

    @Override
    public void eat(){
        System.out.println("뜯어 먹다.");
    }

}
