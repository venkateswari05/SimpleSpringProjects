package com.student.student.Service;

import com.student.student.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService
{

    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student s)
    {
        students.add(s);

    }

    public Student getStudentById(long id)
    {
        for(Student s : students)
        {
            if(s.getId() == id)
            {
                return s;
            }
        }
        return new Student();
    }

    public Student updateStudent(long id, Student st)
    {

        boolean flag=false;
        Student std = null;
        for(Student s : students)
        {
            if(s.getId() == id)
            {
                flag = true;
                std = s;
            }
        }
        if(flag)
        {
            students.remove(std);
        }
        students.add(st);
        return st;
    }

    public Student deleteStudentById(long id)
    {
        boolean flag = false;
        Student std = null;
        for(Student s : students)
        {
            if(s.getId() == id)
            {
                flag = true;
                std = s;
            }
        }
        if(flag)
        {
            students.remove(std);
            return std;
        }
        return new Student();
    }

    public ArrayList<Student> getAllStudents()
    {
        return students;
    }
}
