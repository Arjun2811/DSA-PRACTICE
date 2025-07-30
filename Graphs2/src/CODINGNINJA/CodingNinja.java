package CODINGNINJA;

public class CodingNinja {



public static boolean Coding(char[][]board,String str,int n,boolean[][]visited,int i,int j)
{

    if(n==str.length())
    {
        return true;
    }
visited[i][j]=true;
int f=0;
int g=0;

int arrfori[]={0,0,-1,1,-1,-1,1,1};
int arrforj[]={1,-1,0,0,1,-1,-1,1};
while(f<8)
{
if(i+arrfori[g]>=0&&i+arrfori[g]<board.length&&j+arrforj[g]>=0&&j+arrforj[g]<board[0].length&&board[i+arrfori[g]][j+arrforj[g]]==str.charAt(n)&&visited[i+arrfori[g]][j+arrforj[g]]==false)
{

    boolean ans=Coding(board,str,n+1,visited,i+arrfori[g],j+arrforj[g]);
    if(ans==true)
    {
    return ans;
}
}
g++;
f++;
}
visited[i][j]=false;
return false;






}

public static boolean helper(char[][]board)
{
boolean visited[][]=new boolean[board.length][board[0].length];
int i=0;
while(i<board.length)
{
    int j=0;
    while(j<board[0].length)
    {
        if(board[i][j]=='C')
        {
           boolean ans= Coding(board,"CODINGNINJA",1,visited,i,j);
           if(ans==true)
           {
            return ans;
           }
        }
        j++;
    }
    i++;
}
return false;
}

    public static void main(String[]args)
    {
     String[]arr={"DANDO","NNINJ","AXGJC","INJAA","CODDI"};
     int n=arr.length;
     int m=arr[0].length();
     char[][]board=new char[n][m];

     int i=0;
     while(i<n)
     {
        int j=0;
        while(j<m)
        {
            board[i][j]=arr[i].charAt(j);
            j++;
        }
        i++;
     }
   boolean ans= helper(board);
   System.out.println(ans);
    }
}
