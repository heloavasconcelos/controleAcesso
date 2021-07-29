package com.project.controlePontoAcesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * As anotações abaixos servem para gerar
 * os métodos padrões das classes
 * no momento que o código for compilado
 * **/

@Getter                             //Gera getters
@Setter                             //Gera setters
@AllArgsConstructor                 //Gera construtor com todos os atributos
@NoArgsConstructor                  //Gera construtor padrão
@EqualsAndHashCode                  //Gera os métodos equals e hashCode (codificação e comparação de dados)
@Builder                            //Facilita relacionamento entidade x DTO
@Entity
public class Usuario {
    @Id
    private long id;
    private String descricao;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
}
