import java.util.*;

public class tester{
  public static void main(String arg[]){
    /*StudentDetails obj=new StudentDetails();
    obj.setDetails();
    ArrayList<StudentDetails> al=new ArrayList<StudentDetails>();
    al.add(obj);
    StudentDetails.put(al);
    Scanner s=new Scanner(System.in);
    StudentDetails sd=new StudentDetails();
    sd.setRollno();
    sd.map();
    Functions.currentStudent=sd;
    Functions.clrscr();
    DisplayCourses dc = new DisplayCourses(sd.getRollno());
    dc.run();
    */
    DisplayStudents ds = new DisplayStudents();
    ds.run();
  }
}
