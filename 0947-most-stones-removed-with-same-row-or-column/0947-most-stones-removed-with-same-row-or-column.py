class Solution:
    def removeStones(self, stones: List[List[int]]) -> int:
        def find_root(root_id):
            """
            Recursive function that finds the root of a disjoint set.
            Path compression is applied to flatten the structure for efficiency.
            """
            if parent[root_id] != root_id:
                parent[root_id] = find_root(parent[root_id])
            return parent[root_id]

        # Given the constraints of the problem, there can be at most 20000 nodes
        # because stones could be placed in rows and columns 0 through 9999.
        num_nodes = 10000
        # Create an array representing the disjoint set forest with an initial parent of itself.
        parent = list(range(num_nodes * 2))
      
        # Iterate through each stone and unify their row and column into the same set.
        for x, y in stones:
            parent[find_root(x)] = find_root(y + num_nodes)

        # Use a set comprehension to store the unique roots of all stones' rows and columns.
        unique_roots = {find_root(x) for x, _ in stones}
      
        # Calculate how many stones can be removed by subtracting the number of unique sets
        # (which have to remain) from the total number of stones.
        return len(stones) - len(unique_roots)

# Note: This code assumes that the List class has been imported from the typing module:
# from typing import List
