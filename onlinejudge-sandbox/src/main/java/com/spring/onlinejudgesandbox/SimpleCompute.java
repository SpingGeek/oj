package com.spring.onlinejudgesandbox;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 测试代码，两数之和
 */
public class SimpleCompute {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("请提供两个整数作为参数，例如: java SimpleCompute 3 5");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("结果: " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("请输入有效的整数作为参数！");
        }
    }

}
