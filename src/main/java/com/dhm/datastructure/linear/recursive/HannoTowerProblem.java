package com.dhm.datastructure.linear.recursive;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2018/11/6 20:36
 * 汉诺塔问题
 */
public class HannoTowerProblem {
    public static void main(String[] args) {
        move(3, 'X', 'Y', 'Z');
    }

    /**
     * // 将 n 个盘子从 x 借助 y 移动到 z
     *
     * @param n
     * @param x
     * @param y
     * @param z
     */
    private static void move(int n, Character x, Character y, Character z) {
        if (n == 1) {
            System.out.println(x + ">" + z);
        } else {
            // 将 n-1 个盘子从 x 借助 z 移到 y 上
            move(n - 1, x, z, y);
            // 将 第 n 个盘子从 x 移到 z 上
            System.out.println(x + ">" + z);
            // 将 n-1 个盘子从 y 借助 x 移到 z 上
            move(n - 1, y, x, z);
        }
    }
}
