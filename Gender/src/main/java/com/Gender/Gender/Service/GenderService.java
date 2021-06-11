package com.Gender.Gender.Service;

import com.Gender.Gender.Model.Gender;
import com.Gender.Gender.Repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService
{
    @Autowired
    GenderRepository genderRepository;


    public void add(Gender g)
    {
        genderRepository.save(g);
    }

    public void addAll(List<Gender> g)
    {
        for(Gender gen : g)
        {
            genderRepository.save(gen);
        }

    }

    public Optional<Gender> getBranch(int id)
    {
       return  genderRepository.findById(id);
    }

    public Gender updateBranch(int id, Gender g)
    {
       return  genderRepository.save(g);
    }

    public void deleteBranch(int id)
    {
        genderRepository.deleteById(id);
    }

    public Iterable<Gender> getAllBranches()
    {
        return genderRepository.findAll();
    }
}
