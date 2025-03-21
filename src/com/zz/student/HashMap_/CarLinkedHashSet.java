package com.zz.student.HashMap_;

import lombok.Data;

import java.util.Objects;

/**
 * @author zz
 * @version 1.0
 * @Description 创建一个LinkedHashSet集合，存储3个Car对象，使用程序实现判断Car集合是否包含
 */
@SuppressWarnings("all")
@Data
public class CarLinkedHashSet {
    /**
     * 车辆名称
     */
    private String name;
    /**
     * 车辆价格
     */
    private  double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarLinkedHashSet that = (CarLinkedHashSet) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public CarLinkedHashSet(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
