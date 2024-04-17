package supermarket;

import java.math.BigDecimal;

public class Apple extends Product{
    /**
     * 苹果类构造函数，设置苹果的价格
     */
    public Apple() {
        super(BigDecimal.valueOf(8.0)); // 苹果的价格为 8.0 元/斤
    }
}
