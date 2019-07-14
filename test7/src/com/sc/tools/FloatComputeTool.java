package com.sc.tools;

import java.math.BigDecimal;

/**
 * 该工具类功能：实现浮点数运算，防止计算时发生数据丢失
 * @author pengjun
 * @version 1.0
 */
public class FloatComputeTool {

    //除数最大精度为10
    private static final int DIV_MAX = 10;

    private FloatComputeTool() { }

    public static double add(double x, double y){
        BigDecimal bigDecimal1 = BigDecimal.valueOf(x);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(y);
        return bigDecimal1.add(bigDecimal2).doubleValue();
    }

    public static double sub(double x, double y){
        BigDecimal bigDecimal1 = BigDecimal.valueOf(x);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(y);
        return bigDecimal1.subtract(bigDecimal2).doubleValue();
    }

    public static double mul(double x, double y){
        BigDecimal bigDecimal1 = BigDecimal.valueOf(x);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(y);
        return bigDecimal1.multiply(bigDecimal2).doubleValue();
    }

    public static double div(double x, double y){
        BigDecimal bigDecimal1 = BigDecimal.valueOf(x);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(y);
        return bigDecimal1.divide(bigDecimal2, DIV_MAX, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
