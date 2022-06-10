package com.ksl.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksl.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
