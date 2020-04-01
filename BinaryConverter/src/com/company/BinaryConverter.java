package com.company;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class BinaryConverter {



    public static void getBinary(Integer Decimal){
        int[] BinaryNumbers = new int[32];
        int Number = Decimal;
        int Count =0;
        while (Number > 0){
             if (Number % 2 ==0){
                 BinaryNumbers[Count] = 0;
             }
             else if (Number % 2 == 1){
                 BinaryNumbers[Count] = 1;
             }
             Number/=2;
             Count++;
        }

        for(int j = 0; j < Count; j++){
            System.out.println(BinaryNumbers[j]);
        }



        }
    }

