package danvega.dev.unitvsint.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefController {

    @GetMapping("/ref")
    public String Ref(@RequestParam(name = "name", defaultValue = "RefName") String name) {
        return String.format("Ref, %s", name);
    }
}