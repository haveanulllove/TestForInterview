package supermarket;

import java.math.BigDecimal;

public class Supermarket {
    private Apple apple = new Apple(); // 创建苹果对象
    private Strawberry strawberry = new Strawberry(); // 创建草莓对象
    private Mango mango = new Mango(); // 创建芒果对象

    /**
     * 计算顾客购买苹果、草莓和芒果的总价
     * @param apples 购买的苹果数量
     * @param strawberries 购买的草莓数量
     * @param mangos 购买的芒果数量
     * @return 总价
     */
    public BigDecimal calculateTotal(int apples, int strawberries, int mangos) {
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(apple.calculateCost(apples));
        total = total.add(strawberry.calculateCost(strawberries));
        total = total.add(mango.calculateCost(mangos));
        return total;
    }
}
