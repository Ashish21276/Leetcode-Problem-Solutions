class Solution {

    public int uniquePaths(int m, int n) {
        long count = 0;
        long[][] arr = new long[m][n];
        count = fun(m, n, 0, 0, count, arr);
        int x = (int) (count / 2);
        return x;
    }

    long fun(int m, int n, int i, int j, long count, long[][] arr) {
        if (i == m && j == n - 1 || i == m - 1 && j == n) {
            count++;
            return count;
        }
        if (i < 0 || j < 0 || i >= m || j >= n)
            return 0;

        if (arr[i][j] != 0) {
            count = arr[i][j];
            return count;
        }

        long x = fun(m, n, i, j + 1, count, arr) + fun(m, n, i + 1, j, count, arr);
        arr[i][j] = x;
        return x;
    }
}
//Another one
class Solution {

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        int total = fun(m, n, 0, 0, dp);
        return total;
    }

    int fun(int m, int n, int i, int j, int[][] dp) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if (i >= m || j >= n) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        dp[i][j] = fun(m, n, i + 1, j, dp) + fun(m, n, i, j + 1, dp);
        return dp[i][j];
    }
}
//One More
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return fun(m, n, dp, 0, 0);
    }

    int fun(int m, int n, int[][] dp, int i, int j) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        dp[i][j] = fun(m, n, dp, i + 1, j) + fun(m, n, dp, i, j + 1);
        return dp[i][j];
    }
}

