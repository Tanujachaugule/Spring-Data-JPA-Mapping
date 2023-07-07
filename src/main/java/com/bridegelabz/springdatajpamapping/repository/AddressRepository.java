package com.bridegelabz.springdatajpamapping.repository;

import com.bridegelabz.springdatajpamapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
