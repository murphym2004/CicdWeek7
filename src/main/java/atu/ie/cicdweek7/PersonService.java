package atu.ie.cicdweek7;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repo;

    public PersonService(PersonRepository repo)
    {
        this.repo = repo;
    }

    public Person create(Person p)
    {
        return repo.save(p);
    }
    public List<Person> findAll() { return repo.findAll(); }

    public Person findByEmployeeId(String id) {
        return repo.findByEmployeeId(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found"));
    }

    public Person UpdateEmployee(@Valid @RequestBody Person p) {
        return repo.save(p);
    }

    public Person DeleteEmployee(@Valid @RequestBody Person p) {
            repo.deleteById(p.getId());
        return p;
    }
}