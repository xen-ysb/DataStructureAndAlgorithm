package com.xen.algortithm.time;

/**
 * @Description 基本概念 认识
 * @Author xen 991674945@qq.com
 * @Since 1.0
 * @Date 2023/3/25
 */
public class BaseConcept {
    /**
     * 我们怎么找时间复杂度：
     * 1.找到有循环的地方，
     * 2.找有网络请求（RPC，远程调用，分布式，数据库请求）的地方。
     * 就是测试时间：log打印，计算平均时间。
     *
     * 如何找出程序的空间复杂度：开了空间的地方， 比如 数组 链表，缓存对象，递归
     */
    public static void main(String[] args) {
        System.out.println(is2toTheN(127));
    }

    /**
     * 判断一个数是否是2的N次方。比如2 4 8 16 是的6 10 不是的就看这个数是不是可以拆成N个2相乘。
     * @param num 入参
     * @return
     */
    private static boolean is2toTheN(int num) {
        if ((num & (num-1)) == 0) {
            return true;
        }
        return false;
    }


}
