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


    }
}
