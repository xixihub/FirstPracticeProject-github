package com.zz.student.house;

import lombok.Data;

@Data
public class HouseModel {

    /**
     * 编号
     */
    private int id;
    /**
     * 房主
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 月租
     */
    private int rent;
    /**
     * 状态
     */
    private String state;
    public HouseModel(int id, String name, String phone, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    @Override
    public String toString() {
        return "HouseModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", rent='" + rent + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
