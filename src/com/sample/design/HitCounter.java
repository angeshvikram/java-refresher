package com.sample.design;

import java.util.Arrays;

public class HitCounter {

    int[] times, hits;
    int timeRange;

    /** Initialize your data structure here. */
    public HitCounter(int range) {
        times = new int[range];
        hits = new int[range];
        timeRange = range;
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
    	System.out.println("---------- Adding timestamp " + timestamp);
        int idx = timestamp % timeRange;
        System.out.println("idx: " + idx + ", times[idx]: " + times[idx] + ", times: " + Arrays.toString(times));
        if (times[idx] != timestamp) {
            times[idx] = timestamp;
            hits[idx] = 1;
        } else {
//            ++hits[idx];
        	hits[idx] = hits[idx] + 1;
        }
        System.out.println("times: " + Arrays.toString(times));
        System.out.println("hits: " + Arrays.toString(hits));
        System.out.println("---------- END timestamp " + timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int res = 0;
        for (int i = 0; i < timeRange; ++i) {
            if (timestamp - times[i] < timeRange) {
                res += hits[i];
            }
        }
        System.out.println(res);
        return res;
    }
    
    public static void main(String[] args) {
    	test2();
    }
    
    private static void test1() {
    	HitCounter counter = new HitCounter(5);

    	// hit at timestamp 1. 
    	counter.hit(1);

    	// hit at timestamp 2. 
    	counter.hit(2);

    	// hit at timestamp 3. 
    	counter.hit(3);

    	// get hits at timestamp 4, should return 3. 
    	counter.getHits(4);

    	// hit at timestamp 300. 
    	counter.hit(300);
    	counter.hit(300);

    	// get hits at timestamp 300, should return 4. 
    	counter.getHits(300);

    	// get hits at timestamp 301, should return 3. 
    	counter.getHits(301);
    	
    	counter.getHits(302);
    	
    	// get hits at timestamp 301
    	counter.hit(310);
    	counter.getHits(301);
    }
    
    private static void test2() {
    	HitCounter counter = new HitCounter(5);

    	// hit at timestamp 0 
    	counter.hit(0);
    	counter.hit(0);
    	
    	// hit at timestamp 1. 
    	counter.hit(1);
    	counter.hit(1);

    	// hit at timestamp 2. 
    	counter.hit(2);
    	
    	// hit at timestamp 201
    	counter.hit(201);
    	counter.hit(201);
    }
}
