package LLINCollections;

import java.util.LinkedList;

public class LLINCOLLLETIONS {


    public static void main(String[] args) {
        
        LinkedList<Integer>LL=new LinkedList<>();
        // System.out.println(LL.size());
        LL.add(1);
        LL.add(2);
        LL.addFirst(5);
        LL.addLast(6);
        LL.set(3,7);
        int i=0;
        while(i<LL.size())
        {
            System.out.println(LL.get(i));
            i++;
        }
    }
}
