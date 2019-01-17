package com.dhm.algorithm.bignumber;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/16 15:49
 */
public class BigNumberAdd {
    /**
     * 大整数求和
     *
     * @param bigNumberA 大整数A
     * @param bigNumberB 大整数B
     */
    public String bigNumberAdd(String bigNumberA, String bigNumberB) {

        //1.把两个大整数用数组逆序存储，数组长度等于较大整数位数+1
        int maxLength = bigNumberA.length() > bigNumberB.length() ? bigNumberA.length() : bigNumberB.length();

        int[] arrayA = new int[maxLength + 1];
        for (int i = 0; i < bigNumberA.length(); i++) {
            arrayA[i] = bigNumberA.charAt(bigNumberA.length() - 1 - i) - '0';
        }

        int[] arrayB = new int[maxLength + 1];
        for (int i = 0; i < bigNumberB.length(); i++) {
            arrayB[i] = bigNumberB.charAt(bigNumberB.length() - 1 - i) - '0';
        }

        //2.构建result数组，数组长度等于较大整数位数+1
        int[] tempResult = new int[maxLength + 1];

        //3.遍历数组，按位相加
        for (int i = 0; i < tempResult.length; i++) {
            int temp = tempResult[i] + arrayA[i] + arrayB[i];
            //判断是否进位
            if (temp >= 10) {
                temp = temp - 10;
                tempResult[i + 1] = 1;
            }
            tempResult[i] = temp;
        }

        //4.把result数组再次逆序并转成String
        boolean isFirstZero = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = tempResult.length - 1; i >= 0; i--) {

            if (!isFirstZero) {
                if (tempResult[i] == 0) {
                    continue;
                }
                isFirstZero = true;
            }

            stringBuilder.append(tempResult[i]);
        }

        return stringBuilder.toString();
    }

    public String bigNumberAddPlus(String bigNumberA, String bigNumberB) {

        //1.把两个大整数用数组逆序存储，数组长度等于较大整数位数+1
        int maxLength = bigNumberA.length() > bigNumberB.length() ? bigNumberA.length() : bigNumberB.length();
        int groupMaxLength = maxLength / 9 + 1;

        int[] arrayA = new int[groupMaxLength];
        for (int i = 0; i < groupMaxLength; i++) {
            int startIndex = bigNumberA.length()-(i+1)*9;
            int endIndex = bigNumberA.length()-i*9;
            if(startIndex<0){
                startIndex = 0;
            }
            arrayA[i] = Integer.parseInt(bigNumberA.substring(startIndex,endIndex));
        }

        int[] arrayB = new int[groupMaxLength];
        for (int i = 0; i < groupMaxLength; i++) {
            int startIndex = bigNumberB.length()-(i+1)*9;
            int endIndex = bigNumberB.length()-i*9;
            if(startIndex<0){
                startIndex = 0;
            }
            arrayB[i] = Integer.parseInt(bigNumberB.substring(startIndex,endIndex));
        }


        //2.构建result数组，数组长度等于较大整数位数+1
        int[] tempResult = new int[groupMaxLength];

        //3.遍历数组，按位相加
        for (int i = 0; i < tempResult.length; i++) {
            int temp = tempResult[i] + arrayA[i]+ arrayB[i];
            //判断是否进位
            if (temp >= Math.pow(10, 9)) {
                temp = temp - (int) Math.pow(10, 9);
                tempResult[i + 1] = 1;
            }
            tempResult[i] = temp;
        }

        //4.把result数组再次逆序并转成String
        boolean isFirstZero = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = tempResult.length - 1; i >= 0; i--) {

            if (!isFirstZero) {
                if (tempResult[i] == 0) {
                    continue;
                }
                isFirstZero = true;
            }
            stringBuilder.append(tempResult[i]);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        BigNumberAdd bigNumberAdd = new BigNumberAdd();
        bigNumberAdd.bigNumberAddPlus("426709752318", "95481253129");
    }
}