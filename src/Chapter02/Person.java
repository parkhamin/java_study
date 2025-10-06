package Chapter02;

// 클래스 안에 변수는 객체의 속성이 됨.

public class Person {
    private String name; // 사람
    private int age; // 나이 -> 접근 제어자: private 이 클래스 내에서만 사용 가능
    private int cashAmount; // 소유 계좌
    private BankAccount account;

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
}
