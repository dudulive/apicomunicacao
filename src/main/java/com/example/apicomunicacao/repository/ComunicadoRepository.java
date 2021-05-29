package com.example.apicomunicacao.repository;

import java.util.List;

import com.example.apicomunicacao.models.Comunicado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComunicadoRepository extends JpaRepository<Comunicado, Long> {

    @Query(value = "SELECT c FROM Comunicado c where trim(c.destinatario) = ?1")
	List<Comunicado> procureComunicadoPeloDestinatario(String destinatario);
    
}
