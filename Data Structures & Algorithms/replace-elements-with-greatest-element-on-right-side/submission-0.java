class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i + 1; j < arr.length; j++) {

                max = (arr[j] > max) ? arr[j] : max;
                System.out.println(" I " + i + " J " + j + " max: " + max);
            }
            result[i] = max;
        }
        return result;
    }
}