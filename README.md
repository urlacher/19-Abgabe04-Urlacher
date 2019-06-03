# Lab Report "Vertiefende Gesamtwiederholung Arbeitsaufträge"

<table>
    <tr>
        <td>
        Name
        </td>
        <td>
        Thomas Urlacher
        </td>
    </tr>
    <tr>
        <td>
        Abgabe
        </td>
        <td>
        04
        </td>
    </tr>
    <tr>
        <td>
        Repository
        </td>
        <td>
        <a href="https://github.com/urlacher/19-Abgabe04-Urlacher.git">https://github.com/urlacher/19-Abgabe04-Urlacher.git</a>
        </td>
    </tr>
</table>

## Aufgabenstellung

In dieser abschließenden Übung müssen Sie alle gelernten Aspekte des Konfigurationsmanagements im Rahmen des Queue Beispiels (Test Automation GitHub) wiederholen bzw. vertiefen.
Die Dokumentation müssen Sie komplett in Markdown erstellen und einen PDF Export davon abgeben. Während der Umsetzung müssen Teilergebnisse auf Ihr Repository online gestellt werden und eine eigene Taskliste geführt werden, damit für alle der aktuelle Status erkennbar ist.
Die Taskliste ist eine Github Flavor Erweiterung von Markdown, die Sie in Ihrer readme.md erstellen sollen. (Der Rest der Angabe ist die Basis Ihrer Arbeitsaufträge und zugleich Ausgangstaskliste– die dann entsprechen abhaken bzw. durch neue Punkte oder Subpunkte erweitern.)

### TO-DO List (Taskliste)

---

- [x] 1. Übertrage Angabe in Taskliste in Mardown Readme
- [x] Einspielen Queue Vorlage aus Repository: https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Queue
- [ ] Taskergebnisse Schritt für Schritt auf Git stellen
  - [x] Führung Taskliste
  - [ ] Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B. Testfälle geschrieben so wird auch in der Taskliste diese Aufgabe als erledigt markiert und Testfälle inkl. geänderter Taskliste ins Repository übertragen.

---

- [x] 2. Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
  - [x] Es befinden sich gesamt 3 Fehler im Source Code.
  - [x] Bei Bedarf optimieren Sie das Queue Beispiel.
  - [x] Ergänzen Sie das Beispiel nach eigenem Ermessen um es testen zu können.

---

