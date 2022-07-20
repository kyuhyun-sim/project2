package pkg;

public class ModifierTest {
    private void messageInside(){
        System.out.println("this is private modifier");
    }
    public void messageOutside(){
        System.out.println("this i public modifier");
        messageInside();//private는 같은 클래스 내에서만 접근이 가능하니 여기서만 접근이 가능함
    }
    protected void messageProtected(){
        System.out.println("this i protcted modifier");
    }

}
