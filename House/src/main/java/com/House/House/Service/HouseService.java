package com.House.House.Service;

import com.House.House.Model.House;
import com.House.House.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService
{
    @Autowired
    HouseRepository houseRepository;

    public void add(House h)
    {
         houseRepository.save(h);
    }

    public void addBranches(List<House> b)
    {
        for(House h : b )
        {
            houseRepository.save(h);
        }
    }

    public Optional<House> getBranch(int id)
    {
       return houseRepository.findById(id);
    }

    public House updateBranch(int id, House b)
    {
        return houseRepository.save(b);
    }

    public void deleteBranch(int id)
    {
        houseRepository.deleteById(id);
    }

    public Iterable<House> getAllBranches()
    {
        return houseRepository.findAll();
    }
}
