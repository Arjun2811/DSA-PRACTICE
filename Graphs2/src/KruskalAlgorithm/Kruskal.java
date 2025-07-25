package KruskalAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Kruskal {


public static void print(Edges[] output)
{
    int i=0;
    while(i<output.length)
    {
        if(output[i].source<output[i].destination)
        {
        System.out.println(output[i].source+"  "+output[i].destination+" "+output[i].weight);
        
    }
    else{
        System.out.println(output[i].destination+"  "+output[i].source+" "+output[i].weight);

    }
    i++;
}
}


public static int findparent(int source,int parent[])
{
if(parent[source]==source)
{
return source;
}

    int parentvalue=findparent(parent[source], parent);
    return parentvalue;
}




public static Edges[] kruskal(Edges input[],int v,int e)
{

Edges output[]=new Edges[v-1];

int parent[]=new int[v];
int f=0;
while(f<v)
{
    parent[f]=f;
    f++;
}

int g=0;
int count=0;
int i=0;
while(count<v-1)
{

int parent1=findparent(input[i].source,parent);
int parent2=findparent(input[i].destination,parent);

if(parent1!=parent2)
{
    output[g]=input[i];
parent[parent1]=parent2;

    g++;
    count++;
}
i++;
  
}
return output;





}



public static void takeinput()
{Scanner s = new Scanner(System.in);
    int v=s.nextInt();
    int e =s.nextInt();
    Edges input[]=new Edges[e];
    int i=0;
    while(i<e)
    {
        input[i]=new Edges();
        input[i].source=s.nextInt();
        input[i].destination=s.nextInt();
        input[i].weight=s.nextInt();
        i++;
    }
    Arrays.sort(input);
    Edges[]output=kruskal(input,v,e);

    print(output);

}




    public static void main(String[]args)
    {
        takeinput();
        
    }
}
