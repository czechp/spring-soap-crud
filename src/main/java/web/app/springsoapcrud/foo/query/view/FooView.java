package web.app.springsoapcrud.foo.query.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FooView {
    private long id;
    private String name;
    private long age;
}
