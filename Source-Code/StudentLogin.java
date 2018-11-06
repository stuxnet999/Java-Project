public class StudentLogin extends StudentManip{
  StudentLogin(){
    super();
  }

  public void login(){
    studDet.setRollno();
    if(!studDet.map()){
      System.out.println(" [*] ERROR ! No Such Student !!");
      return;
    }
    Functions.currentStudent=studDet;
    Functions.clrscr();
    Functions.getStudent();
    DisplayCourses dc = new DisplayCourses(studDet.getRollno());
    dc.run();
  }
}
