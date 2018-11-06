public class AddRemarks extends RemarksManip{
  AddRemarks(String roll){
    super(roll);
  }

  public void Add(){
    System.out.print("Enter Faculty Name: ");
    rem.setFaculty();
    int idx=search(rem);
    if(idx==-1){
      AddNew();
    }
    else{
      AddExisting(idx);
    }
    Remarks.put(remarksList,studDet.getRollno());
  }

  public void AddNew(){
    System.out.print("Enter Remarks: ");
    rem.setRemarks();
    remarksList.add(rem);
  }

  public void AddExisting(int idx){
    System.out.print("Enter Remarks: ");
    Remarks toAdd=remarksList.get(idx);
    toAdd.setRemarks();
    remarksList.remove(idx);
    remarksList.add(idx,toAdd);
  }
}
