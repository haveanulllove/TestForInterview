package supermarket;

import java.math.BigDecimal;

public class Mango extends Product{
    /**
     * 芒果类构造函数，设置芒果的价格
     */
    public Mango() {
        super(BigDecimal.valueOf(20.0)); // 芒果的价格为 20.0 元/斤
    }
}
