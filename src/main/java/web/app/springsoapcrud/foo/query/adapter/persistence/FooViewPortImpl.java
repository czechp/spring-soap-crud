package web.app.springsoapcrud.foo.query.adapter.persistence;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.app.springsoapcrud.foo.query.application.port.FooViewPort;
import web.app.springsoapcrud.foo.query.view.FooView;
import web.app.springsoapcrud.foo.query.view.FooViewFactory;

import java.util.Optional;

@Service
@AllArgsConstructor
class FooViewPortImpl implements FooViewPort {
    private final FooViewRepository fooViewRepository;
    @Override
    public Optional<FooView> findById(long id) {
        return fooViewRepository.findById(id)
                .map(this::mapToView);
    }

    private FooView mapToView(FooViewEntity fooViewEntity){
        return FooViewFactory.createBasic(fooViewEntity.getId(), fooViewEntity.getName(), fooViewEntity.getAge());
    }
}
