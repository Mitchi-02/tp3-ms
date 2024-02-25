package com.esisba.msformation.repositories;

import com.esisba.msformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}