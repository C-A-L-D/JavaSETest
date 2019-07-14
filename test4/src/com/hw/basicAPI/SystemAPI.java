package com.hw.basicAPI;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class SystemAPI {

    public static void main(String[] args) throws Exception{
        Log.d("验证三种标准流：");
        Log.d(System.in instanceof InputStream);
        System.out.println("123");
        System.err.println("456");      //显红色

        Log.d();
        Log.d("验证复制数组：");
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];
        System.arraycopy(a,0,b,0,5);
        Log.d("复制结果：" + Arrays.toString(b));

        Log.d();
        Log.d("验证获取当前时间戳：");
        Log.d(System.currentTimeMillis());  //毫秒级
        Log.d(System.nanoTime());           //纳秒级

        Log.d();
        Log.d("获取各种类型哈希码：");
        Log.d(System.identityHashCode("6666"));

        Log.d();
        Log.d("获取环境变量：");
        Log.d(System.getenv());         //返回Map<String,String>
        Log.d("查看JAVA_HOME的值：" + System.getenv("JAVA_HOME"));

        Log.d();
        Log.d("获取系统属性：");
        Properties p = System.getProperties();
        p.list(System.out);
        Log.d("将系统属性保存到文件中");
        p.store(new FileOutputStream("pro.txt"),"System Properties");
        Log.d("查看os.name的值：" + System.getProperty("os.name"));

        Log.d();
        Log.d("强制垃圾回收");
        System.gc();
    }
}
