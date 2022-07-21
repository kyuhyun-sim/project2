public class Main {
    public static void main(String[] args){
        Bus bus = new Bus();
        //System.out.println(bus.busStatus());
        //System.out.println(bus.riding());
        bus.busStatus(); //버스 현재 상태.
        bus.passengerStatus(); //버스 현재 승객 수
        bus.riding(5);// 버스 탑승할 승객 수 입력
        bus.passengerStatus();
        bus.acceleration(220);//버스 가속 or 감속 할 속도 입력
        bus.instrumentPanel();
        bus.oiling(100);//버스 경유 채우거나 뺄 량 입력
        bus.revenue();//버스 현재 수익
        bus.riding(20);
        bus.passengerStatus();
        bus.revenue();

        Bus bus2 = new Bus();
        bus2.passengerStatus();


        Texi texi = new Texi();



        texi.peopleride1(0);    //불가능 뜨면 밑에 전부 지우는거 어케하지? //태운 손님 0일시 일반 1일시 운행 중
        texi.peopleride2();
        texi.texiStatus();
        texi.passengerBoarding1(5);         //탑승인원 4명까지 가능
        texi.acceleration(10);                  //현재속도
        texi.speedControlUp(30);                   //속도 업
        texi.speedControlDown(50);                 //속도 다운





    }
}
