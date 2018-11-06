public class DeleteAchievements extends AchievementsManip{
  DeleteAchievements(String roll){
    super(roll);
  }

  public void delete(){
    if(!getAchievements()){
      System.out.println(Functions.currentStudent.getName()+" has no Achievements !");
      return;
    }
    for(Achievements obj:achieveList){
      obj.print(achieveList.indexOf(obj));
    }
    System.out.print("Enter Sl. No. to delete: ");
    int idx=Functions.getint();
    try{
      achieveList.remove(idx-1);
    }
    catch(Exception e){
      System.out.println("Invalid Index !");
    }
    Achievements.put(achieveList,studDet.getRollno());
  }
}
