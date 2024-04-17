package supermarket;

import java.math.BigDecimal;

public class Product  {
    // 商品价格
    protected BigDecimal price;

    /**
     * 构造函数，初始化商品价格
     * @param price 商品的单价
     */
    public Product (BigDecimal price) {
        this.price = price;
    }

    /**
     * 计算购买特定数量的商品的总花费
     * @param quantity 购买的商品数量
     * @return 商品的总花费
     */
    public BigDecimal calculateCost(int quantity) {
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
