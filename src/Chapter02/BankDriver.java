package Chapter02;

public class BankDriver {
    public static void main(String[] args){
        // 사람 선언
        Person p1 = new Person(); // 생성자는 인스턴스를 생성해주고 생성된 인스턴스를 리턴해준다.
        p1.setName("박하은");
        p1.setAge(23);
        p1.setCashAmount(50000);

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.setBalance(250000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        Person p2 = new Person();
        p2.setName("박하민");
        p2.setAge(26);
        p2.setCashAmount(100000);

        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

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
