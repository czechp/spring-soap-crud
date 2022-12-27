package web.app.springsoapcrud.foo.query.application.port;

import web.app.springsoapcrud.foo.query.view.FooView;

import java.util.Optional;

public interface FooViewPort {
    Optional<FooView> findById(long id);
}
