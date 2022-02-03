package br.com.alura.loja.exception;

public class DomainException extends RuntimeException {
    public DomainException(String s) {
        super(s);
    }
}
