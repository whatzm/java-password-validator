# Password Validator

A simple console application written in Java that validates passwords based on predefined security rules.

## Features

The application checks whether a password meets the following requirements:

- Contains at least **8 characters**
- Contains at least **one digit**
- Contains at least **one uppercase letter**
- Contains at least **one lowercase letter**
- Contains at least **one special character**

Supported special characters:

```
! @ # $ % ^ & *
```

If the password is invalid, the application displays all validation errors.

After each validation, the user can choose to check another password or exit the application.

---

## Project Structure

```
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
```

### Classes description

| Class | Description |
|---|---|
| `Program` | Entry point of the application. Handles user input and application flow. |
| `PasswordValidator` | Contains password validation logic. |
| `PasswordRules` | Stores validation constants and allowed special characters. |
| `PasswordError` | Enum containing validation errors and messages. |

---

## Example

### Valid password

```
Enter your password: Password123!

Password is valid!

Do you want to check another password? (Y/N)
```

### Invalid password

```
Enter your password: pass

Password is INVALID!

Password must contain at least 8 characters.
Password must contain at least one DIGIT.
Password must contain at least one UPPERCASE LETTER.
Password must contain at least one SPECIAL CHARACTER.

Do you want to check another password? (Y/N)
```

---

## Validation Rules

A password is considered valid only if it satisfies all rules:

| Rule | Requirement |
|---|---|
| Minimum length | At least 8 characters |
| Uppercase letter | At least one uppercase letter |
| Lowercase letter | At least one lowercase letter |
| Digit | At least one number |
| Special character | At least one symbol from `! @ # $ % ^ & *` |

---

## How to Run

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA.

3. Run:

```
Program.java
```
4. Enter a password in the console and follow the instructions.

---