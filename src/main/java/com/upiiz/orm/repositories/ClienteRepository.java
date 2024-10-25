package com.upiiz.orm.repositories;

import com.upiiz.orm.models.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// JpaRepository
// CrudRepository
@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    // Generar consultas más personalizadas
    // @Query

}
