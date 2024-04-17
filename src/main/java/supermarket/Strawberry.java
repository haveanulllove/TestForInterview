package supermarket;

import java.math.BigDecimal;

public class Strawberry extends Product{
    /**
     * 草莓类构造函数，设置草莓的价格
     */
    public Strawberry() {
        super(BigDecimal.valueOf(13.0)); // 草莓的价格为 13.0 元/斤
    }
    /**
     * 计算购买特定数量的草莓的总花费，应用8折促销
     * @param quantity 购买的草莓数量
     * @return 打折后草莓的总花费
     */
    public BigDecimal calculateDiscountCost(int quantity) {
        BigDecimal discountRate = BigDecimal.valueOf(0.8);
        return price.multiply(discountRate).multiply(BigDecimal.valueOf(quantity));
    }

}
