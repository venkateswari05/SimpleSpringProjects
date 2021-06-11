package com.Branch.Branch.Controller;

import com.Branch.Branch.Service.BranchService;
import com.Branch.Branch.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BranchController
{
    @Autowired
    BranchService branchService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void add(@RequestBody Branch b)
    {

        branchService.addBranch(b);
    }

    @RequestMapping(value="/addall", method = RequestMethod.POST)
    public void addAll(@RequestBody List<Branch> b)
    {

        branchService.addBranches(b);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<Branch> get(@PathVariable long id)
    {

        return branchService.getBranch(id);
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public Branch update(@PathVariable long id, @RequestBody Branch b)
    {

        return branchService.updateBranch(id,b);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        branchService.deleteBranch(id);
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public Iterable<Branch> getAll()
    {
        return branchService.getAllBranches();
    }
}
