package com.Branch.Branch.Service;

import com.Branch.Branch.Repository.BranchRepository;
import com.Branch.Branch.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BranchService
{
    @Autowired
    BranchRepository branchRepository;


    public void addBranch(Branch b)
    {
            branchRepository.save(b);
    }

    public Optional<Branch> getBranch(long id)
    {
        return branchRepository.findById(id);
    }

    public Branch updateBranch(long id, Branch b)
    {
        return branchRepository.save(b);
    }

    public void deleteBranch(long id)
    {
       branchRepository.deleteById(id);
    }

    public Iterable<Branch> getAllBranches()
    {

        return branchRepository.findAll();
    }

    public void addBranches(List<Branch> b)
    {
        for(Branch br : b)
        {
            branchRepository.save(br);
        }
    }
}
