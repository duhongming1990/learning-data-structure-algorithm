package com.dhm.algorithm.bloomfilter;


import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/12/12 16:05
 */
public class BloomFilterUtil {
    @Test
    public void hashMapTest(){
        long star = System.currentTimeMillis();
        Set<Integer> hashset = new HashSet<>(100) ;
        for (int i = 0; i < 1000_0000; i++) {
            hashset.add(i) ;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }

    @Test
    public void bloomFilterTest(){

        long star = System.currentTimeMillis();
        BloomFilterTest bloomFilters = new BloomFilterTest(10000000) ;
        for (int i = 0; i < 10000000; i++) {
            bloomFilters.add(i + "") ;
        }

        Assert.assertTrue(bloomFilters.check(1+""));
        Assert.assertTrue(bloomFilters.check(2+""));
        Assert.assertTrue(bloomFilters.check(3+""));
        Assert.assertTrue(bloomFilters.check(999999+""));
        Assert.assertFalse(bloomFilters.check(400230340+""));
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }


    @Test
    public void guavaTest() {
        long star = System.currentTimeMillis();
        BloomFilter<Integer> filter = BloomFilter.create(
                Funnels.integerFunnel(),
                10000000,
                0.01);

        for (int i = 0; i < 10000000; i++) {
            filter.put(i);
        }

        Assert.assertTrue(filter.mightContain(1));
        Assert.assertTrue(filter.mightContain(2));
        Assert.assertTrue(filter.mightContain(3));
        Assert.assertFalse(filter.mightContain(10000000));
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }









}