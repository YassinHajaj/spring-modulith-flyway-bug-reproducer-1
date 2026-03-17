package be.yassinhajaj.spring_modulith_flyway_bug_reproducer_1.moduleb;

import org.springframework.stereotype.Service;

@Service
public class ModuleBService {
    private final ModuleBRepository repository;

    public ModuleBService(ModuleBRepository repository) {
        this.repository = repository;
    }

    public ModuleBEntity save(String description) {
        return repository.save(new ModuleBEntity(description));
    }

    public Iterable<ModuleBEntity> findAll() {
        return repository.findAll();
    }
}

