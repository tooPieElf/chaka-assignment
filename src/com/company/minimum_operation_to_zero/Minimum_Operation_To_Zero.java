package com.company.minimum_operation_to_zero;

public class Minimum_Operation_To_Zero {

    public static void main(String[] args) {
        System.out.println(minReduceToZero(new int[]{1,1,4,2,3},5));
        System.out.println(minReduceToZero(new int[]{5,6,7,8,9},4));
        System.out.println(minReduceToZero(new int[]{3,2,20,1,1,3},10));
    }

    public static int minReduceToZero(int[] arrays, int value){
        int target = -value;
        for(int i : arrays) target+=i;
        if(target==0) return arrays.length;
        if(target<0) return -1;
        int result  =-1, sum = 0, left = 0;
        for(int i=0; i<arrays.length;i++){
            sum+=arrays[i];
            while(sum>target){
                sum -=arrays[left++];
            }
            if(sum== target){
                result = Math.max(result, i-left+1);
            }
        }
        return result == -1 ? -1 : arrays.length-result;
    }

}
