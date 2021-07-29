package com.project.controlePontoAcesso.exceptions;

import com.project.controlePontoAcesso.utils.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
