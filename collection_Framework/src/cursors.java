import java.util.*;

public  class cursors{
    public static void main(String arg[]) {
        Vector<Integer> lst= new Vector<>();
        Vector<Integer> lst1=new Vector<>();
        for(int i=5;i<8;i++) {
            lst1.add(i);
        }

        lst.add(2);
        lst.add(1);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        System.out.println(Collections.reverseOrder());

        Enumeration e= lst.elements();//only legacy classes
        while(e.hasMoreElements()) {
            System.out.println((e));
            e.nextElement();
        }
        Set<Integer> st=new TreeSet<>(Comparator.reverseOrder());
        st.addAll(lst);
        Iterator it=st.iterator();//all collection
        while(it.hasNext()) {
            int i=(int) it.next();
            System.out.println(i);
            if ((int) i == 2) {

                it.remove();//removing;

            }

        }
        ListIterator flt= lst.listIterator(2);

     //forward...
     while(flt.hasNext()) {

         System.out.println(flt.next()+" "+flt.nextIndex());
         //System.out.println(lt.next()+" "+lt.nextIndex());
     }
     ListIterator blt=lst.listIterator(4);
     while(blt.hasPrevious()) {
         System.out.println(blt.previous()+" "+blt.previousIndex());
     }






    }
}