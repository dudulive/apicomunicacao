package com.example.apicomunicacao.resources;

import com.example.apicomunicacao.models.Comunicado;
import com.example.apicomunicacao.service.ComunicadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/comunicado")
@CrossOrigin(origins = "*")
public class ComunicadoResource {

    @Autowired
    private ComunicadoService comunicadoService;

    @PostMapping(value = "/agendar")
	@ApiOperation(value = "Agendamento de envio de comunicação")
	public Comunicado save(@RequestBody Comunicado comunicado) {
		return comunicadoService.salvar(comunicado);
	}
    
	@DeleteMapping(value = "/cancelar")
	@ApiOperation(value = "Cancelar o comunicado.")
	public void delete(@RequestBody Comunicado comunicado) {
		comunicadoService.excluir(comunicado);
	}
}
