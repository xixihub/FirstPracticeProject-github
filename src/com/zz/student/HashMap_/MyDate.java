package com.zz.student.HashMap_;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@Data
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public int compareTo(MyDate o) {
        if (this.year == o.year) {
            if (this.month == o.month) {
                return this.day - o.day;
            } else {
                return this.month-o.month  ;
            }
        }
        return this.year - o.year;
    }
}
