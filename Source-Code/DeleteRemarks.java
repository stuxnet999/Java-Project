public class DeleteRemarks extends RemarksManip{
  Remarks toDel;

  DeleteRemarks(String roll){
    super(roll);
  }

  public void delete(){
    System.out.print("Enter Facluty Name: ");
    rem.setFaculty();
    int idx=search(rem);
    if(idx!=-1){
      toDel=remarksList.get(idx);
      int len=toDel.getNoOfRemarks();
      if(len>1)
        delMulti();
      else
        remarksList.remove(idx);
    }
    else{
      System.out.println("No Remarks Left by "+rem.getFaculty());
      return;
    }
    Remarks.put(remarksList,studDet.getRollno());
  }

  public void delMulti(){
    toDel.print();
    System.out.println("Enter index of remark to remove: ");
    int idx=Functions.getint()-1;
    toDel.removeRemark(idx);
  }
}
