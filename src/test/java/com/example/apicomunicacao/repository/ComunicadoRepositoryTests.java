package com.example.apicomunicacao.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.List;

import com.example.apicomunicacao.models.Comunicado;
import com.example.apicomunicacao.models.enums.Formato;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ComunicadoRepositoryTests {

    @Autowired
    private ComunicadoRepository comunicadoRepository;

    @Test
    public void insertComunicado() {
        Comunicado comunicado = new Comunicado("Teste", "99999999999", LocalDateTime.now(), Formato.SMS);
        comunicadoRepository.save(comunicado);
        Integer countComnicado = comunicadoRepository.findAll().size();
        assertEquals(1, countComnicado);
    }

    @Test
    public void procureComunicadoPeloDestinatario() {
        Comunicado comunicado = new Comunicado("Teste", "99999999999", LocalDateTime.now(), Formato.SMS);
        comunicadoRepository.save(comunicado);
        Integer countComnicado = comunicadoRepository.findAll().size();
        assertEquals(1, countComnicado);
        List<Comunicado> comunicado1 = comunicadoRepository.procureComunicadoPeloDestinatario("99999999999");
        assertNotNull(comunicado1);
    }

    @Test
    public void deleteComunicado() {
        Comunicado comunicado = new Comunicado("Teste", "99999999999", LocalDateTime.now(), Formato.SMS);
        comunicadoRepository.save(comunicado);
        comunicadoRepository.delete(comunicado);
        Integer countComnicado = comunicadoRepository.findAll().size();
        assertEquals(0, countComnicado);
    }
    
}
