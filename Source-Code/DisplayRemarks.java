public class DisplayRemarks extends RemarksManip{

  DisplayRemarks(String roll){
    super(roll);
  }

  public int menu(){
    int opt=0;
    System.out.println("1. View Remarks");
    System.out.println("2. Add Remarks");
    System.out.println("3. Delete Remarks");
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
        case 1: PrintRemarks obj=new PrintRemarks(studDet.getRollno());
                obj.printAll();
                break;
        case 2: AddRemarks obj1=new AddRemarks(studDet.getRollno());
                obj1.Add();
                break;
        case 3: DeleteRemarks obj2=new DeleteRemarks(studDet.getRollno());
                obj2.delete();
                break;
        case 4: return;
      }
    }
  }


}
