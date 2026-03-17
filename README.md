# Spring Modulith + Flyway Reproducer

This repo reproduces a Flyway isolation issue with Spring Modulith module tests.
Module A uses `db/migration/a`, while module B intentionally uses `db/migration/b_faulty`.
Running the module B test shows whether `@ApplicationModuleTest` isolates migrations per module.

```bash
./mvnw clean test -Dtest=ModuleBIntegrationTest
```
