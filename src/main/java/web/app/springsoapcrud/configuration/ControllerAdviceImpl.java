package web.app.springsoapcrud.configuration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class ControllerAdviceImpl {
    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity notFoundExceptionHandler(Exception exception){
        return ResponseEntity.notFound().build();
    }
}
