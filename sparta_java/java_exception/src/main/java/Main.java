import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("대구");
        list.add("서울");
        System.out.println(list);

        List<String> result = list.stream().limit(2).collect(Collectors.toList());//앞에 있는 2개까지 stream 처리된것을 어떻게 모을건지  정의. 그와중 collectors.toList를 통해 또 다른 리스트를 만들거라 정의함.
        System.out.println(result);//collect(Collectors.toList())를 통해 result는 list와 별도의 리스트로 생성됨.
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();


    }
}