package com.microservices.vehicule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRespository extends JpaRepository<Vehicule, Integer> {
}
