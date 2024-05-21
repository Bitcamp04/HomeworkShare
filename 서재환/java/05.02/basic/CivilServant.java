package homework._2024_05_02.basic;

public class CivilServant extends Worker{
    @Override
    public void attendance() {
        System.out.println("시청 출근하기 싫어");
    }

    @Override
    public void leaveWork() {
        System.out.println("정시 퇴큰 좋아");
    }

    @Override
    public void work() {
        System.out.println("민원인 너무 많아");
    }
}
