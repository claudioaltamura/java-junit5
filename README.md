![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/claudioaltamura/java-junit5/build-gradle-project.yml?branch=main)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# java-junit5
### junit5 examples

1. @BeforeEach, @AfterEach
2. @BeforeAll, @AfterAll
3. @Test, @DisplayName
4. @RepeatedTest
5. @ParameterizedTest
6. @Disabled
7. assertAll
8. assertThrows
9. assertTimeout
10. assumptions
11. @Tag
12. test life cycle
13. conditional test execution
14. Dynamic Test @TestFactory

see https://junit.org/junit5/docs/current/user-guide/

### Build

    ./gradlew clean build

### Running tests

    ./gradlew clean test
    
### Running tagged tests (example1)

    ./gradlew test    
    
### Running tagged tests (example2)

    ./gradlew example2Test        
