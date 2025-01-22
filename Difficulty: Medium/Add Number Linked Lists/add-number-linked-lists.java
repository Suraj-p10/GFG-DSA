//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/


class Solution{

    //Function to add two numbers represented by linked list.

    

    private static boolean carry=false;

    static Node addTwoLists(Node head1, Node head2){

        // code here

        if(head1==null&&head2==null)//base case

        return null;

        

        head1=removeZeroes(head1);

        head2=removeZeroes(head2);

        

        int l1,l2,diff;

        l1=calcLength(head1);//calculate their lengths

        l2=calcLength(head2);

        diff=Math.abs(l1-l2);//difference in their lengths

        

        Node smallNode=null, bigNode=null;

        

        

        //we will have to add zeroes to make length same.

        smallNode= (l1>l2)?head2:head1;

        bigNode= (l1>l2)?head1:head2;

        smallNode = addZeroes(smallNode,diff+1);//adding zeroes in the front

        bigNode=addZeroes(bigNode, 1) ;// adding zero in case carry is generated

        

        

        carry=false;

        

        addll(bigNode, smallNode);

        

        return removeZeroes(bigNode);

        

        // return head of sum list

    }

    

    private static int calcLength(Node head)

    {

        int c=0;

        while(head!=null)

        {

            c++;

            head=head.next;

        }

        return c;

    }

    

    private static Node addZeroes(Node node,int diff){

        if(node==null)

        return null;

        

        Node zeroNode= new Node(0);

        Node temp=zeroNode;

        while(--diff!=0)

        {

            temp.next=new Node(0);

            temp=temp.next;

        }

        temp.next=node;//linking the small number node

        return zeroNode;

    }

    

    private static Node removeZeroes(Node node)

    {

        while(node!=null&&node.data==0)

        {

            node=node.next;

        }

        if(node==null)

        return new Node(0);

        else

        return node;

    }

    

    private static void addll(Node l1, Node l2)

    {

        if(l1==null&&l2==null)//base case

        return;

        

        addll(l1.next, l2.next);

        int d1=l1.data, d2=l2.data;

        

        if(carry) //maximum carry generated can be 1

        {

            d1++;

            carry = false;

        }

        

        int sum=d1+d2;

        if(sum>9)

        {

            carry=true;

            sum-=10;

        }

        l1.data=sum;

    }

    

}



//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends