package com.nou.nowcoder;

import java.util.Scanner;

public class HJ59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String value = sc.next();

        ipToLongByBitOperation(ip);
        longToIpByBitOperation(Long.valueOf(value));


    }

    /**
     * 通过位运算解决
     * @param ip
     */
    public static void ipToLongByBitOperation(String ip){

        String[] parts = ip.split("\\.");
        Long a = Long.valueOf(parts[0]);
        Long newA = a<<24;
        Long b = Long.valueOf(parts[1]);
        Long newB = b<<16;
        Long c = Long.valueOf(parts[2]);
        Long newC = c<<8;
        Long d = Long.valueOf(parts[3]);

        System.out.println(newB+newA+newC+d);

    }

    public static void longToIpByBitOperation(Long longValue){

        long a = longValue&0xff000000>>24;
        long b = longValue&0x00ff0000>>16;
        long c = longValue&0x0000ff00>>8;
        long d = longValue&0x000000ff;

        System.out.println(a+"."+b+"."+c+"."+d)
        ;
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
