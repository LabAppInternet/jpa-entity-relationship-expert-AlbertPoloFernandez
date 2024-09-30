package cat.tecnocampus.notes2425.application.dtos;
/*
import java.time.LocalDateTime;
import java.util.Set;

public record NoteDTO(long id, String title, String content, LocalDateTime creationDate, Set<String> tags) {
}
*/

import java.time.LocalDateTime;

public record NoteDTO(long id,
                      String title,
                      String content, LocalDateTime creationDate, java.util.Set<String> tags) {
}
