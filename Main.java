package temp2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int im = 3;
        int[] maxs = new int[im];
        int[] arr = {58, 12, 35, 57, 21, 100, 56, 75};

        maxs[0] = arr[0];



//улучшенный алгоритм O(k*n)
/*        for (int i = 0; i < arr.length; i++) {
            if (i < maxs.length)
                maxs[i] = arr[i];
            else {
                int index = findMin(maxs);
                if (maxs[index] < arr[i])
                    maxs[index] = arr[i];
            }
        }*/

// O(n^2)
/*        for (int i = 0; i < im; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!dubArray(maxs, arr[j])) {
                    if (maxs[i] < arr[j])
                        maxs[i] = arr[j];
                }
            }
        }*/
        System.out.println(Arrays.toString(maxs));
    }


    public static int findMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static boolean dubArray(int[] maxs, int element) {
        for (int max : maxs) {
            if (max == element)
                return true;
        }
        return false;
    }
}

