package com.sample.design;

import java.util.Arrays;

public class RateLimiter {

    int[] times, hits;
    int timeRange;
    private long startTime; // milliseconds

    /** Initialize your data structure here. */
    public RateLimiter(int range) {
        times = new int[range];
        hits = new int[range];
        timeRange = range;
        startTime = System.currentTimeMillis();
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    private void hit(int timestamp) {
        int idx = timestamp % timeRange;
        if (times[idx] != timestamp) {
            times[idx] = timestamp;
            hits[idx] = 1;
        } else {
            hits[idx] = hits[idx] + 1;
        }
        System.out.println("---------- Adding timestamp " + timestamp);
        System.out.println("times: " + Arrays.toString(times));
        System.out.println("hits: " + Arrays.toString(hits));
        System.out.println("---------- END timestamp " + timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    private int getHits(int timestamp) {
        int totalHits = 0;
        for (int i = 0; i < timeRange; ++i) {
            if (timestamp - times[i] < timeRange) {
                totalHits += hits[i];
            }
        }
        return totalHits;
    }
    
    public void makeCall() {
    	long currentTime = System.currentTimeMillis();
    	int currentTimeinSeconds = (int)(currentTime - startTime)/1000;
    	System.out.println("startTime: " + startTime + ", currentTime: " + currentTime + ", currentTimeInSeconds: " + currentTimeinSeconds);
    	hit(currentTimeinSeconds);
    	
    	int totalHits = getHits(currentTimeinSeconds);
    	System.out.println("totalHits: " + totalHits);
    }
    
    
    public static void main(String[] args) {
    	RateLimiter limiter = new RateLimiter(3);
    	
    	try {
    		limiter.makeCall();
    		limiter.makeCall();
    		
			Thread.sleep(1000); // 1 sec
			limiter.makeCall();
			
			Thread.sleep(1000); // 2 sec
			limiter.makeCall();
			
			Thread.sleep(1000); // 3 sec
			limiter.makeCall();
			
			Thread.sleep(1000); // 4 sec
			limiter.makeCall();
			
			Thread.sleep(1000); // 5 sec
			limiter.makeCall();
			
			Thread.sleep(1000); // 6 sec
			
			Thread.sleep(1000); // 7 sec
			
			Thread.sleep(1000); // 8 sec
			limiter.makeCall();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
