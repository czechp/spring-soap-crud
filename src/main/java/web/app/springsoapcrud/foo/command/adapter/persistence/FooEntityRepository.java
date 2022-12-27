package web.app.springsoapcrud.foo.command.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FooEntityRepository  extends JpaRepository<FooEntity, Long> {
}
