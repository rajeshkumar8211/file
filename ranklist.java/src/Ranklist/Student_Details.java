package Ranklist;

import java.sql.*;
import java.util.*;

public class Student_Details {
    public static void main(String[] args) throws Exception{
        mark_allocation ma =new mark_allocation();
        Scanner sc =new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/ranklist";
        String username="root";
        String password="svmr";

        Connection con = DriverManager.getConnection(url,username,password);

        int ch;
        boolean loop=true;
        while (loop){
            System.out.println("1.Enroll Student Details \n2.Search Student Details \n3.Show Full Student Details\n4.Exit");
            ch= sc.nextInt();
            switch (ch){
                case 1:{
                    String sql = "insert into student_details values(?,?,?,?)";
                    PreparedStatement ps =con.prepareStatement(sql);
                    String name;
                    int register_no,i;
                    int[] marks=new int[5];
                    int total=0,grade;
                    System.out.println("Enter a Student name:");
                    name =sc.next();
                    System.out.println("Enter a Student register no:");
                    register_no=sc.nextInt();
                    System.out.println("Enter a Student 5 Subjects mark");
                    for (i=0;i<5;i++){
                        marks[i]= sc.nextInt();
                    }
                    for (i=0;i<5;i++){
                        total+=marks[i];
                    }
                    System.out.println("Your Total is:"+total);
                    student st= new student(name,register_no,total);
                    grade=ma.rank_allocate(st);
                    ps.setString(1,name);
                    ps.setInt(2,register_no);
                    ps.setDouble(3,total);
                    ps.setInt(4,grade);
                    ps.executeUpdate();

                }
                break;
                case 2:{
                    String sd="";
                    int d=-1;
                    int choice;
                    System.out.println(" Which detail you know for the student \n 1.Name \n 2.Register_No or Total_mark or rank ");
                    choice= sc.nextInt();
                    switch (choice) {
                        case 1: {
                            String sql = "select * from student_details where name =?";
                            PreparedStatement ps =con.prepareStatement(sql);
                            System.out.println("Please Enter a Student Name:");
                            sd = sc.next();
                            ps.setString(1,sd);
                            ResultSet rs =ps.executeQuery();
                            while (rs.next()){
                                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getDouble(3)+" "+rs.getInt(4)+" ");
                            }
                            break;
                        }
                        case 2: {
                            String sql = "select * from student_details where register_no =? or total =? or std_rank =?";
                            PreparedStatement ps =con.prepareStatement(sql);
                            System.out.println("Please Enter a Student Register_no or Total_marks or Rank:");
                            d = sc.nextInt();
                            ps.setInt(1,d);
                            ps.setDouble(2,d);
                            ps.setInt(3,d);
                            ResultSet rs =ps.executeQuery();
                            while (rs.next()){
                                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getDouble(3)+" "+rs.getInt(4)+" ");
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid Choice");
                            return;
                    }
                    ma.student_list(sd,d);
                }
                break;
                case 3:{
                    String sql = "select * from student_details ";
                    PreparedStatement ps =con.prepareStatement(sql);
                    ResultSet rs =ps.executeQuery();
                    while (rs.next()){
                        System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getDouble(3)+" "+rs.getInt(4)+" ");
                    }
                    ma.full_student();
                    break;
                }
                case 4:
                    loop=false;
                    System.out.println("Thank You");
            }
        }
        con.close();
    }
}
