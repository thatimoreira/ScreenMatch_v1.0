package br.com.alura.screenmatch.exceptions;

public class InvalidYearFormatException extends RuntimeException {
    private String message;

    public InvalidYearFormatException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
