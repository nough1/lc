package com.nou.nowcoder;

import java.util.Scanner;

public class HJ59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String value = sc.next();

        ipToLong(ip);
        long2Ip(Long.valueOf(value));


    }

    public static void ipToLong(String ip){

        StringBuilder sb = new StringBuilder();
        String[] parts = ip.split("\\.");
        for(String part:parts){

            Long longValue = Long.valueOf(part);
            String bstr = Long.toBinaryString(longValue);

            for(int i=0;i<(8-bstr.length());i++){
                sb.append("0");
            }
            sb.append(bstr);
        }
        long result = Long.valueOf(sb.toString(),2);
        System.out.println(result);
    }

    public static void long2Ip(long value){

        String binaryString = Long.toBinaryString(value);
        StringBuilder paddingBinaryString = new StringBuilder();
        for(int i=0;i<(32-binaryString.length());i++){
            paddingBinaryString.append("0");
        }
        paddingBinaryString.append(binaryString);

        StringBuilder result = new StringBuilder();

        for(int i=0;i<4;i++){

            result.append(Long.valueOf(paddingBinaryString.substring(i*8,(i+1)*8),2));
            if(i!=3){
                result.append(".");
            }
        }
        System.out.println(result);
    }
}
