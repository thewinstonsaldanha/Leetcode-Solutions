//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
         int result = 0;
  
  // Get the dimensions of the matrix
  int n = matrix.length;
  int m = matrix[0].length;
  
  // Loop through the matrix elements
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      // If the element is 1, check its surroundings
      if (matrix[i][j] == 1) {
        // Initialize a variable to count the number of 0's in the surroundings
        int zeros = 0;
        
        // Check the eight possible directions: up, down, left, right, and four diagonals
        // Use a nested loop to simplify the code
        for (int x = -1; x <= 1; x++) {
          for (int y = -1; y <= 1; y++) {
            // Skip the current element itself
            if (x == 0 && y == 0) continue;
            
            // Calculate the row and column indices of the surrounding element
            int row = i + x;
            int col = j + y;
            
            // Check if the indices are valid and within the matrix bounds
            if (row >= 0 && row < n && col >= 0 && col < m) {
              // If the surrounding element is 0, increment the zeros variable
              if (matrix[row][col] == 0) zeros++;
            }
          }
        }
        
        // If the number of zeros is even and greater than zero, increment the result variable
        if (zeros % 2 == 0 && zeros > 0) result++;
      }
    }
  }
  
  // Return the final result
  return result;
    }
}