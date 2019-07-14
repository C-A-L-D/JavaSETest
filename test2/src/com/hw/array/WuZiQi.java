package com.hw.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 用Arrays工具类写一个简单的五子棋
 *
 * @author pengjun
 * @version 1.0
 */
public class WuZiQi {

    private static int QIPAN_SIZE = 15;
    private static String[][] qiPan;

    /**
     * 初始化棋盘
     */
    private static void init(){
        qiPan = new String[QIPAN_SIZE][QIPAN_SIZE];
        for (int i = 0; i < qiPan[0].length; i++)
            for (int j = 0; j < qiPan[1].length; j++)
                qiPan[i][j] = "👢";
        printQiPan();}

    /**
     * 打印或刷新棋盘
     */
    private static void printQiPan(){
        for (String[] i:qiPan){
            for (String j:i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.print("请输入您落子坐标(如：5,3)：");
    }

    private static void computerPlay(){
        Random random = new Random();
        int x = random.nextInt(QIPAN_SIZE - 1);
        int y = random.nextInt(QIPAN_SIZE - 1);
        if (qiPan[x][y] == "👢"){
            qiPan[x][y] = "🐷";
            System.out.println(x+","+y);
        }
        else {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                        computerPlay();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        printQiPan();
    }

    private static void play(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while(true){
            try {
                if (((inputStr = br.readLine()) != null)){
                    String[] posStrArr = inputStr.split(",");
                    int xPos = Integer.parseInt(posStrArr[0]);
                    int yPos = Integer.parseInt(posStrArr[1]);
                    qiPan[xPos][yPos] = "😋";
                    printQiPan();

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(2000);
                                computerPlay();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        init();
        play();
    }
}
