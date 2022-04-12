import java.util.*;
class teacher{
    int tid,tage;
    String tname;
    Scanner S=new Scanner(System.in);
    void teacherinfo(){
        System.out.println("Enter the Details of Teacher :\nID : ");
        tid=S.nextInt();
        System.out.println("Name : ");
        tname=S.next();
        System.out.println("Age : ");
        tage=S.nextInt();
    }
    void showinfo(){
        System.out.println("Teacher's Details,\n ID : "+tid+"\n Name : "+tname+"\n Age : "+tage);
    }
}
class student extends teacher{
    int sid,sage;
    String sname,scourse;
    Scanner S=new Scanner(System.in);
    void studinfo(){
        System.out.println("Enter the Details Student :\nID : ");
        sid=S.nextInt();
        System.out.println("Name : ");
        sname=S.next();
        System.out.println("Age : ");
        sage=S.nextInt();
        System.out.println("Course : ");
        scourse=S.next();
    }
    void showinfo1(){
        System.out.println("Student's Details,\n ID : "+sid+"\n Name : "+sname+"\n Age : "+sage+"\nCourse : "+scourse);
    }
}
public class Q2 {
    public static void main(String[] args) {
        student s1=new student();
        s1.studinfo();
        s1.teacherinfo();
        s1.showinfo();
        s1.showinfo1();
    }
}
