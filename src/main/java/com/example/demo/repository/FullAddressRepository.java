package com.example.demo.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.FullAddress;

public interface FullAddressRepository extends JpaRepository<FullAddress, UUID>{

}
