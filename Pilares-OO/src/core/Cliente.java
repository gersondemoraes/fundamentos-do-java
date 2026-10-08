package core;

public record Cliente(int id, String nome, String email) {
}

/**
 * Record nao precisa de getters setters, só tem getters por padrão.
 */
