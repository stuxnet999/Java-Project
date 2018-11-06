public class PrintStudents extends StudentManip{
  PrintStudents(){
    super();
  }

  public void printAll(){
    if(!getStudents()){
      System.out.println("No Students to show !!!");
      System.out.println();
      return;
    }
    for(StudentDetails obj:studentList){
      obj.print();
    }
  }
}
