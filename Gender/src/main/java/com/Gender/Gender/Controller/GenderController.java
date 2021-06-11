package com.Gender.Gender.Controller;

import com.Gender.Gender.Model.Gender;
import com.Gender.Gender.Service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GenderController
{
    @Autowired
    GenderService genderService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void add(@RequestBody Gender g)
    {
        genderService.add(g);
    }

    @RequestMapping(value="/addall", method = RequestMethod.POST)
    public void addAll(@RequestBody List<Gender> g)
    {
        genderService.addAll(g);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<Gender> get(@PathVariable int id)
    {

        return genderService.getBranch(id);
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public Gender update(@PathVariable int id, @RequestBody Gender g)
    {

        return genderService.updateBranch(id,g);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id)
    {
        genderService.deleteBranch(id);
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public Iterable<Gender> getAll()
    {
        return genderService.getAllBranches();
    }
}
