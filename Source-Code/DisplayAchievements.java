public class DisplayAchievements extends AchievementsManip{
  DisplayAchievements(String roll){
    super(roll);
  }

  public int menu(){
    int opt=0;
    System.out.println();
    System.out.println("1. View All Achievements");
    System.out.println("2. Add an Achievement");
    System.out.println("3. Remove an Achievement");
    System.out.println("4. Back");
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
        case 1: PrintAchievements obj=new PrintAchievements(studDet.getRollno());
                obj.printAll();
                break;
        case 2: AddAchievements obj1=new AddAchievements(studDet.getRollno());
                obj1.Add();
                break;
        case 3: DeleteAchievements obj2=new DeleteAchievements(studDet.getRollno());
                obj2.delete();
                break;
        case 4: return;
        default: System.out.println("Invalid option !");
      }
    }
  }
}
