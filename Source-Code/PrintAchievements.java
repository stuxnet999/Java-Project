public class PrintAchievements extends AchievementsManip{
  PrintAchievements(String roll){
    super(roll);
  }

  public void printAll(){
    if(!getAchievements()){
      System.out.println("No Entries for "+Functions.currentStudent.getName());
      return;
    }
    for(Achievements obj:achieveList){
      obj.print(achieveList.indexOf(obj));
    }
    System.out.println();
  }
}
