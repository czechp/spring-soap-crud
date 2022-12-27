package web.app.springsoapcrud.foo.command.adapter.persistence;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.app.springsoapcrud.foo.command.application.FooRepository;
import web.app.springsoapcrud.foo.command.domain.Foo;
import web.app.springsoapcrud.foo.command.domain.FooFactory;

import java.util.Optional;

@Service
@AllArgsConstructor
class FooRepositoryImpl implements FooRepository {
    private final FooEntityRepository fooEntityRepository;
    @Override
    public Optional<Foo> findById(long id) {
        return fooEntityRepository.findById(id)
                .map(fooEntity -> FooFactory.create(fooEntity.getId(), fooEntity.getName(), fooEntity.getAge()));
    }

    @Override
    public void save(Foo foo) {
        FooEntity fooEntity = FooEntityFactory.create(foo.getSnapshot());
        fooEntityRepository.save(fooEntity);
    }
}
