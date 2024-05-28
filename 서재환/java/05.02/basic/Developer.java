package homework._2024_05_02.basic;

public class Developer extends Worker{
    @Override
    public void attendance() {
        System.out.println("출근하기 싫어 개발하기 싫어");
    }

    @Override
    public void leaveWork() {
        System.out.println("퇴근 좋아 야근했지만 좋아");
    }

    @Override
    public void work() {
        System.out.println("개발해야되 기한 얼마 안 남았어");
    }
}
