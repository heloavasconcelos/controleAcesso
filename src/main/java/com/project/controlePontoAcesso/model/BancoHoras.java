package com.project.controlePontoAcesso.model;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {
    @Id
    @EmbeddedId                     //Indica que atributo é chave embutida
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHorasTrabalhadas;
    private BigDecimal saldoBancoHoras;
}
