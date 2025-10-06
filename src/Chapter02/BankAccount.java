package Chapter02;

public class BankAccount {
    int balance; // 잔액
    Person owner; // 소유주

    // 입금 메소드
    // 파라미터: 입금할 액수 (정수)
    // 리턴: 성공여부 (불린)
    boolean deposit(int amount){
        if(owner.cashAmount>= amount && amount >= 0){
            balance += amount;
            owner.cashAmount -= amount;
            System.out.println(amount + "원 입금하셨습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        }else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
    }

    // 출금 메소드
    // 파라미터: 출금할 액수 (정수)
    // 리턴: 성공여부 (불린)
    boolean withdraw(int amount){
        if(amount <= balance && amount >= 0){
            balance -= amount;
            owner.cashAmount += amount;
            System.out.println(amount + "원 출금하셨습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        }else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
    }

    /*// 계좌이체 메소드
    // 첫번째 파라미터: 받는 사람 (Person)
    // 두번째 파라미터: 이체할 금액 (정수)
    // 리턴: 성공여부 (불린)
    boolean transfer(Person to, int amount){

    }*/
}
