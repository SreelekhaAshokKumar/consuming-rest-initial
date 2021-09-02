package com.example.consumingrestinitial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private final long id;
    private final String quote;

    public Value(long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
