package com.Hall.Hall.Controller;

import com.Hall.Hall.Model.Hall;
import com.Hall.Hall.Service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HallController
{

    @Autowired
    HallService hallservice;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void add(@RequestBody Hall h)
    {
        hallservice.addHall(h);
    }

    @RequestMapping(value="/addall", method = RequestMethod.POST)
    public void addAll(@RequestBody List<Hall> h)
    {
        hallservice.addAllHalls(h);
    }

    @RequestMapping(value="/get/{id}",method = RequestMethod.GET)
    public Optional<Hall> get(@PathVariable int id)
    {
        return hallservice.getById(id);
    }

    @RequestMapping(value="/getall", method = RequestMethod.GET)
    public Iterable<Hall> GetAll()
    {
       return hallservice.getAll();
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public Hall Update(@PathVariable int id, @RequestBody Hall h)
    {
        return hallservice.update(id,h);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void Delete(@PathVariable int id)
    {
         hallservice.deleteById(id);
    }
}
