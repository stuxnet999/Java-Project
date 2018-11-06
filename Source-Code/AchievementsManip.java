import java.util.*;
import java.io.*;

public class AchievementsManip{

  StudentDetails studDet;
  Achievements achieve;
  ArrayList<Achievements> achieveList;

  AchievementsManip(String roll){
    studDet=new StudentDetails(roll);
    achieve=new Achievements();
  }

  public boolean getAchievements(){
    if(Functions.check("Achievements/"+studDet.getRollno())){
      achieveList=Achievements.get(studDet.getRollno());
      return true;
    }
    else{
      achieveList=new ArrayList<Achievements>();
      return false;
    }
  }

}
