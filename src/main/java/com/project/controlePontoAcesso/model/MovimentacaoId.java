package com.project.controlePontoAcesso.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class MovimentacaoId implements Serializable {
    private long idMov;
    private long idUser;
}
