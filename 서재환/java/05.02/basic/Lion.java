package homework._2024_05_02.basic;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Lion extends Cat{
    @Override
    public void speak(){
        System.out.println("어흥");
    }

    @Override
    public void eat(){
        System.out.println("갈기갈기 찢어 뜯어 먹다.");
    }
}
