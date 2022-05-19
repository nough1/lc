package com.nou.lc.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=61tN4YEdiTM
 * https://leetcode-cn.com/problems/restore-ip-addresses/
 *
 */
public class LC93 {

    public List<String> restoreIpAddresses(String s) {

        List<String> result = new ArrayList<>();
        if(s==null ||s.length()==0||s.length()>12){
            return result;
        }

        restoreIp(s,result,"",0,0);

        return  result ;
    }

    public void restoreIp(String s,List<String> result,String restored,int index ,int count){


        if(count>4){
            return;
        }

        // error2 missing index==s.length()
        if(count==4 && index==s.length()){
            result.add(restored);
            return;
        }

        for(int i=1;i<4;i++){

            // error1 equal
            if(index+i>s.length()){
                break;
            }
            String section = s.substring(index,index+i);

            if(section.charAt(0)=='0' && section.length()>1){
                continue;
            }

            if(Integer.valueOf(section)>255){
                continue;
            }

            restoreIp(s,result,restored+section+(count==3?"":"."),index+i,count+1);

        }
    }
}
