package com.vergueiro.domain;

import java.util.Objects;

public class AggregateRoot<ID extends Identifier> extends Entity<ID>{

    protected AggregateRoot(final ID id) {
        super(id);
    }
}
