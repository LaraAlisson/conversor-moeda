package com.lara.alisson.conversormoeda.exception;

public class entradaUsuarioInvalida extends IllegalStateException {
    private String msg;

    public entradaUsuarioInvalida(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }


}
