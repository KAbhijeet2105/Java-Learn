package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static boolean insertStudentToDB(Student st)
    {
        //database insert code

            boolean flag = false;

        try {
            Connection con = ConnProvider.createConn();

            String qry = "insert into students(sname,sphone,scity) values(?,?,?);";

            //using prepared statement for dynamic queries

            PreparedStatement pstmt = con.prepareStatement(qry);

            //set the value of parameter

            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2,st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            //execute query

            pstmt.executeUpdate();
            flag = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        return  flag;
    }

    public static boolean deleteStudent(int userId) {

        boolean flag = false;

        try {
            Connection con = ConnProvider.createConn();

            String qry = "delete from students where sid = ?;";

            //using prepared statement for dynamic queries

            PreparedStatement pstmt = con.prepareStatement(qry);

            //set the value of parameter

            pstmt.setInt(1,userId);


            //execute query

            pstmt.executeUpdate();
            flag = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        return  flag;
    }

    public static void showAllStudent() {
        boolean flag = false;

        try {
            Connection con = ConnProvider.createConn();

            String qry = "select * from students;";

            //using  statement for static queries

           Statement stmt = con.createStatement();

            //execute query
            ResultSet set =  stmt.executeQuery(qry);

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Phone : " + phone);
                System.out.println("City : " + city);

                System.out.println("------------------------------------------------------------------------------");

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
