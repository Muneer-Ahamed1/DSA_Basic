package opps;
import java.util.*;
/*
TWO INTERFACE:
Comparable
method:compareTo
Comparator
method:compare
 */
class Student implements Comparable<Student> {
    int value;
    Student(int value){
        this.value=value;
    }
    @Override
    public int compareTo(Student o) {
        if(this.value>o.value) {
            return -1;
        }
        else if(this.value<o.value) {
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Student{" +
                "value=" + value +
                '}';
    }
    public static void main(String arg[]) {
        Student st1=new Student(6);
        Student st2=new Student(9);
        Student st3=new Student(4);
        ArrayList<Student> pq=new ArrayList<>();
        pq.add(st1);
        pq.add(st2);
        pq.add(st3);
        System.out.print(pq);
    }
}
