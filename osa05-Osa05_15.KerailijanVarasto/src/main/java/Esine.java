import java.util.Objects;

public class Esine {
    private String id;
    private String name;

    public Esine(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Esine esine = (Esine) o;
        return Objects.equals(id, esine.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + ": " + name;
    }
}