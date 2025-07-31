package ConnectingDots;
public class Connecting {



public static boolean Connecting(char[][]board,boolean [][]visited,int i,int j,int originali,int originalj,int n)
{
    visited[i][j]=true;
if(n>=4)
{
    int []arrfori={0,0,-1,1};
    int []arrforj={1,-1,0,0};
int f=0;
while(f<4)
{
    int newi=i+arrfori[f];
    int newj=j+arrforj[f];

    if(newi==originali&&newj==originalj)
    {
        return true;
    }
    f++;
}

}


   

int []arrfori={0,0,-1,1};
int []arrforj={1,-1,0,0};

    int f=0;
    while(f<4)
    {
        int newi=i+arrfori[f];
        int newj=j+arrforj[f];
        if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length&&board[i][j]==board[newi][newj]&&visited[newi][newj]==false)
        {
           boolean ans= Connecting(board,visited,newi,newj,originali,originalj,n+1);
           if(ans==true)
           {
            return ans;
           }
        }
        f++;
    }
    visited[i][j]=false;
    return false;

}





public static boolean helper(char[][]board)
{

boolean visited[][]=new boolean[board.length][board[0].length];
int i=0;
while(i<visited.length)
{
    int j=0;
    while(j<visited[0].length)
    {
        boolean ans=Connecting(board,visited,i,j,i,j,1);
        if(ans==true)
        {
            return true;
        }
        j++;
    }
    i++;
}
return false;


}


    public static void main(String[]args)
    {
        String arr[]={"AAAAAB","ABBBAB","ABAAAB","ABABBB","ABAAAB","ABBBAB","AAAAAB"};
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
        boolean ans=helper(board);
        System.out.println(ans);
    }
}
