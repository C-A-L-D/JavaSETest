package com.hw.array;

        import java.util.Arrays;

/**
 * 这是一个Arrays测试类
 *
 * @author pengjun
 * @version 1.0
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 6, 7, 9, 2, 5, 4, 7, 5, 8};//静态初始化
        //排个序
        Arrays.sort(a);//排序有整体排序，也有部分排序方法
        //排序后打印
        System.out.println(Arrays.toString(a));
        //二分法索引key的位置（必须排序后）
        System.out.println(Arrays.binarySearch(a, 4));
        //复制
        int[] b = Arrays.copyOfRange(a, 2, 4);
        System.out.println(Arrays.toString(b));
        //填充
        Arrays.fill(b, 10);
        System.out.println(Arrays.toString(b));
        //判断是否相等
        System.out.println(Arrays.equals(a, b));
    }


}
