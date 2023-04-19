public class Solution {
  public int maxSum(int[][] grid) {
    int ans = 0;
    int m = grid.length;
    int n = grid[0].length;

    for (int i = 1; i + 1 <m ; i++)
      for (int j = 1; j + 1 <n ; j++)
        ans = Math.max(ans, grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] + grid[i][j] + grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1]);

    return ans;
  }
}
