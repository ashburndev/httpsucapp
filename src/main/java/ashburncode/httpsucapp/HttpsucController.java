package ashburncode.httpsucapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// https://spring.io/guides/tutorials/rest

// import java.util.List;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

@RestController
class HttpsucController {

  // private final EmployeeRepository repository;

  // EmployeeController(EmployeeRepository repository) {
  // this.repository = repository;
  // }

  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/getRequest/{targetUrl}")
  String targetUrl(@PathVariable String targetUrl) {
    return "HttpsucController getRequest " + targetUrl;
  }

}