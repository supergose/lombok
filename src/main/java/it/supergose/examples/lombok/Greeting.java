package it.supergose.examples.lombok;

import java.util.Objects;

public class Greeting {

    private final long id;
    private final String content;

    private Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting that = (Greeting) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.content);
    }

    @Override
    public String toString() {
        return this.content;
    }

    public static class Builder {
        private long id;
        private String content;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Greeting build() {
            return new Greeting(id, content);
        }
    }

}
