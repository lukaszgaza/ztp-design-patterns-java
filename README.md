`# Wzorce projektowe

## Materiały
* "Wzorce projektowe. Elementy oprogramowania" E. Gamma, R. Helm, R. Johnson, J. Vlissides
* https://refactoring.guru/pl/design-patterns

## Zadania
1. Wzorzec projektowy Singleton
    * implementacja ma znajdować się wewnątrz klasy `Singleton`
    * metoda zwracająca instancję ma nazywać się `getInstance`

2. Wzorzec projektowy Budowniczy
   * zaimplementuj klasę `Window` reprezentującą okno programu graficznego
   * klasa ma przyjmować jako argumenty swojego konstruktora:
     * `int x` - składową x położenia okna (domyślna wartość 0)
     * `int y` - składową y położenia okna (domyślna wartość 0)
     * `int width` - szerokość okna (domyślna wartość 100)
     * `int height` - wysokość okna (domyślna wartość 100)
     * `String title` - tytuł okna (domyślna wartość `""`)
   * klasa `Window` ma mieć metody zwracające poszczególne atrybuty (getter) o nazwie `get<Atrybut>` gdzie `Atrybut` to konkretny atrybut, 
   * klasa ma mieć statyczną klasę wewnętrzną `Builder` pełniącą rolę Budowniczego klasy `Window`. Nie ma potrzeby tworzenia osobnego interfejsu `Builder`.
   * Budowniczy ma być zwracany za pomocą metody `newBuilder()` klasy `Window`
   * klasa `Builder` ma mieć betodę `build()` zwracającą zbudowany obiekt `Window`
   * klasa `Builder` ma mieć metody inicjalizujące poszczególne elementy okna, ich nazwy powinny być takie same jak nazwy parametrów okna
   * przykład użycia wspomnianych meteod \
     ```java
     Window.Builder builer = Window.newBuilder();
     Window window = builder
                .x(20)
                .y(30)
                .height(200)
                .width(300)
                .title("New window")
                .build();
     ```
     lub
     ```java
     Window window = Window.newBuilder()
                .x(20)
                .y(30)
                .height(200)
                .width(300)
                .title("New window")
                .build();
     ```