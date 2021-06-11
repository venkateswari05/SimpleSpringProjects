package com.House.House.Controller;

import com.House.House.Model.House;
import com.House.House.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HouseController
{
    @Autowired
    HouseService houseService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void add(@RequestBody House h)
    {
            houseService.add(h);
    }

    @RequestMapping(value="/addall", method = RequestMethod.POST)
    public void addAll(@RequestBody List<House> b)
    {

        houseService.addBranches(b);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<House> get(@PathVariable int id)
    {

        return houseService.getBranch(id);
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public House update(@PathVariable int id, @RequestBody House b)
    {

        return houseService.updateBranch(id,b);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id)
    {
        houseService.deleteBranch(id);
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public Iterable<House> getAll()
    {
        return houseService.getAllBranches();
    }
}
