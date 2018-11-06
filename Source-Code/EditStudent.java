import java.util.*;

public class EditStudent extends CourseManip{

  EditStudent(String roll){
    studDet=new StudentDetails(roll);
    getCourses();
  }

  public int search(StudentCourse toSearch){
    for(StudentCourse obj:studCourseList){
      if(toSearch.equals(obj)==true){
        return studCourseList.indexOf(obj);
      }
    }
    return -1;
  }

  public void delete(){
    StudentCourse toDel=new StudentCourse();
    toDel.setCourseCode();
    int idx=search(toDel);
    if(idx!=-1){
      studCourseList.remove(idx);
      StudentCourse.put(studCourseList,studDet.getRollno());
    }
    else{
      System.out.println("No such entry !!");
    }
  }

  public void edit(){
    StudentCourse toEdit=new StudentCourse();
    toEdit.setCourseCode();
    int idx=search(toEdit);
    if(idx!=-1){
      editData(idx);
    }
    else{
      System.out.println("No such entry !!");
    }
  }

  public void editData(int idx){
    System.out.println("Enter new details. Press enter to keep old values :");
    StudentCourse toEdit=studCourseList.get(idx);
    studCourseList.remove(idx);
    toEdit.changeable();
    studCourseList.add(idx,toEdit);
    StudentCourse.put(studCourseList,studDet.getRollno());
  }



}
