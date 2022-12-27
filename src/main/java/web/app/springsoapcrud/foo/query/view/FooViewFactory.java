package web.app.springsoapcrud.foo.query.view;

public class FooViewFactory {
    public static FooView createBasic(long id, String name, int age) {
        return new FooView(id, name, age);
    }
}
