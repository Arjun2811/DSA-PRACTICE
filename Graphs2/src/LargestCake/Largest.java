package LargestCake;

public class Largest {


public static int Largest(char[][]board,boolean visited[][],int i,int j,int n)

{

visited[i][j]=true;


int []arrfori={0,0,-1,1};
int []arrforj={1,-1,0,0};

    int f=0;
    while(f<4)
    {
        int newi=i+arrfori[f];
        int newj=j+arrforj[f];
        if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length&&board[newi][newj]=='1'&&visited[newi][newj]==false)
        {
            int ans=Largest(board,visited,newi,newj,n+1);
            return ans;
        }
        f++;
    }
    visited[i][j]=false;
   return n;


}



public static int helper(char[][]board)
{
    boolean visited[][]=new boolean[board.length][board[0].length];
    int i=0;
    int ans=-1;
    int max=Integer.MIN_VALUE;
    while(i<visited.length)
    {
        int j=0;
        while(j<visited[0].length)
        {
            if(board[i][j]=='1')
            {
                  ans=Largest(board,visited,i,j,1);
                  if(ans>max)
                  {
               max=ans;
                  }
            }
            j++;
         
        }
        i++;
    }
    if(max>=1)
    {
    return max;
}
else{
    return 0;
}


}



    public static void main(String[]args)
    {
        String arr[]={"111110","111110"};
        char [][]board=new char[arr.length][arr[0].length()];
        int i=0;
        while(i<arr.length)
        {
            int j=0;
            while(j<arr[0].length())
            {
                board[i][j]=arr[i].charAt(j);
                j++;
            }
            i++;
        }
       int ans= helper(board);
       System.out.println(ans);
    }
}
