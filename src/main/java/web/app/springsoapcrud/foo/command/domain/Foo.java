package web.app.springsoapcrud.foo.command.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Foo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    private final String name;
    private final int age;

    Foo(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    Foo(String name, int age) {
        this.id = 0L;
        this.name = name;
        this.age = age;
    }

    public FooSnapshot getSnapshot() {
        return new FooSnapshot(this.id, this.name, this.age);
    }
}
