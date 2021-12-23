public class DiverseArray {
    public static void main(String[] args) throws Exception {
        System.out.println("Array practice");
        int[][] a = {
            {1, 2, 12}, 
            {4, 5, 6}, 
            {7, 8, 9}, 
        };
// print not in any method except main

// 1. Complete a static method multiplesOf which takes two parameters.
        print1d(multiplesOf(5, 4));
// 2. Complete a static method reverseArray that takes an int array parameter.
        print1d(reverseArray(multiplesOf(2, 10)));
// 3. Complete three static methods arraySum, rowSums, and isDiverse.
        System.out.println(arraySum(multiplesOf(3, 10)));
        print1d(rowSums(a));
        if(isDiverse(a)){
            System.out.println("it is diverse");
        }

    }
    public static int[] multiplesOf(int num, int multiple) {
        int[] retarray = new int[multiple];
        for (int i = 1; i < retarray.length + 1; i++) {
            retarray[i - 1] = i * num;
        }
        return retarray;
    }
    public static void print1d(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }
    public static int[] reverseArray(int[] arr) {
        int[] retarray = new int[arr.length];
        for (int i = 0; i < retarray.length; i++) {
            retarray[i] = arr[arr.length - i - 1];
        }
        return retarray;
    }

    public static int arraySum(int[] arr) {
        int retint = 0;
        for (int index = 0; index < arr.length; index++) {
            retint += arr[index];
        }
        return retint;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] retarr = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                retarr[i] += arr2D[i][j];
            }
        }
        return retarr;
    }
    public static boolean isDiverse(int[][] arr2D) {
        int[] checkarr = rowSums(arr2D);
        for (int i = 0; i < checkarr.length; i++) {
            for (int j = 0; j < checkarr.length; j++) {
                if(j==i){
                    continue;
                }
                if(checkarr[j] == checkarr[i]){
                    return true;
                }
            }
        }
        return false;
    }

}
