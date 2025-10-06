package Chapter02;

// 클래스 안에 변수는 객체의 속성이 됨.

public class Person {
    private String name; // 사람
    private int age; // 나이 -> 접근 제어자: private 이 클래스 내에서만 사용 가능
    private int cashAmount; // 소유 계좌
    private BankAccount account;

    public Person(String name, int age, int cashAmount){
        this.name = name;
        if(age < 0){
            this.age = 12;
        }else this.age = age;

        if(cashAmount < 0){
            this.cashAmount = 0;
        }else {
            this.cashAmount = cashAmount;
        }
    }

    public Person(String name, int age){
        this.name = name;
        this.cashAmount = 0;
        if(age < 0){
            this.age = 12;
        }
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCashAmount(int cashAmount){
        if (cashAmount >= 0){
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount(){
        return cashAmount;
    }

    public void setAccount(BankAccount account){
        this.account = account;
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
