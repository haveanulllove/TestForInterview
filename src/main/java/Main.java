import supermarket.Supermarket;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        // 创建苹果、草莓和芒果的测试案例
        int appleQuantity = 10; // 苹果数量
        int strawberryQuantity = 5; // 草莓数量
        int mangoQuantity = 3; // 芒果数量

        // 计算预期的总价
        // 苹果: 10 * 8 = 80
        // 草莓: 5 * 13 * 0.8 = 52
        // 芒果: 3 * 20 = 60
        // 总价应该是：80 + 52 + 60 = 192
        BigDecimal expectedTotal = new BigDecimal("192");

        // 计算实际总价
        BigDecimal actualTotal = supermarket.calculateTotal(appleQuantity, strawberryQuantity, mangoQuantity);

        // 断言测试，验证实际总价是否与预期总价一致
        assert actualTotal.compareTo(expectedTotal) == 0 : "断言失败：计算的总价与预期不符";

        System.out.println("断言成功，计算的总价与预期一致。");
    }
}