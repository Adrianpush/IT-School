package session15.homework.challenge8;

import java.time.LocalDateTime;
import java.util.Objects;

// Given a list of objects representing database entities with fields such as id, name, and timestamp,
// ensure that no two entities are considered equal if their id fields are different.

public abstract class DatabaseEntry {

    private String id;
    private String name;
    private LocalDateTime timestamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatabaseEntry that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
