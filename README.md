# 01_HelloWorld

# Aufgabe 5 (2 Punkte)
# Sie sehen folgenden Stub-Code einer Java-Klasse:
// *public class TestClass extends SuperClass1 extends SuperClass2 { ….. }*
# Der Code kompiliert nicht. Warum?
Vererbung aus der Superclass kann seriell erfolgen, jedoch ist mehrfach Vererbung aus 2 Superclasses in ein Subclass ist nicht möglich.


# Aufgabe 6 (4 Punkte)
# Aus einer Methode in einer Klasseninstanz geben Sie die Variable this aus.
# Was beinhaltet diese Variable? In welcher anderen Variable finden Sie diesen Wert
# ebenfalls?
# Ihre Antwort (Stichpunkte):
Die Selbstrefferenz "this" bezieht sich auf den die Variable selbst.



# Aufgabe 7 (4 Punkte)
# In einer Klasse ist eine Instanzvariable wie folgt deklariert: private int counter;
# Geben Sie zwei geeignete Methoden an, durch die der Inhalt der Variable von außerhalb
# der Klasse gelesen bzw. geändert werden kann.

public getter in klasse wird von außerhalb gecalled
public setter in klasse wird von außerhalb gecalled


# Aufgabe 8 (5 Punkte)
# Deklarieren Sie die in o.g. Klassendiagramm angegebenen Attribute - beachten Sie dabei
# den Datentyp & die Sichtbarkeit der jeweiligen Instanzvariablen.

protected int counter;
protected int age;
private String familyName;
private String firstName;
public boolean status;
