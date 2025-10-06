package Chapter02;

public class BankDriver {
    public static void main(String[] args){
        // 사람 선언
        /*Person p1 = new Person(); // 생성자는 인스턴스를 생성해주고 생성된 인스턴스를 리턴해준다.
        p1.setName("박하은");
        p1.setAge(23);
        p1.setCashAmount(50000);*/

        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);
        // 은행 계좌 생성
        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);
        p1.setAccount(a1);

        /*Person p2 = new Person();
        p2.setName("박하민");
        p2.setAge(26);
        p2.setCashAmount(100000);*/
        Person p2 = new Person("문종모", 25, 100000);

        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);

        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);

        /*System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));*/

        // 테스트
        /*System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.cashAmount);
        System.out.println(p1.account.balance);
        System.out.println(a1.owner.name);*/
    }
}
