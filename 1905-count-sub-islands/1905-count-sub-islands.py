class Solution:
    def countSubIslands(self, grid1: List[List[int]], grid2: List[List[int]]) -> int:
        # Depth-first search function to explore the island in grid2 and check if it's a sub-island of grid1
        def dfs(row, col):
            is_sub_island = grid1[row][col] == 1  # Check if the current position is land in grid1
            grid2[row][col] = 0  # Mark the current position in grid2 as visited (water)
            # Explore in all 4 neighboring directions (left, right, up, down)
            for delta_row, delta_col in [[0, -1], [0, 1], [-1, 0], [1, 0]]:
                new_row, new_col = row + delta_row, col + delta_col
                # If the new position is within the bounds and is land in grid2
                if 0 <= new_row < num_rows and 0 <= new_col < num_cols and grid2[new_row][new_col] == 1:
                    # If any part of the island in grid2 is not in grid1, it's not a sub-island
                    if not dfs(new_row, new_col):
                        is_sub_island = False
            return is_sub_island

        # Get the number of rows and columns in either of the grids
        num_rows, num_cols = len(grid1), len(grid1[0])

        # Count the number of sub-islands in grid2 that are also in grid1
        sub_islands_count = 0
        for row in range(num_rows):
            for col in range(num_cols):
                # If the current position is land in grid2 and is also a sub-island
                if grid2[row][col] == 1 and dfs(row, col):
                    sub_islands_count += 1

        # Return the total count of sub-islands
        return sub_islands_count