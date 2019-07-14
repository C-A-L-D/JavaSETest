package com.hw.basicAPI;

import java.io.IOException;

public class BasicRuntime {

    public static void main(String[] args) {
        //唯一的静态方法，获取与当前Java程序关联的运行时对象
        Runtime r = Runtime.getRuntime();
        Log.d("jvm处理器数量：" + r.availableProcessors());
        Log.d("jvm空闲内存数：" + r.freeMemory() / (1024.0 * 1024 *1024) + "GB");
        Log.d("jvm总内存数：" + r.totalMemory() / (1024.0 * 1024 *1024) + "GB");
        Log.d("jvm可用最大内存数：" + r.maxMemory() / (1024.0 * 1024 *1024) + "GB");

        Log.d();
        Log.d("启动记事本");
        Log.d("启动word");
        try {
            r.exec("notepad.exe");
            r.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.d();
        Log.d("强制垃圾回收");
        r.gc();
    }
}
