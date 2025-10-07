package Chapter02;

public class ReferenceType {
    public static void main(String[] args){
        int[] a = new int[3];
        int[] b = a;

        a[0] = 1;
        b[0] = 2;

        System.out.println(a[0]);
        System.out.println(b[0]);

        Person[] people = new Person[5];
        people[0] = new Person("박하민", 26);
        people[2] = new Person("박하은", 23);
        people[3] = new Person("박룽지", 3);

        for (int i=0; i< people.length; i++){
            Person p = people[i];
            if (p != null){
                System.out.println(p.getName());
            }else {
                System.out.println(i + "번 자리는 비었습니다.");
            }
        }
    }
}
