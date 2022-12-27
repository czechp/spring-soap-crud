package web.app.springsoapcrud.foo.query.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.app.springsoapcrud.foo.query.application.port.FooViewPort;
import web.app.springsoapcrud.foo.query.application.query.FooViewQueryFindById;
import web.app.springsoapcrud.foo.query.view.FooView;

import java.util.Optional;

@Service
@AllArgsConstructor
class FooViewQueryFindByIdImpl implements FooViewQueryFindById {
    private final FooViewPort fooViewPort;

    @Override
    public Optional<FooView> findById(long id) {
        return fooViewPort.findById(id);
    }
}
