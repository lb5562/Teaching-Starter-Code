package Classes;

public class Product implements IProduct{
    private String name;
    private double price;
    private Condition condition;
    private int code;

    public Product(String name,int price, Condition condition,int code){
        this.name = name;
        this.price =price;
        this.condition = condition;
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public double getProductCode() {
        return code;
    }
}
