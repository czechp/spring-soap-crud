package web.app.springsoapcrud.foo.query.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FooViewRepository extends JpaRepository<FooViewEntity, Long> {

}
