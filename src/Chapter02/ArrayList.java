package Chapter02;

public class ArrayList {
    public static void main(String[] args) {
        // 배열: 변수 하나에 값을 여러 개 저장할 수 있어 유용
        // 단점: 처음에 배열의 크기를 정해야 함. 그 후에 변경할 수 없음.
        // 만약에 채워넣지 않은 값이 있다면 null이 되기도 함.
        // => 이러한 단점이 없는 자료형 : ArrayList
        String[] nameArray = new String[5];
        nameArray[0] = "김신의";
        nameArray[2] = "강영훈";
        nameArray[3] = "서혜린";
        nameArray[4] = "문종모";

        for (String name : nameArray)
            System.out.println(name);

        System.out.println("===================");
        java.util.ArrayList<String> nameList = new java.util.ArrayList<>();
        nameList.add("김신의");
        nameList.add("이윤수");
        nameList.add("성태호");
        nameList.add("문종모");
        nameList.add("김재원");
        nameList.add("박준하");
        nameList.add("권순현");
        nameList.add("박윤석");
        nameList.add("서혜린");

        nameList.remove(3);

        System.out.println(nameList.size());
        System.out.println(nameList);
        System.out.println("===================");

        java.util.ArrayList<Integer> numList = new java.util.ArrayList<>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        for (int num: numList){
            System.out.println(num * num);
        }
    }
}
