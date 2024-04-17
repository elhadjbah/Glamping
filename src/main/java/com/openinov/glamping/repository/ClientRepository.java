package com.openinov.glamping.repository;

import com.openinov.glamping.entity.Clients;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Clients, Long> {


    public List<Clients> findByOrderByIdDesc();

    public List<Clients> findAll();

}
