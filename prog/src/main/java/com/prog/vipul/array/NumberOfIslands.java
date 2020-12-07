package com.prog.vipul.array;

public class NumberOfIslands {

	public static void main(String[] args) {

		// int[][] landscape = { { 1, 1, 1, 1, 0 }, { 1, 1, 0, 1, 0 }, { 1, 1, 0, 0, 0
		// }, { 0, 0, 0, 0, 0 } };

		int[][] landscape = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1 } };

		NumberOfIslands islands = new NumberOfIslands();
		System.out.println(islands.numIslands(landscape));

	}

	public int numIslands(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;

		int numIslands = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == 1) {
					numIslands += dfs(grid, i, j);
				}
			}
		}

		return numIslands;
	}

	private int dfs(int[][] grid, int i, int j) {

		if (i < 0 || i >= grid.length || j < 0 || j >= grid.length || grid[i][j] == 0) {
			return 0;
		}

		grid[i][j] = 0;
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);

		return 1;
	}

}
