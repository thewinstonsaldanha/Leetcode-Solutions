class Solution {
    public int shortestPath(int[][] grid, int k) {
        //Initializing grid length , directions, storing visited cells, queue 
        int m= grid.length;
        int n= grid[0].length;
        int [][] DIR= {{0,1}, {0, -1}, {-1, 0}, {1, 0}};
        boolean[][][] v= new boolean[m][n][k+1];
        Queue<int[]> q= new LinkedList<>();
        int steps=0;
        
        //initializing
        q.offer(new int[]{0, 0, k});
        
        while(!q.isEmpty()){
            int size= q.size();
            while(size-- >0){
                int [] curr= q.poll();   //fetch the current position
                if (curr[0]==m-1 && curr[1]== n-1) return steps;  //if it is the current position
                
                for(int[]d: DIR){  //Go in all the directions now 
                    int i= curr[0]+ d[0];
                    int j= curr[1]+d[1];
                    int obs= curr[2];
                    
                    
                    if(i>=0 && i<m && j>=0 && j<n){
                //if the cell is empty, visit the cell and add it in the queue
                        if ( grid[i][j]==0 && !v[i][j][obs]){
                            q.offer(new int[]{i, j, obs});
                            v[i][j][obs]= true;
                        }
                        else if ( grid[i][j]==1 && obs>0 &&!v[i][j][obs-1]){
                            q.offer(new int[]{i, j, obs-1});
                            v[i][j][obs-1]= true;
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
        
    }
}