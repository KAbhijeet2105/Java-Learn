import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Start {

    public static void main(String[] args)throws Exception {

        System.out.println("Student management app");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {

            System.out.println(" Select operation : ");
            System.out.println(" 1.Add Student ");
            System.out.println(" 2.Delete Student ");
            System.out.println(" 3.Display Student ");
            System.out.println(" 4.EXIT ");

            int c = Integer.parseInt(br.readLine());

            switch (c)
            {

                case 1 :
                    //add student
                    System.out.println("Enter student name: ");
                    String name = br.readLine();
                    System.out.println("Enter student phone number: ");
                    String phone = br.readLine();
                    System.out.println("Enter student city: ");
                    String city = br.readLine();

                    //create student object
                    Student st = new Student(name,phone,city);

                    boolean ans = StudentDao.insertStudentToDB(st);

                    if(ans)
                    {
                        System.out.println("Student is added successfully !!");
                    }
                    else
                    {
                        System.out.println("Something went wrong! try again!!");
                    }

                            break;

                case 2 :
                    //delete student
                    System.out.println("Enter student id to delete");
                    int userId = Integer.parseInt(br.readLine());
                    ans = StudentDao.deleteStudent(userId);

                    if(ans)
                    {
                        System.out.println("Student is deleted successfully !!");
                    }
                    else
                    {
                        System.out.println("Something went wrong! unable to delete!!");
                    }

                            break;

                case 3 :
                        //show student
                        StudentDao.showAllStudent();
                            break;

                case 4 :
                            System.out.println("Thank you! exiting from app....");
                            System.exit(0);
                default:
                    System.out.println("wrong choice! please choose valid operation!");

            }

        }



    }

}
/*
*
*
*
*
* */