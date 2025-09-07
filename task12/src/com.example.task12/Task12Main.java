package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int sortIndex = 0;
        do {
            int minimal = arr[sortIndex];
            int index = sortIndex;
            for(int i = sortIndex; i < arr.length; i++){
                if (minimal >= arr[i]){
                    minimal = arr[i];
                    index = i;
                }
            }
            arr[index] = arr[sortIndex];
            arr[sortIndex] = minimal;
        } while (sortIndex++ < arr.length - 1);
    }

}