package com.Subject.Controller;

import com.Subject.Model.Subject;
import com.Subject.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController
{
    @Autowired
    SubjectService subjectService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void add(@RequestBody Subject h)
    {
        subjectService.add(h);
    }

    @RequestMapping(value="/addall", method = RequestMethod.POST)
    public void addAll(@RequestBody List<Subject> b)
    {

        subjectService.addBranches(b);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<Subject> get(@PathVariable int id)
    {

        return subjectService.getBranch(id);
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public Subject update(@PathVariable int id, @RequestBody Subject b)
    {

        return subjectService.updateBranch(id,b);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id)
    {
        subjectService.deleteBranch(id);
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public Iterable<Subject> getAll()
    {
        return subjectService.getAllBranches();
    }

}
