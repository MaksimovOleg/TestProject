package arrays;

public class ValidMountainArray {
    public static boolean main() {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        boolean isInc = true;
        boolean result = false;
        if (arr.length == 2) {
            return false;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(isInc) {
                if (arr[i]>=arr[i + 1]) {
                    isInc = false;
                } else {
                    result = true;
                }

            } else {
                if (arr[i]<=arr[i + 1]) {
                    result = false;
                    break;
                }
            }
        }
        if (arr[arr.length-1]>= arr[arr.length-2]) result = false;
        return result;
    }
}
