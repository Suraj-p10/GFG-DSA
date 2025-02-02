#User function Template for python3

class Solution:
    
    # Function to check if a value can be placed at (row, col)
    def isPossible(self, grid, row, col, val):
        for i in range(9):
            if grid[row][i] == val:  # Check row
                return False
            if grid[i][col] == val:  # Check column
                return False
        
        # Check 3x3 subgrid
        start_row, start_col = 3 * (row // 3), 3 * (col // 3)
        for i in range(3):
            for j in range(3):
                if grid[start_row + i][start_col + j] == val:
                    return False
        
        return True
    
    # Recursive helper function to solve the Sudoku
    def solveSudokuHelper(self, grid):
        for i in range(9):
            for j in range(9):
                if grid[i][j] == 0:  # Empty cell found
                    for num in range(1, 10):
                        if self.isPossible(grid, i, j, num):
                            grid[i][j] = num
                            if self.solveSudokuHelper(grid):  # Recursive call
                                return True
                            grid[i][j] = 0  # Backtrack
                    return False  # No valid number found, trigger backtracking
        return True  # Sudoku is solved
    
    # Function to solve the Sudoku
    def solveSudoku(self, mat):
        return self.solveSudokuHelper(mat)
    
    # Function to print the solved Sudoku grid
    def printGrid(self, grid):
        for i in range(9):
            for j in range(9):
                print(grid[i][j], end=" ")
        print()

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    import sys
    input = sys.stdin.read
    data = input().split()

    t = int(data[0])
    index = 1

    for _ in range(t):
        matrix = []
        n = 9
        for i in range(n):
            row = list(map(int, data[index:index + n]))
            matrix.append(row)
            index += n
        obj = Solution()
        obj.solveSudoku(matrix)
        for i in range(n):
            for j in range(n):
                print(matrix[i][j], end=" ")
            print()
        print("~")

# } Driver Code Ends