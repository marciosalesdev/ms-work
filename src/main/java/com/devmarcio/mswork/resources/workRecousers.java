package com.devmarcio.mswork.resources;

import com.devmarcio.mswork.entities.Worker;
import com.devmarcio.mswork.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class workRecousers {


    @Autowired
    private  WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();
        return    ResponseEntity.ok(list);
    }
    @GetMapping ("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker obj = repository.findById(id).get();
        return    ResponseEntity.ok(obj);
    }

}
