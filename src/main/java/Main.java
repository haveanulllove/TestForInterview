import supermarket.Supermarket;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        //假定apple10，strawberries5 mango3

        // 测试顾客A：仅购买苹果和草莓 正确值130
        assert supermarket.calculateTotalForCustomerA(10, 5).compareTo(new BigDecimal("10000")) == 0 : "顾客A的计算错误";

        // 测试顾客B：购买苹果、草莓和芒果 190
        assert supermarket.calculateTotalForCustomerB(10, 5, 3).compareTo(new BigDecimal("190")) == 0 : "顾客B的计算错误";

        // 测试顾客C：草莓打折 182
        assert supermarket.calculateTotalForCustomerC(10, 5, 3).compareTo(new BigDecimal("182")) == 0 : "顾客C的计算错误";

        // 测试顾客D：满减促销 257
        assert supermarket.calculatePromotionalTotal(5, 5, 5).compareTo(new BigDecimal("257")) == 0 : "顾客D的计算错误";


        System.out.println("计算的总价与预期一致。");
    }
}