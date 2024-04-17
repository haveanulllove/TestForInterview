package supermarket;

import java.math.BigDecimal;

public class Supermarket {
    private Apple apple = new Apple(); // 创建苹果对象
    private Strawberry strawberry = new Strawberry(); // 创建草莓对象
    private Mango mango = new Mango(); // 创建芒果对象

    /**
     * 计算用户A的购买总价
     * @param apples
     * @param strawberries
     * @return
     */
    public BigDecimal calculateTotalForCustomerA(int apples, int strawberries) {
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(apple.calculateCost(apples));
        total = total.add(strawberry.calculateCost(strawberries));
        return total;
    }

    /**
     * 计算用户b购买总价
     * @param apples
     * @param strawberries
     * @param mangos
     * @return
     */
    public BigDecimal calculateTotalForCustomerB(int apples, int strawberries, int mangos) {
        BigDecimal total = calculateTotalForCustomerA(apples, strawberries);
        total = total.add(mango.calculateCost(mangos));
        return total;
    }

    /**
     * 顾客C 草莓打折
     * @param apples
     * @param strawberries
     * @param mangos
     * @return
     */

    public BigDecimal calculateTotalForCustomerC(int apples, int strawberries, int mangos) {
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(apple.calculateCost(apples));
        total = total.add(strawberry.calculateDiscountCost(strawberries)); // Apply discount for strawberries
        total = total.add(mango.calculateCost(mangos));
        return total;
    }
    /**
     * 顾客D：满减促销
     * @param apples
     * @param strawberries
     * @param mangos
     * @return
     */
    public BigDecimal calculatePromotionalTotal(int apples, int strawberries, int mangos) {
        BigDecimal total = calculateTotalForCustomerB(apples, strawberries, mangos);
        if (total.compareTo(BigDecimal.valueOf(100)) >= 0) {
            total = total.subtract(BigDecimal.valueOf(10));
        }
        return total;
    }
}