- [x] 3. Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
  - [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.

---

- [x] 4. Erstellung JUnit Tests (vollständig testen, mehrere Varianten)
  - [x] Sie werden die „selben“ Testfälle mehrfach erstellen müssen um „mehrere Variationen“ für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
  - [x] JavaDoc Kommentare erstellen.
  - [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.

---

- [x] 5. Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren können.
  - [x] EntwicklerInnen Informationen hinzufügen.
  - [x] Integration Logging Bibliothek log4j mittels Maven Dependencies.

---

- [ ] 6. Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
  - [ ] Siehe aktualisiertes Stack Beispiel.
  - [ ] Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
  - [ ] Konfigurieren Sie Logger über ein properties File.
  - [ ] Geben Sie eine Info Lognachricht bei Aufruf einer jeden Methode aus.
  - [ ] Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
  - [ ] Ergebnisse (Konsolenausgabe) als Bild in Dokumentation einfließen lassen.

---

- [ ] 7. Maven Site Dokumentation erstellen
  - [ ] Inklusive Javadoc Code und Javadoc Test Klassen
  - [ ] Inklusive Menü mit Verweis auf manuell erstellte Seite
    - [ ] Seite erläutert Funktionsweise Queue
    - [ ] Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
    - [ ] Der Inhalt der manuell erstellten Seite sollte ersichtlich sein

---

- [ ] 8. Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
  - [ ] Übertragung Information aus Labreport Template.
  - [ ] Alle Schritte dieser Übung nachvollziehbar erläutern.
  - [ ] Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Python und 3 Zeilen Java Source Code korrekt darstellt.
  - [ ] Korrekturlesen Dokumentation
  - [ ] PDF erstellen (zB Dillinger)

---

- [ ] 9. Überprüfung Vollständigkeit der Abgabe

---

- [ ] 10. Abgabe PDF Version der Abgabe

---

## Vorgehen

### 1. TODO Liste mittels Markdown erstellt

### 2. BugFixing

Es wurden 3 Bugs im Java Projekt eingebaut.

#### 2.1 StringQueue Construktor Fehler

Die ersten beiden Fehler betreffen den Construktor.

1. Defaultwert erfordert eigenen Konstruktor
2. maxSize = maxSize ist nutzlos Wert wird nicht übernommen
3. ArrayList&lt;String&gt; könnte durch ArrayList&lt;&gt; ersetzt werden (Kein Bug in diesem Sinne)

**Bug**  
![Bug Construktor Bug](./media/02_01_bug.png)

**Fix**  
![Fix Construktor Fix](./media/02_01_fix.png)

#### 2.2 poll() IndexOutOfBounce Error

1. Die Prüfung der ArrayListe auf die Size == 0 führt zu einer IndexOutOfBounce Exception.

**Bug**  
![IndexOutOfBounce Bug](./media/02_02_bug.png)

**Fix**  
![IndexOutOfBounce Fix](./media/02_02_fix.png)

#### 2.3 remove () unnötige Wert-Zuweisung

1. Mit element = ""; wird dem Returnstring immer der Wert "" zugewiesen anstatt den ElementString zu retournieren

**Bug**  
![IndexOutOfBounce Bug](./media/02_03_bug.png)

**Fix**  
![IndexOutOfBounce Fix](./media/02_03_fix.png)

### 3. JavaDoc

#### 3.1 JavaDoc Annotationen

Folgende JavaDoc Annotationen könnten verwendet werden:

Tag und Parameter  | Ausgabe  | Verwendung in  | seit
-------------------|----------|----------------|-----
@author name  | Beschreibt den Autor.  | Klasse, Interface  |
@version version  | Erzeugt einen Versionseintrag. Maximal einmal pro Klasse oder Interface.  | Klasse, Interface  |
@since jdk-version  | Seit wann die Funktionalität existiert.  | Klasse, Interface, Instanzvariable, Methode  |
@see reference  | Erzeugt einen Link auf ein anderes Element der Dokumentation.  | Klasse, Interface, Instanzvariable, Methode  |
@serial  | Beschreibt die serialisierten Daten eines Serializable-Objekts.  | Klasse  |
@serialField  | Dokumentiert ein Feld eines Serializable-Objekts.  | Klasse, Methode  |
@param name description  | Parameterbeschreibung einer Methode.  | Methode  |
@return description  | Beschreibung des Rückgabewerts einer Methode.  | Methode  |
@throws, @exception classname description  | Beschreibung einer Exception, die von dieser Methode geworfen werden kann.  | Methode  |
@deprecated description  | Beschreibt eine veraltete Methode, die nicht mehr verwendet werden sollte. Sollte ab Java 5.0 immer mit der @Deprecated-Annotation verwendet werden.  | Methode  |
{@inheritDoc}  | Kopiert die Beschreibung aus der überschriebenen Methode.  | Überschreibende Methode  | 1.4.0
{@link reference}  | Link zu einem anderen Symbol.  | Klasse, Interface, Instanzvariable, Methode  |
{@linkPlain reference}  | Der Link wird in Standardtext statt in Quelltextzeichensatz angezeigt.  | Klasse, Interface, Instanzvariable, Methode  | 1.4.0
{@value}  | Gibt den Wert eines konstanten Feldes zurück.  | Statisches Feld  | 1.4.0
{@docRoot}  | Gibt den absoluten Pfad zum Hauptverzeichnis wieder.  | Package, Klassen, Felder, Methoden  |
{@code}  | Formatiert Text buchstabengetreu mit dem Quelltextzeichensatz (entsprechend &lt;code&gt;) und unterdrückt die Interpretierung von beinhalteten HTML oder Javadoc-Tags.  | Klasse, Interface, Instanzvariable, Methode  | 5.0
{@literal}  | Kennzeichnet buchstabengetreuen Text und unterdrückt die Interpretierung von beinhalteten HTML oder Javadoc-Tags.  | Klasse, Interface, Instanzvariable, Methode  | 5.0

#### 3.2 Allgemein

Mittels JavaDoc kann automatisiert 

#### 3.3 Implementierung ins Projekt

##### 3.3.1 main Page

![Main Page](./media/03_01_Javadoc_mainPage.png)

##### 3.3.2 Interface Page

![Interface](./media/03_02_Javadoc_queueInterface.png)

##### 3.3.3 Implementation Page

![Implementation](./media/03_02_Javadoc_queueImplementation.png)

### 4. JUnit

#### 4.1 Before, BeforeClasses etc

Feature | Junit 4 | Junit 5
-|-|-
Execute before all test methods of the class are executed. <br> Used with static method. <br> For example, This method could contain some initialization code | @BeforeClass | @BeforeAll
Execute after all test methods in the current class. <br> Used with static method. <br> For example, This method could contain some cleanup code. | @AfterClass  | @AfterAll
Execute before each test method. <br> Used with non-static method. <br> For example, to reinitialize some class attributes used by the methods. | @Before | @BeforeEach
Execute after each test method. <br> Used with non-static method. <br> For example, to roll back database modifications. | @After       | @AfterEach

#### 4.2 Implementierte Tests

Die Queue Implementierung wurde um eine IndexOutOfBounce Exception im Constructor erweitert, um ein ungewolltes verwenden von Werten &lt;=0 für die Queue zu verhindern.

![JUnit integration in JavaDoc](./media/04_02_Javadoc_StringQueueTest.png)

### 5. pom.xml - JavaDoc

#### 5.1 Anpassungen pom.xml

##### 5.1.1 Enticklerinformationen

Allgemeine Informationen über das pom.xml können hier abgerufen werden: [Apache Maven](https://maven.apache.org/pom.html)
Entwicklerinformationen können wie folgt eingebunden werden.

```xml
<developers>
    <developer>
        <id>thomasurlacher</id>
        <name>Thomas Urlacher</name>
        <email>thomas.urlacher@edu.campus02.at</email>
        <url>https://www.campus02.at</url>
        <organization>FH Campus 02</organization>
        <organizationUrl>https://www.camus02.at</organizationUrl>
        <roles>
            <role>Student</role>
        </roles>
        <timezone>Europe/Vienna</timezone>
        <properties>
            <picUrl>https://avatars0.githubusercontent.com/u/44243523</picUrl>
        </properties>
    </developer>
</developers>

```

Weitere Informationen über [Developers](https://maven.apache.org/pom.html#Developers)

#### 5.1.2 SCM Informationen für die Maven-Site

Im SCM Teil der pom.xml datei kann auch eine Verknüpfung auf das Versionsmanagementsystem hergestellt werden.

```xml
<scm>
    <connection>scm:git:https://github.com/urlacher/19-Abgabe04-Urlacher</connection>
    <developerConnection>scm:git:https://github.com/urlacher/19-Abgabe04-Urlacher</developerConnection>
    <tag>HEAD</tag>
    <url>https://github.com/urlacher/19-Abgabe04-Urlacher</url>
</scm>
```

Weitere Informationen über [SCM](https://maven.apache.org/pom.html#SCM)

#### 5.1.3 log4j Einbindung

log4j kann folgendermaßen über das pom.xml eingebunden werden:

```xml
<dependencies>
    ....
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-api</artifactId>
        <version>2.11.1</version>
    </dependency>
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.11.1</version>
    </dependency>
</dependencies>
```

### 6. Log4j

### 7. Maven Site Dokumentation

### 8. MarkDown Lab Report

## Links/Literatur
