public class Bus {
    int maximumNumberOfPassenger = 30;
    int CurrentNumberOfPassenger = 0;
    int money = 0;
    int busNumber;
    int fuelVolume = 10;
    int currentSpeed = 0;
    String status = "운행";

    public Bus() {
        this.busNumber = (int)(Math.random()*100);
        System.out.print(busNumber+"번 버스");
    }

    Boolean gasRemaining(){
        return fuelVolume >= 10;
    }
    void busStatus() {
        if(gasRemaining()) {
            System.out.println("는 운행 중입니다.");

        }
        if(!gasRemaining()) {
            System.out.println("의 주유량을 확인해 주세요.");
            status = "차고지행";
        }
    }

    void passengerStatus(){
        if(gasRemaining()){
            System.out.println("현재 버스안의 승객 수는 "+CurrentNumberOfPassenger+"명 입니다.");

        }
        if(!gasRemaining()){
            System.out.println("현재 탑승이 불가능한 상태 입니다.");
        }
    }

    void riding(int people){
        CurrentNumberOfPassenger += people;

        if(maximumNumberOfPassenger>= CurrentNumberOfPassenger && 0<= CurrentNumberOfPassenger){
            money += people * 1100;
        }else if(maximumNumberOfPassenger < CurrentNumberOfPassenger){
            System.out.println("탑승 인원을 초과하여 " + (maximumNumberOfPassenger - (CurrentNumberOfPassenger - people)) + "명의 승객만 탑승 하였습니다.");//5 +32 37 30 37-32 25
            money = (maximumNumberOfPassenger - (CurrentNumberOfPassenger - people)) * 1100;
            CurrentNumberOfPassenger = maximumNumberOfPassenger;

        }else{
            System.out.println((CurrentNumberOfPassenger - people) + "명 외에 더 이상 내릴 승객이 존재하지 않습니다.");
            CurrentNumberOfPassenger = 0;
        }
    }

    void acceleration(int speed){
        currentSpeed += speed;
        if(currentSpeed < 0){
            System.out.println("더이상 감속 할수 없습니다.");
            currentSpeed = 0;
        }else if(currentSpeed > 160){
            System.out.println("버스의 속도는 최대치인 160을 초과할수 없습니다.");
            currentSpeed = 160;
        }
    }

    void instrumentPanel(){
        System.out.println("현재 속도는 " + currentSpeed + "입니다.");
    }

    void oiling(int supply){
        fuelVolume += supply;
        if(fuelVolume < 0){
            System.out.println("경유가 바닥났습니다.");
            fuelVolume = 0;
        }
        else if(fuelVolume > 100){
            System.out.println("경유가 가득 찼습니다.");
            fuelVolume = 100;
        }
    }

    void revenue(){
        System.out.println("지금까지 " + money + "원의 수익을 벌어들였습니다.");
    }




}
