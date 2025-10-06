package Chapter02;

// 클래스 안에 변수는 객체의 속성이 됨.

public class Person {
    private String name; // 사람
    private int age; // 나이 -> 접근 제어자: private 이 클래스 내에서만 사용 가능
    private int cashAmount; // 소유 계좌
    private BankAccount account;

    public Person(String pName, int pAge, int pCashAmount){
        name = pName;
        if(pAge < 0){
            age = 12;
        }else age = pAge;

        if(pCashAmount < 0){
            cashAmount = 0;
        }else {
            cashAmount = pCashAmount;
        }
    }

    public Person(String pName, int pAge){
        name = pName;
        cashAmount = 0;
        if(pAge < 0){
            age = 12;
        }
    }

    public void setAge(int newAge){
        if (newAge >= 0){
            age = newAge;
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setCashAmount(int newCashAmount){
        if (newCashAmount >= 0){
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount(){
        return cashAmount;
    }

    public void setAccount(BankAccount newAccount){
        account = newAccount;
    }

    public BankAccount getAccount(){
        return account;
    }

    // 계좌이체 메소드
    // 첫번째 파라미터: 받는 사람 (Person)
    // 두번째 파라미터: 이체할 금액 (정수)
    // 리턴: 성공여부 (불린)
    boolean transfer(Person to, int amount){
        return transfer(to.getAccount(), amount);
    }

    boolean transfer(BankAccount to, int amount){
        if (amount>= 0 && amount <= getAccount().getBalance()){
            getAccount().setBalance(getAccount().getBalance() - amount);
            to.setBalance(to.getBalance()+amount);
            System.out.println("true - from: " + getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getAccount().getBalance());
            return true;
        } else{
            System.out.println("false - from: " + getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getAccount().getBalance());
            return false;
        }
    }
}
