import java.util.*;
import java.io.*;

public class Remarks extends Remarksfh implements Serializable{
  private String faculty;
  private ArrayList<StringBuilder> remarks;

  Remarks(){
    remarks=new ArrayList<StringBuilder>();
  }

  public void setFaculty(){
    Scanner s=new Scanner(System.in);
    this.faculty=s.nextLine();
  }

  public void setRemarks(){
    Scanner s=new Scanner(System.in);
    remarks.add(new StringBuilder(s.nextLine()));
  }

  public void removeRemark(int idx){
    remarks.remove(idx);
  }

  public String getFaculty(){
    return faculty;
  }

  public ArrayList<StringBuilder> getRemarks(){
    return remarks;
  }

  public int getNoOfRemarks(){
    return remarks.size();
  }

  public void setDetails(){
    System.out.print("Enter Faculty name: ");
    setFaculty();
    System.out.print("Enter Remark : ");
    setRemarks();
  }

  public boolean equals(Remarks obj){
    return this.faculty.equals(obj.faculty);
  }

  public void print(){
    String tmp="";
    for(int i=0;i<100;i++){
      tmp=tmp+'-';
    }
    System.out.println(tmp);
    System.out.println("Name: "+faculty);
    System.out.println(String.format("%-10s   %-10s","Remark no.","Remark"));
    System.out.println("----------   ----------");
    for(StringBuilder obj:remarks){
      System.out.print(String.format("%-10d",remarks.indexOf(obj)+1));
      System.out.println("   "+obj);
    }
    System.out.println(tmp);
  }




}
