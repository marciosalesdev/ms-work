package com.devmarcio.mswork.repository;

import com.devmarcio.mswork.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long> {

}
