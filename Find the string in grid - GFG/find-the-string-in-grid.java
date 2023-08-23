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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
              List<List<Integer>> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int wordLength = word.length();
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == word.charAt(0)) {
                    if (searchInDirection(grid, row, col, word, 0, 1) || searchInDirection(grid, row, col, word, 1, 1) || searchInDirection(grid, row, col, word, 1, 0) || searchInDirection(grid, row, col, word, 1, -1) || searchInDirection(grid, row, col, word, 0, -1) || searchInDirection(grid,row,col,word,-1,-1) || searchInDirection(grid,row,col,word,-1,0) || searchInDirection(grid,row,col,word,-1,1)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(row);
                        temp.add(col);
                        result.add(temp);
                    }
                }
            }
        }
        
        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i][0] = result.get(i).get(0);
            res[i][1] = result.get(i).get(1);
        }
        
        return res;
    }

    private static boolean searchInDirection(char[][] grid,int x,int y,String word,int dx,int dy){
        int rows = grid.length;
        int cols = grid[0].length;
        int wordLength = word.length();
        
        for (int i = 0; i < wordLength; i++) {
            int newX = x + dx * i;
            int newY = y + dy * i;
            if (newX < 0 || newX >= rows || newY < 0 || newY >= cols || grid[newX][newY] != word.charAt(i)) {
                return false;
            }
        }
        return true;
        
        
    }
}