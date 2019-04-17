package com.sample.sorting.mergesort;

public class MergeSortSample1 {

	static int mergeCount = 0;
	static int mergeSortCount = 0;
	
    private static int[] merge(int[] a, int[] b) {
    	mergeSortCount++;
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i] <= b[j])  c[k] = a[i++];
            else                    c[k] = b[j++];
        }
        return c;
    }

    public static int[] mergesort(int[] input) {
    	mergeCount++;
        int N = input.length;
        if (N <= 1) return input;
        int[] a = new int[N/2];
        int[] b = new int[N - N/2];
        for (int i = 0; i < a.length; i++)
            a[i] = input[i];
        for (int i = 0; i < b.length; i++)
            b[i] = input[i + N/2];
        return merge(mergesort(a), mergesort(b));
    }


   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }



    // generate N real numbers between 0 and 1, and mergesort them
    public static void main(String[] args) {
        int[] a = new int[] { 20, 30, 10, 40, 25, 45 };
        int N = a.length;
        
        a = mergesort(a);
        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);
        }

        System.out.println(isSorted(a) + ", N: " + N + ", megeSortCount: " + mergeSortCount + ", mergeCount: " + mergeCount);
        System.out.println("N: " + N + ", n(logn): " + (N * Math.log(N)) + "");
    }
}