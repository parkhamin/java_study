public static class MarketGood {
    // 인스턴스 변수
    private String name; // 상품의 이름
    private int retailPrice; // 상품의 출시 가격
    private int discountRate; // 상품의 할인율 (단위: %)

    // 생성자
    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100){
            discountRate = 0;
        }
        this.discountRate = discountRate;
    }

    public MarketGood(String name, int retailPrice){
        this(name, retailPrice, 0);
    }

    // Getter와 Setter 메소드
    public String getName(){
        return name;
    }

    public int getRetailPrice(){
        return retailPrice;
    }

    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    // 할인율 계산 메소드
    public int getDiscountedPrice(){
        return (int) (retailPrice * (1 - (discountRate / 100.0)));
    }
}

public static void main(String[] args){
    MarketGood g1 = new MarketGood("MacBook Air", 1250000);
    MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
    MarketGood g3 = new MarketGood("iPhone 7", 920000, 20);

    System.out.println(g1.getName() + "의 할인율: " + g1.getDiscountRate() + "%");
    System.out.println(g2.getName() + "의 할인율: " + g2.getDiscountRate() + "%");
    System.out.println(g3.getName() + "의 정상 가격: " + g3.getRetailPrice() + "원");
    System.out.println(g3.getName() + "의 할인 가격: " + g3.getDiscountedPrice() + "원");
    System.out.println("경쟁 업체가 많아져서 " + g3.getName() + "의 할인율이 35%로 올랐습니다.");
    g3.setDiscountRate(35);
    System.out.println(g3.getName() + "의 할인 가격: " + g3.getDiscountedPrice() + "원");
}
