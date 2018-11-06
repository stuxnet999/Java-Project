import java.util.*;
import java.io.*;

public class RemarksManip{
  ArrayList<Remarks> remarksList;
  Remarks rem;
  StudentDetails studDet;

  RemarksManip(String roll){
    rem=new Remarks();
    studDet=new StudentDetails(roll);
  }

  public boolean getRemarks(){
    if(Functions.check("Remarks/"+studDet.getRollno())){
      remarksList=Remarks.get(studDet.getRollno());
      return true;
    }
    else{
      remarksList=new ArrayList<Remarks>();
      return false;
    }
  }

  public int search(Remarks rm){
    getRemarks();
    for(Remarks obj:remarksList){
      if(obj.equals(rm))
        return remarksList.indexOf(obj);
    }
    return -1;
  }
}
