package com.project.controlePontoAcesso.model;

import lombok.*;

import javax.persistence.*;
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
public class Movimentacao {
    @Id
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodoPermanencia;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendarioDataEspecial;
}
