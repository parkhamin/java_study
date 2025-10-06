package Chapter02;

public class BankDriver {
    public static void main(String[] args){
        // 사람 선언
        Person p1 = new Person(); // 생성자는 인스턴스를 생성해주고 생성된 인스턴스를 리턴해준다.
        p1.name = "박하은";
        p1.age = 23;
        p1.cashAmount = 50000;

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 250000;

        p1.account = a1;
        a1.owner = p1;

        Person p2 = new Person();
        p2.name = "박하민";
        p2.age = 26;
        p2.cashAmount = 100000;

        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

        // 테스트
        /*System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.cashAmount);
        System.out.println(p1.account.balance);
        System.out.println(a1.owner.name);*/
    }
}
