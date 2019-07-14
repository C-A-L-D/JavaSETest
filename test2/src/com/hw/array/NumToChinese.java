package com.hw.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 这是一个浮点数转换成人名币读法的小实验
 *
 * @author pengjun
 * @version 1.0
 */
public class NumToChinese {
    private static String[] chinaArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private static String[] untilArr = {"十","佰","千","万"};

    /**
     * 该方法分离整数和小数
     *
     * @return String[]
     */
    private static String[] divide(String num){
        double numDouble = Double.valueOf(num);
        long zheng = (long)numDouble;
        long xiao = (long)((numDouble - zheng) * 100);
        return new String[]{zheng + "",String.valueOf(xiao)};
    }

    private static String readMoney(String num){
        StringBuilder result = new StringBuilder();
        int jishu = 0;
        String[] numStr = divide(num);
        System.out.println("分离结果："+Arrays.toString(numStr));
        //下面为核心算法
        for (int i = 0; i < numStr[0].length(); i++){
            int n = numStr[0].charAt(i) - 48; //第i个字符ASCII码-48得到int型的值
            if (i == 0 && n == 0)
                result.append(chinaArr[n]);
            if (i == numStr[0].length() - 1 || n == 0){
                if (i == numStr[0].length() - 1){
                    if (n == 0)
                        continue;
                }

                if (n == 0){
                    jishu++;
                    if (jishu > 1){
                        continue;
                    }
                }
                else{
                    jishu = 0;
                }
                result.append(chinaArr[n]);
            }
            else if (n != 0 && i != numStr[0].length() - 1){
                result.append(chinaArr[n]).append(untilArr[numStr[0].length() - 2 - i]);
            }
        }
        result.append("点");
        for (int j = 0; j < numStr[1].length(); j++){
            int nn = numStr[1].charAt(j) - 48;
            result.append(chinaArr[nn]);
        }
        result.append("圆");
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numStr = scan.nextLine();
        System.out.println(readMoney(numStr));
    }
}
