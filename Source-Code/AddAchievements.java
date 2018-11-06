public class AddAchievements extends AchievementsManip{
  AddAchievements(String roll){
    super(roll);
  }

  public void Add(){
    if(!achieve.setDetails())
        return;
    getAchievements();
    achieveList.add(achieve);
    Achievements.put(achieveList,studDet.getRollno());
  }
}
