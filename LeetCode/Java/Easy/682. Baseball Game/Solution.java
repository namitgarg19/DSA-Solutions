class Solution {
    public int calPoints(String[] operations) {

        int[] arr = new int[operations.length];
        int i = 0;
        for (String op : operations) {
            if (op.equals("+")) {
                arr[i] = arr[i - 1] + arr[i - 2];
                i++;
            } else if (op.equals("D")) {
                arr[i] = 2 * arr[i - 1];
                i++;
            } else if (op.equals("C")) {

                i--;
            } else {
                arr[i] = Integer.parseInt(op);
                i++;
            }
        }
        int sum = 0;
        
        for (int j = 0; j < i; j++) {
            sum += arr[j];
        }
        return sum;
    }
}