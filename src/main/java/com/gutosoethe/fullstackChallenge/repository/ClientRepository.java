package com.gutosoethe.fullstackChallenge.repository;

import com.gutosoethe.fullstackChallenge.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
