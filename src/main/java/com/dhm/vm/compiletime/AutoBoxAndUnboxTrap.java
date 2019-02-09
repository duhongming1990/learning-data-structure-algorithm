package com.dhm.vm.compiletime;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/9 13:36
 *
 * Integer默认的是[-128, 127]的缓存范围
 * -XX:AutoBoxCacheMax=1000
 */
public class AutoBoxAndUnboxTrap {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }


}