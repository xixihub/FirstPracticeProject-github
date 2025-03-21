package com.zz.student.oop_;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @data 2020/12/24
 * @description 重写equals方法
 */
@Data
public class Doctor {
    /**
     * 姓名
     */
    private String name;
    /**
     * 岗位
     */
    private String job;
    /**
     * 年龄
     */
    private int age;
    public Doctor(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return this.age == doctor.age && this.name.equals(doctor.name) && this.job.equals(doctor.job);
    }
}
