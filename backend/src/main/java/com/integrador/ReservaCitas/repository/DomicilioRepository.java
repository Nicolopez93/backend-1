package com.integrador.ReservaCitas.repository;

import com.integrador.ReservaCitas.entity.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Integer> {
}
