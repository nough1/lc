package com.nou.lc.backtracking;

/**
 * https://leetcode.com/problems/24-game/
 */
public class LC679 {

    public boolean judgePoint24(int[] cards) {


        double[] a = new double[]{cards[0],cards[1],cards[2],cards[3]};


        return helper(a);
    }

    public boolean helper(double[] a){

        // 这里为什么要用 math.abs , 否则就会错误
        if(a.length==1)return  Math.abs(a[0]- 24.0) < 0.0001;

        for(int i=0;i<a.length-1;i++)
            for(int j=i+1;j<a.length;j++){

                double[] b = new double[a.length-1];
                int index = 0;
                for(int k=0;k<a.length;k++){

                    if(k!=i && k!=j){

                        b[index++] = a[k];
                    }

                }
                for(double c:compute(a[i],a[j])){

                    b[b.length-1] = c  ;
                    if(helper(b)){
                        return true;
                    }


                }
            }
        return false;
    }

    public double[] compute(double one,double two ){

        return new double[]{one+two,one-two,two-one,one*two,one/two,two/one};

    }
}
