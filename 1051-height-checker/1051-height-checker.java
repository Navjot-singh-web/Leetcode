class Solution {
    public int heightChecker(int[] heights) {
        int min = Arrays.stream(heights).min().getAsInt();
        int max = Arrays.stream(heights).max().getAsInt();

        int m = max - min + 1;
        int n = heights.length;
        int[] c = new int[m];

        for (int i = 0; i < n; i++) {
            c[heights[i] - min]++;
        }

        for (int i = 1; i < m; i++) {
            c[i] += c[i - 1];
        }

        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int index = heights[i] - min;

            ans[c[index] - 1] = heights[i];
            c[index]--;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (ans[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}