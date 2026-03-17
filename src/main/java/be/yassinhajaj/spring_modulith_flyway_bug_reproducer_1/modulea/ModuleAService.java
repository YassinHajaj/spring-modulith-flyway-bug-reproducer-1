package be.yassinhajaj.spring_modulith_flyway_bug_reproducer_1.modulea;

import org.springframework.stereotype.Service;

@Service
public class ModuleAService {
    private final ModuleARepository repository;

    public ModuleAService(ModuleARepository repository) {
        this.repository = repository;
    }

    public ModuleAEntity save(String name) {
        return repository.save(new ModuleAEntity(name));
    }

    public Iterable<ModuleAEntity> findAll() {
        return repository.findAll();
    }
}

