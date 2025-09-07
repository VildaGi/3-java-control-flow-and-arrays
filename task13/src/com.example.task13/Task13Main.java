package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return  arr;

        int[] oldArr = new int[0];
        int[] newArr = new int[0];
        int countOfNumbers = 1;
        for (int item : arr) {
            if (item < 1000) {
                if (oldArr.length == 0) {
                    oldArr = new int[]{item};
                    countOfNumbers++;
                    continue;
                }
                newArr = new int[countOfNumbers++];
                for (int i = 0; i < newArr.length; i++) {
                    if (i != newArr.length - 1) {
                        newArr[i] = oldArr[i];
                    }else
                        newArr[i] = item;
                }
                oldArr = newArr;
            }
        }
        return newArr;
    }

}