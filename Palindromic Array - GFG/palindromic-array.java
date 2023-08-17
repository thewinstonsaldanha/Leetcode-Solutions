//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0; i<n; i++){
                      String numstr= Integer.toString(a[i]);
                      int start=0;
                      int end= numstr.length()-1;
                      
                      while(start<end){
                          if(numstr.charAt(start)!= numstr.charAt(end)){
                              return 0;
                              
                          }
                          start++;
                          end--;
                      }
                  }
                  return 1;
           }
}