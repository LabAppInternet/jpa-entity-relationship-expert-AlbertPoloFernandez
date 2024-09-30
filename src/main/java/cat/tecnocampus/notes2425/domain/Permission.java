package cat.tecnocampus.notes2425.domain;
/*
public record Permission(UserLab owner, Note note, boolean canRead, boolean canEdit) {
}
*/

import jakarta.persistence.*;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único de la permisión

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserLab owner; // Propietario de la permisión

    @ManyToOne
    @JoinColumn(name = "note_id", nullable = false)
    private Note note;

    private boolean canRead; // Permiso para leer la nota
    private boolean canEdit; // Permiso para editar la nota


    public Permission() {
    }

    public Permission(UserLab owner, Note note, boolean canRead, boolean canEdit) {
        this.owner = owner;
        this.note = note;
        this.canRead = canRead;
        this.canEdit = canEdit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserLab getOwner() {
        return owner;
    }

    public void setOwner(UserLab owner) {
        this.owner = owner;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
