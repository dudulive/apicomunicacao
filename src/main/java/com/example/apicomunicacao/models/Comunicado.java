package com.example.apicomunicacao.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.apicomunicacao.models.enums.Formato;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TB_COMUNICADO")
public class Comunicado implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TB_COMUNICADO_ID_COMUNICADO_SEQ", sequenceName = "TB_COMUNICADO_ID_COMUNICADO_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_COMUNICADO_ID_COMUNICADO_SEQ")
	@Column(name = "ID_COMUNICADO", updatable = false)
	private Long id;

    @NotNull
	@Column(name = "MENSAGEM_COMUNICADO")
    private String mensagem;

    @NotNull
	@Column(name = "DESTINATARIO_COMUNICADO")
    private String destinatario;

    @Column(name = "DATA_COMUNICADO", columnDefinition = "TIMESTAMP")
    private LocalDateTime dataEnvio;

    @NotNull
	@Column(name = "FORMATO_COMUNICADO")
    @Enumerated(EnumType.STRING)
    private Formato formato;

    public Formato getFormato() {
        return this.formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public LocalDateTime getDataEnvio() {
        return this.dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}
