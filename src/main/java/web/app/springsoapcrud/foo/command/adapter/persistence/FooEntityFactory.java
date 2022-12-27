package web.app.springsoapcrud.foo.command.adapter.persistence;

import web.app.springsoapcrud.foo.command.domain.FooSnapshot;

class FooEntityFactory {
    static FooEntity create(FooSnapshot fooSnapshot){
        return  new FooEntity(
                fooSnapshot.getId(),
                fooSnapshot.getName(),
                fooSnapshot.getAge()
        );
    }
}
