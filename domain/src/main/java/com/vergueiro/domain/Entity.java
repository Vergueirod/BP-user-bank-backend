package com.vergueiro.domain;
import com.vergueiro.domain.validation.ValidationHandler;

import java.util.Objects;

public abstract class Entity<ID extends Identifier> {

    protected final ID id;

    protected Entity(final ID id) {
        Objects.requireNonNull(id, "'id' should not be null.");
        this.id = id;
    }

    public abstract void validate(ValidationHandler handler);

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final Entity<?> entity = (Entity<?>) o;
        //return getId().equals(entity.getId());
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        //return Objects.hashCode(getId());
        return Objects.hashCode(id);
    }
}
