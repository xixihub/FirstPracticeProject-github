package com.zz.student.codeBlock;

import lombok.Data;

/**
 * @author zz
 * @time 2021/11/24
 * @description 代码块练习
 */
@Data
public class CodeBlock {
    private int num;
    private  String name;
    public static String staticName="11";
    {
        System.out.println("这是初始化块");
    }
    static {
        System.out.println("这是静态初始化块");
    }
    public CodeBlock(int num) {
        System.out.println("这是默认构造块");
    }
    public CodeBlock(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("这是构造块");
    }

}
