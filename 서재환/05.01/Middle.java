package homework._2024_05_01;

import java.util.Random;

public class Middle {
    public static void main(String[] args) {
        Random rand = new Random();


    }
}
class PhoneInfo{
    String[] names = new String[100];
    String[] phoneNums = new String[100];

    int index = 0;

    public void insertPhoneInfo(String name, String phoneNum) {
        this.names[index] = name;
        this.phoneNums[index] = phoneNum;
        this.index++;
    }

    public void printAllPhoneInfo() {
        //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현
        for (int i = 0; i < index; i++) {
            System.out.println("name= "+names[i] + "phone number= " + phoneNums[i]);
        }
    }

    public void printPhoneInfo(int index) {
        //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
        System.out.println("name= "+names[index]+", phoneNum= "+phoneNums[index]);
    }
}