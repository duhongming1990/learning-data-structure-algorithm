package com.dhm.binary;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/11/21 15:46
 */
public class BinaryConversion {
    public static void main(String[] args) {
        // 十进制转二进制
        String binaryStr = Integer.toBinaryString(16);
        // 十进制转八进制
        String octalStr = Integer.toOctalString(16);
        // 十进制转十六进制
        String hexStr = Integer.toHexString(16);

        // 二进制转十进制
        Integer binaryInt = Integer.valueOf(binaryStr,2);
        // 八进制转十进制
        Integer octalInt = Integer.valueOf(octalStr,8);
        // 十六进制转十进制
        Integer hexInt = Integer.valueOf(hexStr,16);
    }
}