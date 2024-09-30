/*package cat.tecnocampus.notes2425.domain;

import java.time.LocalDateTime;
import java.util.Set;

public record Note(Long id, UserLab owner, String title, String content, LocalDateTime creationDate, Set<Tag> tags) {
}

 */
package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserLab owner;

    private String title;
    private String content;

    private LocalDateTime creationDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "note_tags",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>(); // Etiquetas asociadas a la nota

    public Note() {
    }

    public Note(UserLab owner, String title, String content, LocalDateTime creationDate) {
        this.owner = owner;
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }

    public <R> Note(Object o, UserLab owner, String title, String content, LocalDateTime now, R collect) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public void removeTag(Tag tag) {
        this.tags.remove(tag);
    }
}
