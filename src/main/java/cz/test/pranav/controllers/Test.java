package cz.test.pranav.controllers;

import cz.test.pranav.repository.PranavRepository;
import cz.test.pranav.models.Pranav;
import cz.test.pranav.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class Test {

    @Autowired
    PranavRepository pranavRepository;

    @GetMapping("/all")
    public ResponseEntity<List>  allAccess() {
        List l = pranavRepository.findAll();
        return ResponseEntity.ok(l);

    }

    @GetMapping("/{id}")
    public String allAccess(@PathVariable Integer id) {
        return "Tve id:" + id.toString();
    }

    @PostMapping("/")
    public String user(@RequestBody User user) {
        pranavRepository.save(new Pranav(user.getUsername(),user.getEmail()));
        return String.format("User:%s, email:%s",user.getUsername(),user.getEmail());
    }
}
