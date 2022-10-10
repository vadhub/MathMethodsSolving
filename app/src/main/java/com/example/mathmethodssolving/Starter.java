package com.example.mathmethodssolving;


import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        int[][] a = {
                {2, 10, -3, 38},
                {-3, -24, 5, -86},
                {1, -3, -5, 27}
        };

        int[][] b = GaussMethod.pivotSwap(a,0);
        GaussMethod.zeroField(b);
        //nullable
        GaussMethod.print(b);
    }
}
