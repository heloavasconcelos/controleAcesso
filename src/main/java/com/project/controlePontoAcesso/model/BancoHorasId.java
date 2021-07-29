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
public class BancoHorasId implements Serializable {
    private long idBancoHoras;
    private long idMov;
    private long idUser;
}
