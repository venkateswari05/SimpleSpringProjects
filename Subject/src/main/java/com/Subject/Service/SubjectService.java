package com.Subject.Service;

import com.Subject.Model.Subject;
import com.Subject.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService
{

    @Autowired
    SubjectRepository subjectRepository;

    public void add(Subject h)
    {
        subjectRepository.save(h);
    }

    public void addBranches(List<Subject> b)
    {
            subjectRepository.saveAll(b);
    }

    public Optional<Subject> getBranch(int id)
    {
       return subjectRepository.findById(id);
    }

    public Subject updateBranch(int id, Subject b)
    {
        return subjectRepository.save(b);
    }

    public void deleteBranch(int id)
    {
         subjectRepository.deleteById(id);
    }

    public Iterable<Subject> getAllBranches()
    {
        return subjectRepository.findAll();
    }
}
