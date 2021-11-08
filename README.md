Przygotować aplikację z ekranem głównym i ekranami dodatkowymi o następujących cechach i zawartości (patrz rys.):

1. Ekran (aktywność) główny jest realizowany układami linearnymi.
Zawiera na górze wyśrodkowany krótki opis, na dole element BottomNavigation z 3 przyciskami akcji, którymi wywołuje się trzy kolejne aktywności (ekrany), w centrum jest obrazek oraz imię i nazwisko autora.
2. Drugi ekran (układ ekranu drugiej aktywności) zawiera przyciski wyboru (radio buttons) i przycisk dwustanowy (toogle button), których wybór zmienia elementy na ekranie (obrazek oraz napis).
Układ powinien być realizowany jako ConstraintLayout.
Toast ma wyświetlać zawartość / stan (ustawienie) wszystkich elementów na ekranie.
3. Trzeci ekran to prezentacja różnych możliwości układu relatywnego.
Należy wyraźnie pokazać cechy układu relatywnego.
Umieścić w układzie:
- suwak
- pole tekstowe pokazujące liczbowo wartość ustawioną na suwaku.
4. Czwarta aktywność zawiera w układzie GridLayout lub TableLayout pola edycyjne z opisem obok, o specyfikowanym rodzaju zawartości (tylko tekst, tylko liczby, ...)
Przycisk "BMI" powoduje wywołanie piątej aktywności z przekazaniem danych (tu wzrost i waga) oraz możliwością odebrania zwracanych danych.
- odebranie wyniku jest poprzez zarejestrowanego słuchacza.
Aktywność zawiera ScrollView.
5. Piąta aktywność wyświetla odebrane dane i może wyliczyć wynik (tu: BMI - wskaźnik masy ciała)
6. Co najmniej jedna aktywność powinna nie być pochodną AppCompat (ekran powinien mieć motyw inny niż dla AppCompat) i mieć zmieniony motyw (theme).
7. Powrót jest zrobiony przyciskiem na ekranie i w pasku aktywności.
8. Dodaj w aplikacji możliwość uruchomienia jej poprzez unikalna własną akcje (patrz punkt poniżej).

![image](https://user-images.githubusercontent.com/61067969/140713441-c2218c41-4b8e-47ab-9b37-17fff746e832.png)
