package com.student.student.Controller;

import com.student.student.Model.Student;
import com.student.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController
{
    @Autowired
    StudentService studentService;

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public ArrayList<Student> getStudents()
    {
        return studentService.getAllStudents();
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Student s)
    {
        studentService.addStudent(s);
    }
    @RequestMapping(value="/get/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable long id)
    {
       return  studentService.getStudentById(id);
    }

    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public Student update(@PathVariable long id, @RequestBody Student s)
    {
        return studentService.updateStudent(id, s);
    }

    @RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
    public Student delete(@PathVariable long id)
    {
        return studentService.deleteStudentById(id);
    }
}
