package web.app.springsoapcrud.foo.query.application.query;

import web.app.springsoapcrud.foo.query.view.FooView;

import java.util.Optional;

public interface FooViewQueryFindById {
    Optional<FooView> findById(long id);
}
