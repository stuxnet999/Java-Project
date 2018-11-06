public class DisplayStudentMenu{
  StudentDetails studDet;

  DisplayStudentMenu(String roll){
    studDet=new StudentDetails(roll);
  }

  public int menu(){
    int opt=0;
    System.out.println("1. Course Data");
    System.out.println("2. Remarks");
    System.out.println("3. Achievements");
    System.out.println("4. Logout");
    System.out.print(">> ");
    opt=Functions.getint();
    System.out.println();
    Functions.clrscr();
    Functions.getStudent();
    return opt;
  }

  public void run(){
    while(true){
      int opt=menu();
      switch(opt){
        case 1: DisplayCourses dc = new DisplayCourses(studDet.getRollno());
                dc.run();
                break;
        case 2: DisplayRemarks dr = new DisplayRemarks(studDet.getRollno());
                dr.run();
                break;
        case 3: DisplayAchievements da = new DisplayAchievements(studDet.getRollno());
                da.run();
                break;
        case 4: Functions.currentStudent=null;
                Functions.clrscr();
                return;
        default: System.out.println("Invalid Option !");

      }
    }
  }

}
