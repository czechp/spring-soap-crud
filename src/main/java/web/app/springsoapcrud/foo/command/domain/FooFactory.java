package web.app.springsoapcrud.foo.command.domain;

public class FooFactory {
    public static Foo create(String name, int age) {
        return new Foo(name, age);
    }

    public static Foo create(long id, String name, int age){
        return new Foo(id, name, age);
    }
}
