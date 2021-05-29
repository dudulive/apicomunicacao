package com.example.apicomunicacao.service;

import com.example.apicomunicacao.models.Comunicado;
import com.example.apicomunicacao.repository.ComunicadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComunicadoService {

    @Autowired
    private ComunicadoRepository comunicadoRepository;

    public Comunicado salvar(Comunicado comunicado){
        return comunicadoRepository.save(comunicado);
    }

    public void excluir(Comunicado comunicado){
         comunicadoRepository.delete(comunicado);
    }
	
    
}
