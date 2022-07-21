public class Texi {


    int texiNumber;
    int fuelVolume = 100;
    int currentSpeed;

    int destinationDistance = 0;//목적지 거리
    int baseRate = 3500;
    int baseDistance;
    int farePerDistance =100;//거리당 요금
    int finalPrice = 0;
    int maxPassenger=0;
    int plusspeed;
    int minusspeed;

    int peopleExistence=0;
    String status = "일반";

    public Texi() {
        this.texiNumber = (int)(Math.random()*100);
        System.out.print(texiNumber+"번 택시");
    }


    Boolean gasRemaining(){
        return fuelVolume >= 10;
    }
    void texifuelStatus() {
        if(gasRemaining()) {
            System.out.println("운행 가능.");

        }
        if(!gasRemaining()) {
            System.out.println("의 주유량을 확인해 주세요.");
        }
    }

    ////현재탑승객



    void peopleride1(int passenger){
        peopleExistence += passenger;

    }
    void peopleride2(){
        if(peopleExistence==0){
            status = "일반";
        } else{
            status = "운행 중";   // 근데 엘스는 나머지 다니까 기름 없어도 운행 중으로 뜨려나?? 밑에 if문으로 추가해서 고쳐야하나  Q&A
        }
    }

    boolean texiStatus(){
        if (status.equals("일반")){
            System.out.println("탑승 가능");
            return true;
        }
        if (status.equals("운행 중")){
            System.out.println("탑승 불가능.");

        }
        return false;
    }


    boolean passengerBoarding1(int people){
        if (status.equals("일반")) {
            maxPassenger += people;

            if (maxPassenger >= 1 && maxPassenger < 5) {
                System.out.println("안전히 모시겠습니다 손님");
                return false;
            }
            if (maxPassenger > 4) {
                System.out.println("인원 초과로 탑승 불가입니다.");
                return true;
            }
        }
        return true;
    }




    void acceleration(int speed){

        if (status.equals("일반")) {
            if (maxPassenger > 4) {
                System.out.println("인원 초과로 탑승 불가입니다.");
            }else {

                currentSpeed += speed;
                if (currentSpeed >= 0) {
                    System.out.println("현재 속도는 " + currentSpeed + "입니다.");
                }

                if (currentSpeed < 0) {
                    System.out.println("더이상 감속 할 수 없습니다.");
                }
            }

        }
    }

    void speedControlUp(int speedup){
        if (status.equals("일반")) {
            if (maxPassenger > 4) {
                System.out.println("인원 초과로 탑승 불가입니다.");
            }else {
                plusspeed += speedup;
                System.out.println("빨리가자 하셨으니 " + plusspeed + "만큼 더 달립니다");
                System.out.println("이제 속도는 " + (currentSpeed + plusspeed) + "이 됩니다.");
            }
        }

    }

    void speedControlDown(int speeddown){
        if (status.equals("일반")) {
            if (maxPassenger > 4) {
                System.out.println("인원 초과로 탑승 불가입니다.");
            }else {
                minusspeed += speeddown;

                if (currentSpeed + plusspeed > minusspeed) {
                    System.out.println("천천히가자 하셨으니 " + (-minusspeed) + "만큼 덜 달립니다");
                    System.out.println("이제 속도는 " + (currentSpeed + plusspeed - minusspeed) + "이 됩니다.");
                } else {
                    System.out.println("더이상 감속 할 수 없습니다.");
                }
            }
        }
    }

    void destinationRequest(int dis){
        destinationDistance = dis;
    }

    void rateCalculation(){
        if(destinationDistance <= baseDistance){
            finalPrice = baseRate;
            System.out.println("최종 요금은 " + finalPrice + "입니다.");
        }else{
            finalPrice = baseRate + (destinationDistance - baseDistance) * farePerDistance;
            System.out.println("최종 요금은 " + finalPrice + "입니다.");
        }
    }








}
