package web.app.springsoapcrud.foo.command.application;

import web.app.springsoapcrud.foo.command.domain.Foo;

import java.util.Optional;

public interface FooRepository {
    Optional<Foo> findById(long id);
    void save(Foo foo);
}
