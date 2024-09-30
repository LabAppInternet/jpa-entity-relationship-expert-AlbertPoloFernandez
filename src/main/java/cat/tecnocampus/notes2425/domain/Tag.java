package cat.tecnocampus.notes2425.domain;
/*
public record Tag(String name) {
}
*/

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único para cada etiqueta

    private String name; // Nombre de la etiqueta

    @ManyToMany(mappedBy = "tags")
    private Set<Note> notes = new HashSet<>(); // Notas asociadas a esta etiqueta

    // Constructor vacío requerido por JPA
    public Tag() {
    }

    // Constructor parametrizado
    public Tag(String name) {
        this.name = name;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
}
