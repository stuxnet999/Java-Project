import java.util.*;
import java.io.*;

public class StudentManip{
  ArrayList<StudentDetails> studentList;
  StudentDetails studDet;

  StudentManip(String rollno){
    studDet=new StudentDetails(rollno);
  }

  StudentManip(){
    studDet=new StudentDetails();
  }

  public boolean check(String file){
    String filename="../files/"+file;
    File f = new File(filename);
    if(f.exists()){
      return true;
    }
    return false;
  }

  public boolean getStudents(){
    if(check("Students")){
      studentList=StudentDetails.get();
      return true;
    }
    else{
      studentList=new ArrayList<StudentDetails>();
      return false;
    }
  }

  public int search(StudentDetails sd){
    getStudents();
    for(StudentDetails obj:studentList){
      if(obj.equals(sd))
        return studentList.indexOf(obj);
    }
    return -1;
  }

}
