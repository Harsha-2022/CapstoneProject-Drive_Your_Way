package com.driveyway.dao;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import com.driveyway.entity.Product;


@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    // all cars


    Page<Product> findAllByOrderByNameAsc(Pageable pageable);

    Page<Product> findAllByOrderByDateCreatedDesc(Pageable pageable);

   // by model

    Page<Product> findByCar(@RequestParam("car") int car, Pageable pageable);

    Page<Product> findByCarOrderByNameAsc(@RequestParam("car") int car, Pageable pageable);

    Page<Product> findByCarOrderByDateCreatedDesc(@RequestParam("car") int car, Pageable pageable);

   // for searching

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

    Page<Product> findByNameContainingOrderByNameAsc(@RequestParam("name") String name, Pageable pageable);

    Page<Product> findByNameContainingOrderByDateCreatedDesc(@RequestParam("name") String name, Pageable pageable);



}