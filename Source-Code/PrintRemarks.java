public class PrintRemarks extends RemarksManip{
  PrintRemarks(String roll){
    super(roll);
  }

  public void printAll(){
    if(!getRemarks()){
      System.out.println("No Remarks for "+Functions.currentStudent.getName());
      System.out.println();
    }
    else{
      if(remarksList.size()==0){
        System.out.println("No Remarks for "+Functions.currentStudent.getName());
        System.out.println();
      }
      for(Remarks obj:remarksList){
        obj.print();
      }
    }
  }
}
