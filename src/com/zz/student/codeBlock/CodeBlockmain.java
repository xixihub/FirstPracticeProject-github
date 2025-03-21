package com.zz.student.codeBlock;

public class CodeBlockmain {
    public static void main(String[] args) {
        CodeBlock codeBlock = new CodeBlock(100);
        CodeBlock codeBlock1 = new CodeBlock(100);
        CodeBlock.staticName = "staticName";
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
