package com.company.decoded_string_at_index;

public class Decoded_String_at_index {

    public static void main(String[] args) {
//        the output of the first problem as given is the test example is wrong,
//        the 10th letter is "a" as opposed to "o" that is reported in the problem statement
        System.out.println(decodedStringAtIndex("chaka2stocks3", 10));
        System.out.println(decodedStringAtIndex("ha22", 5));
        System.out.println(decodedStringAtIndex("a2345678999999999999999", 1));
    }


    public static String decodedStringAtIndex(String str, int k){
        long size =0;
        int value = str.length();
//        finding the size
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                size = size*(c-'0');
            }else{
                size++;
            }
        }

//        iterating form backwards
        for(int i = value-1; i>=0; i--){
            char c = str.charAt(i);
            k%=size;
            if((k==0 || k == size) && Character.isLetter(c)){
                return Character.toString(c);
            }
            if(Character.isDigit(c)){
                size = size/(c-'0');
            }else{
                size--;
            }
        }
        return null;
    }
}
