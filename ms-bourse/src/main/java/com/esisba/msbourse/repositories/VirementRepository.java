package com.esisba.msbourse.repositories;

import com.esisba.msbourse.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface VirementRepository extends JpaRepository<Virement, Long> {

    List<Virement> findVirementByEtudiant_IdEtudiant(Long ide);
}
