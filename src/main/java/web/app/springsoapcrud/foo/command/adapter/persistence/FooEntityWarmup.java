package web.app.springsoapcrud.foo.command.adapter.persistence;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
class FooEntityWarmup {
    private final FooEntityRepository fooEntityRepository;

    @EventListener(ApplicationReadyEvent.class)
    void init() {
        System.out.println("Foo entity warmup");
        List.of(
                new FooEntity(0L, "First name", 1),
                new FooEntity(0L, "Second name", 2),
                new FooEntity(0L, "Third name", 3)
        ).forEach(fooEntityRepository::save);
    }
}
