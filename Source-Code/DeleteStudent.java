public class DeleteStudent extends StudentManip{

  DeleteStudent(){
    super();
  }

  public void delete(){
    //System.out.print("Enter Rollno of Student to delete: ");
    studDet.setRollno();
    int idx=search(studDet);
    if(idx!=-1){
      studentList.remove(idx);
      StudentDetails.put(studentList);
    }
    else{
      System.out.println("No such entry !!");
    }
  }

}
