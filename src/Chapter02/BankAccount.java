package Chapter02;

public class BankAccount {
    private int balance; // 잔액
    private Person owner; // 소유주

    public BankAccount(int pBalance){
        if(pBalance < 0){
            balance = 0;
        }else balance = pBalance;
    }

    public BankAccount(Person pOwner){
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner){
        if(pBalance < 0){
            balance = 0;
        } else{
            balance = pBalance;
            owner = pOwner;
        }
    }

    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public int getBalance(){
        return balance;
    }

    public void setOwner(Person newOwner){
        owner = newOwner;
    }

    public Person getOwner(){
        return owner;
    }
    // 입금 메소드
    // 파라미터: 입금할 액수 (정수)
    // 리턴: 성공여부 (불린)
    boolean deposit(int amount){
        if(owner.getCashAmount()>= amount && amount >= 0){
            balance += amount;
            owner.setCashAmount(owner.getCashAmount()-amount);
            System.out.println(amount + "원 입금하셨습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    // 메소드 오버로딩
    public boolean deposit(double amount, double exchangeRate){
        return deposit((int) (amount * exchangeRate));
    }


    // 출금 메소드
    // 파라미터: 출금할 액수 (정수)
    // 리턴: 성공여부 (불린)
    boolean withdraw(int amount){
        if(amount <= balance && amount >= 0){
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount()+amount);
            System.out.println(amount + "원 출금하셨습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    // 계좌이체 메소드
    // 첫번째 파라미터: 받는 사람 (Person)
    // 두번째 파라미터: 이체할 금액 (정수)
    // 리턴: 성공여부 (불린)
    boolean transfer(Person to, int amount){
        return transfer(to.getAccount(), amount);
    }

    boolean transfer(BankAccount to, int amount){
        if (amount>= 0 && amount <= balance){
            balance -= amount;
            to.setBalance(to.getBalance()+amount);
            System.out.println("true - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
            return true;
        } else{
            System.out.println("false - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
            return false;
        }
    }
}
