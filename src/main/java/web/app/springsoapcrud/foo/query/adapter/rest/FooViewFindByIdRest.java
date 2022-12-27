package web.app.springsoapcrud.foo.query.adapter.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import web.app.springsoapcrud.configuration.NotFoundException;
import web.app.springsoapcrud.foo.query.application.query.FooViewQueryFindById;
import web.app.springsoapcrud.foo.query.view.FooView;

@RestController
@RequestMapping("/api/foos")
@CrossOrigin("*")
@AllArgsConstructor
class FooViewFindByIdRest {
    private final FooViewQueryFindById queryFindById;

    @GetMapping("/{id}")
    FooView getFooViewById(@PathVariable(name = "id") long fooId) {
        return queryFindById.findById(fooId)
                .orElseThrow(NotFoundException::new);
    }
}
