package Classes;

/**
 * An interface that defines the code set of methods that all toys must
 * implement.
 */
public interface IProduct {

    /**
     Get name of Product
     @return string
     */
    String getName();

    /**
        Get price of Product
        @return int-Price
     */
    double getPrice();

    /**
     Condition of Product
     Get price of Product
     @return Condition
     */
    Condition getCondition();

    /**
     Get product code of Product
     @return product code
     */
    double getProductCode();


}
