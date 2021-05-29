package com.example.apicomunicacao.service;

import java.util.List;

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
	
    public List<Comunicado> lista(){
		return comunicadoRepository.findAll();
	}

    public List<Comunicado> procureComunicadoPeloDestinatario(String destinatario){
		return comunicadoRepository.procureComunicadoPeloDestinatario(destinatario.trim().toUpperCase());
	}
}
