# Projekt zur Passwortvalidierung

# Ziel
 - mit JDK21 und Maven ein kleines Projekt zur Validierung eines Strings als Passwort umsetzen
 - TDD-Ansatz mit JUnit 5
 - Einbinden von CI mittels github

# Passwort Policy:
- min. 8 Zeichen
- min. eine Ziffer (0-9)
- min. ein Groß- und Kleinbuchstabe
- kein Standard/schwaches Passwort
- erlaubte Sonderzeichen: !@#$%^&*()-_+=?.,;:

# Usage
- Bei Start wird per command line eine Passworteingabe erbeten
```
Hello, bitte gib ein Passwort ein.
Bedenke die Passwort Policy.
Eingabe: 
```

Rückgabe ist entweder ``valid password`` oder `invalid password`


# Build:
Build inklusive Tests:
- `mvn clean verify`
- IntelliJ GUI: Maven -> Lifecycle -> clean, verify
- Alternativ `javac Main.java` in .\src\main

# Test
Tests:
- `mvn test`
- IntelliJ GUI: Maven -> Lifecycle -> test

Results:
- \target\surefire-reports\MainTest.txt

# Run
- z.B. `java Main` in .\src\main

# Bonus umgesetzt:
- Junit @ParameterizedTest für Testdatensätze (z. B. gültig/ungültig Liste).
- CLI Abfrage für Usereingabe
- Manuelles Kompilieren per `javac Main.java` in .\src\main
