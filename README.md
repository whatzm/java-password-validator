# Password Validator

A simple Java console application that validates passwords based on predefined security rules.

## Features

The application checks whether a password:

- Contains at least **8 characters**
- Contains at least **one digit**
- Contains at least **one uppercase letter**
- Contains at least **one lowercase letter**
- Contains at least **one special character**

Supported special characters:

```text
! @ # $ % ^ & *
```

If the password is invalid, all validation errors are displayed.

## Project Structure

```text
src
├── main
│   └── java
│       └── password_validator
│           ├── Program.java
│           ├── PasswordValidator.java
│           ├── PasswordRules.java
│           └── PasswordError.java
│
└── test
    └── java
        ├── base
        ├── data
        ├── helper
        └── test

testng
├── testng.xml
├── regression.xml
└── smoke.xml
```

## Testing

The project uses **TestNG** for automated testing.

Tests are organized into the following groups:

- `positiveValidation` — valid password tests
- `negativeValidation` — invalid password tests
- `errorValidation` — password error validation
- `regression` — full regression test suite
- `smoke` — critical tests for quick validation

Test data is provided using TestNG `DataProvider`s.

## Validation Rules

A password is considered valid only if it satisfies all rules:

| Rule | Requirement |
|---|---|
| Minimum length | At least 8 characters |
| Uppercase letter | At least one |
| Lowercase letter | At least one |
| Digit | At least one |
| Special character | At least one from `! @ # $ % ^ & *` |

## How to Run

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA.

3. Run `Program.java` to start the application.

4. To run tests, use one of the TestNG suites:

- `testng.xml` — validation tests by type
- `regression.xml` — full regression suite
- `smoke.xml` — smoke test suite

The suites can be run directly from IntelliJ IDEA using a TestNG run configuration.
