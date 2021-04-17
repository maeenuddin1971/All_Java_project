package geekforgeeks_linked;
public class Geekforgeeks_linked {
    man head;
    static class man
            {
               int data;
               man next;
               man(int t)
               {
                   data=t;
                   next=null;
               }
            }
    public static void main(String[] args) {
        Geekforgeeks_linked ty=new Geekforgeeks_linked();
        ty.push(89);
        ty.push(65);
        ty.push(890);
       
        ty.print();
        System.out.println("after all deletion");
         ty.delete(890);
          ty.print();
    }
    void push(int data)
    {
        man g=new man(data);
        g.next=head;
        head=g;
    }
    void delete(int we)
    {
        man er=head,prev=null;
        if (er != null &&er.data ==we)
        {
            head = er.next; // Changed head
            return;
        }
        while(er!=null&&er.data==we)
        {
            if(er.data==we)
                break;
            prev=er;
            er=er.next;
        }
        if ( er== null) return;
        prev.next=er.next;
    }
    void print()
    {
        man rt=head;
        while(rt!=null)
        {
            System.out.println(rt.data);
            rt=rt.next;
        }
        
    }
    
}
