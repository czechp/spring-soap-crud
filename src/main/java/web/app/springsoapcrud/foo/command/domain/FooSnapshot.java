package web.app.springsoapcrud.foo.command.domain;

import lombok.Getter;

@Getter
public class FooSnapshot {
   private final long id;
   private final String name;
   private final int age;

   public FooSnapshot(long id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }
}
