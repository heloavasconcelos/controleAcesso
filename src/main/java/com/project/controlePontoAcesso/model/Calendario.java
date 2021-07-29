package com.project.controlePontoAcesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
public class Calendario {
    @Id
    private long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
