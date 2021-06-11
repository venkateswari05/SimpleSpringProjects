package com.Hall.Hall.Service;

import com.Hall.Hall.Model.Hall;
import com.Hall.Hall.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HallService
{

    @Autowired
    HallRepository hallRepository;
    ArrayList<Hall> hall = new ArrayList<Hall>();

    public void addHall(Hall h)
    {
        hallRepository.save(h);
    }

    public void addAllHalls(List<Hall> h)
    {
        for(Hall hal : h)
        {
            hallRepository.save(hal);
        }
    }

    public Optional<Hall> getById(int id)
    {
       return  hallRepository.findById(id);
    }

    public Iterable<Hall> getAll()
    {
        return hallRepository.findAll();
    }

    public Hall update(int id, Hall h)
    {
       return hallRepository.save(h);
    }

    public void deleteById(int id)
    {
         hallRepository.deleteById(id);
    }

}
