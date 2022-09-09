# COO - Project

This repository belongs to **Matthieu Medeng Essia** and **Lounès Meddahi**.

Informatique-Mathématiques bachelor's degree.

### Subject

On one hand, the project's subject aims to make an object analysis of a problem, which is organizing a sport's competition among several possible kinds (league or tournament) and between teams challenging each other into matches. On the other hand, another purpose of the project is to design a suitable solution by using object concepts and principles.


## About our conception

![](./UMLs/UML_picture.svg)

### How To

#### Prerequisites

A Linux operating system providing a java compiler, available in M5 building, for instance.

#### Installation

Import our folder from GitLab with :

git clone https://gitlab-etu.fil.univ-lille1.fr/meddahil/meddahi-medengessia-coo-projet.git

#### Create the javadoc
Open a Terminal

```bash
..>cd src
```

```bash
../src>javadoc  `find . -name *.java` -d ../docs
```

The javadoc of our project is now available in the folder docs


#### Compile our code
```bash
..>cd src
```

```bash
../src>javac ./competition/*.java -d ../classes
```

Our codes are now available in the folder classes


#### Run our mains

```bash
..>cd classes
```

```bash
../classes> java competition.TournamentMain
```

```bash
../classes> java competition.LeagueMain
```

```bash
../classes> java competition.MasterStrategy1Main
```

```bash
../classes> java competition.MasterStrategy2Main
```

```bash
../classes> java competition.BookmakerMain
```

```bash
../classes> java competition.JournalistMain
```

#### Compile the tests

```bash
..>cd test
```

```bash
../test> javac ./competition/*.java -classpath ../src;../test;../testJt5.jar
```

```bash
../test> javac ./competition/competitor/*.java -classpath ../src;../test;../testJt5.jar
```

```bash
../test> javac ./competition/observer/*.java -classpath ../src;../test;../testJt5.jar
```

```bash
../test> javac ./competition/organization/*.java -classpath ../src;../test;../testJt5.jar
```

```bash
../test> javac ./competition/organization/masters/*.java -classpath ../src;../test;../testJt5.jar
```

```bash
../test> javac ./competition/organization/masters/strategies/*.java -classpath ../src;../test;../testJt5.jar
```

Please notice that testJt5.jar is a -jar executable containing Junit5 API that you must own on your computer.

#### Run the tests

```bash
..> java -jar testJt5.jar -d test/competition
```

```bash
..> java -jar testJt5.jar -d test/competition/competitor
```

```bash
..> java -jar testJt5.jar -d test/competition/observer
```

```bash
..> java -jar testJt5.jar -d test/competition/organization
```

```bash
..> java -jar testJt5.jar -d test/competition/organization/masters
```

```bash
..> java -jar testJt5.jar -d test/competition/organization/masters/strategies
```

An example of Tournament :

```bash
Lynx vs Raven --> Raven wins!
Drift vs Catalyst --> Catalyst wins!
Midas vs Blastoff --> Midas wins!
Luffy vs Ussop --> Luffy wins!
Raven vs Catalyst --> Raven wins!
Midas vs Luffy --> Luffy wins!
Raven vs Luffy --> Raven wins!
*** Ranking ***
Raven - 3
Luffy - 2
Midas - 1
Catalyst - 1
Blastoff - 0
Ussop - 0
Drift - 0
Lynx - 0
```

An example of League:

```bash
Lynx vs Raven --> Raven wins!
Lynx vs Drift --> Lynx wins!
Lynx vs Catalyst --> Lynx wins!
Lynx vs Midas --> Midas wins!
Lynx vs Blastoff --> Lynx wins!
Raven vs Lynx --> Raven wins!
Raven vs Drift --> Drift wins!
Raven vs Catalyst --> Catalyst wins!
Raven vs Midas --> Midas wins!
Raven vs Blastoff --> Raven wins!
Drift vs Lynx --> Drift wins!
Drift vs Raven --> Raven wins!
Drift vs Catalyst --> Catalyst wins!
Drift vs Midas --> Drift wins!
Drift vs Blastoff --> Drift wins!
Catalyst vs Lynx --> Lynx wins!
Catalyst vs Raven --> Catalyst wins!
Catalyst vs Drift --> Drift wins!
Catalyst vs Midas --> Midas wins!
Catalyst vs Blastoff --> Catalyst wins!
Midas vs Lynx --> Lynx wins!
Midas vs Raven --> Raven wins!
Midas vs Drift --> Midas wins!
Midas vs Catalyst --> Midas wins!
Midas vs Blastoff --> Blastoff wins!
Blastoff vs Lynx --> Lynx wins!
Blastoff vs Raven --> Blastoff wins!
Blastoff vs Drift --> Drift wins!
Blastoff vs Catalyst --> Blastoff wins!
Blastoff vs Midas --> Midas wins!
*** Ranking ***
Drift - 6
Lynx - 6
Midas - 6
Raven - 5
Catalyst - 4
Blastoff - 3
```

An example of Master:

```bash
Lynx vs Raven --> Raven wins!
Lynx vs Nami --> Lynx wins!
Lynx vs Luffy --> Luffy wins!
Raven vs Lynx --> Lynx wins!
Raven vs Nami --> Raven wins!
Raven vs Luffy --> Raven wins!
Nami vs Lynx --> Nami wins!
Nami vs Raven --> Raven wins!
Nami vs Luffy --> Luffy wins!
Luffy vs Lynx --> Lynx wins!
Luffy vs Raven --> Luffy wins!
Luffy vs Nami --> Nami wins!

*** Ranking ***
Raven - 4
Lynx - 3
Luffy - 3
Nami - 2


Midas vs Blastoff --> Midas wins!
Midas vs Mihawk --> Mihawk wins!
Midas vs Law --> Midas wins!
Blastoff vs Midas --> Midas wins!
Blastoff vs Mihawk --> Mihawk wins!
Blastoff vs Law --> Blastoff wins!
Mihawk vs Midas --> Midas wins!
Mihawk vs Blastoff --> Blastoff wins!
Mihawk vs Law --> Mihawk wins!
Law vs Midas --> Law wins!
Law vs Blastoff --> Law wins!
Law vs Mihawk --> Mihawk wins!

*** Ranking ***
Midas - 4
Mihawk - 4
Blastoff - 2
Law - 2


Kid vs Ace --> Ace wins!
Kid vs Dragon --> Dragon wins!
Kid vs Shanks --> Kid wins!
Ace vs Kid --> Ace wins!
Ace vs Dragon --> Ace wins!
Ace vs Shanks --> Ace wins!
Dragon vs Kid --> Kid wins!
Dragon vs Ace --> Ace wins!
Dragon vs Shanks --> Dragon wins!
Shanks vs Kid --> Shanks wins!
Shanks vs Ace --> Shanks wins!
Shanks vs Dragon --> Shanks wins!

*** Ranking ***
Ace - 5
Shanks - 3
Dragon - 2
Kid - 2


Drift vs Catalyst --> Catalyst wins!
Drift vs Zoro --> Zoro wins!
Drift vs Kaido --> Drift wins!
Catalyst vs Drift --> Catalyst wins!
Catalyst vs Zoro --> Zoro wins!
Catalyst vs Kaido --> Kaido wins!
Zoro vs Drift --> Drift wins!
Zoro vs Catalyst --> Catalyst wins!
Zoro vs Kaido --> Zoro wins!
Kaido vs Drift --> Drift wins!
Kaido vs Catalyst --> Catalyst wins!
Kaido vs Zoro --> Kaido wins!

*** Ranking ***
Catalyst - 4
Drift - 3
Zoro - 3
Kaido - 2


Raven vs Midas --> Midas wins!
Ace vs Catalyst --> Catalyst wins!
Midas vs Catalyst --> Midas wins!

*** Ranking ***
Midas - 2
Catalyst - 1
Raven - 0
Ace - 0
```

An example of BookmakertMain:

```bash
Lynx vs Raven --> Raven wins!
Tintin: Les cotes avant le match étaient de Raven : 1.0 et de Lynx : 1.0
Tintin: elles sont désormais de Raven : 0.5 et de Lynx : 2.0

Haddock: Les cotes avant le match étaient de Raven : 1.0 et de Lynx : 1.0
Haddock: elles sont désormais de Raven : 0.5 et de Lynx : 2.0

Lynx vs Drift --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 1.0 et de Lynx : 2.0
Tintin: elles sont désormais de Drift : 0.5 et de Lynx : 4.0

Haddock: Les cotes avant le match étaient de Drift : 1.0 et de Lynx : 2.0
Haddock: elles sont désormais de Drift : 0.5 et de Lynx : 4.0

Lynx vs Catalyst --> Lynx wins!
Tintin: Les cotes avant le match étaient de Lynx : 4.0 et de Catalyst : 1.0
Tintin: elles sont désormais de Lynx : 2.0 et de Catalyst : 2.0

Haddock: Les cotes avant le match étaient de Lynx : 4.0 et de Catalyst : 1.0
Haddock: elles sont désormais de Lynx : 2.0 et de Catalyst : 2.0

Lynx vs Midas --> Midas wins!
Tintin: Les cotes avant le match étaient de Midas : 1.0 et de Lynx : 2.0
Tintin: elles sont désormais de Midas : 0.5 et de Lynx : 4.0

Haddock: Les cotes avant le match étaient de Midas : 1.0 et de Lynx : 2.0
Haddock: elles sont désormais de Midas : 0.5 et de Lynx : 4.0

Lynx vs Blastoff --> Lynx wins!
Tintin: Les cotes avant le match étaient de Lynx : 4.0 et de Blastoff : 1.0
Tintin: elles sont désormais de Lynx : 2.0 et de Blastoff : 2.0

Haddock: Les cotes avant le match étaient de Lynx : 4.0 et de Blastoff : 1.0
Haddock: elles sont désormais de Lynx : 2.0 et de Blastoff : 2.0

Raven vs Lynx --> Raven wins!
Tintin: Les cotes avant le match étaient de Raven : 0.5 et de Lynx : 2.0
Tintin: elles sont désormais de Raven : 0.25 et de Lynx : 4.0

Haddock: Les cotes avant le match étaient de Raven : 0.5 et de Lynx : 2.0
Haddock: elles sont désormais de Raven : 0.25 et de Lynx : 4.0

Raven vs Drift --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 0.5 et de Raven : 0.25
Tintin: elles sont désormais de Drift : 0.25 et de Raven : 0.5

Haddock: Les cotes avant le match étaient de Drift : 0.5 et de Raven : 0.25
Haddock: elles sont désormais de Drift : 0.25 et de Raven : 0.5

Raven vs Catalyst --> Catalyst wins!
Tintin: Les cotes avant le match étaient de Catalyst : 2.0 et de Raven : 0.5
Tintin: elles sont désormais de Catalyst : 1.0 et de Raven : 1.0

Haddock: Les cotes avant le match étaient de Catalyst : 2.0 et de Raven : 0.5
Haddock: elles sont désormais de Catalyst : 1.0 et de Raven : 1.0

Raven vs Midas --> Raven wins!
Tintin: Les cotes avant le match étaient de Raven : 1.0 et de Midas : 0.5
Tintin: elles sont désormais de Raven : 0.5 et de Midas : 1.0

Haddock: Les cotes avant le match étaient de Raven : 1.0 et de Midas : 0.5
Haddock: elles sont désormais de Raven : 0.5 et de Midas : 1.0

Raven vs Blastoff --> Blastoff wins!
Tintin: Les cotes avant le match étaient de Blastoff : 2.0 et de Raven : 0.5
Tintin: elles sont désormais de Blastoff : 1.0 et de Raven : 1.0

Haddock: Les cotes avant le match étaient de Blastoff : 2.0 et de Raven : 0.5
Haddock: elles sont désormais de Blastoff : 1.0 et de Raven : 1.0

Drift vs Lynx --> Lynx wins!
Tintin: Les cotes avant le match étaient de Lynx : 4.0 et de Drift : 0.25
Tintin: elles sont désormais de Lynx : 2.0 et de Drift : 0.5

Haddock: Les cotes avant le match étaient de Lynx : 4.0 et de Drift : 0.25
Haddock: elles sont désormais de Lynx : 2.0 et de Drift : 0.5

Drift vs Raven --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 0.5 et de Raven : 1.0
Tintin: elles sont désormais de Drift : 0.25 et de Raven : 2.0

Haddock: Les cotes avant le match étaient de Drift : 0.5 et de Raven : 1.0
Haddock: elles sont désormais de Drift : 0.25 et de Raven : 2.0

Drift vs Catalyst --> Catalyst wins!
Tintin: Les cotes avant le match étaient de Catalyst : 1.0 et de Drift : 0.25
Tintin: elles sont désormais de Catalyst : 0.5 et de Drift : 0.5

Haddock: Les cotes avant le match étaient de Catalyst : 1.0 et de Drift : 0.25
Haddock: elles sont désormais de Catalyst : 0.5 et de Drift : 0.5

Drift vs Midas --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 0.5 et de Midas : 1.0
Tintin: elles sont désormais de Drift : 0.25 et de Midas : 2.0

Haddock: Les cotes avant le match étaient de Drift : 0.5 et de Midas : 1.0
Haddock: elles sont désormais de Drift : 0.25 et de Midas : 2.0

Drift vs Blastoff --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 0.25 et de Blastoff : 1.0
Tintin: elles sont désormais de Drift : 0.125 et de Blastoff : 2.0

Haddock: Les cotes avant le match étaient de Drift : 0.25 et de Blastoff : 1.0
Haddock: elles sont désormais de Drift : 0.125 et de Blastoff : 2.0

Catalyst vs Lynx --> Lynx wins!
Tintin: Les cotes avant le match étaient de Lynx : 2.0 et de Catalyst : 0.5
Tintin: elles sont désormais de Lynx : 1.0 et de Catalyst : 1.0

Haddock: Les cotes avant le match étaient de Lynx : 2.0 et de Catalyst : 0.5
Haddock: elles sont désormais de Lynx : 1.0 et de Catalyst : 1.0

Catalyst vs Raven --> Raven wins!
Tintin: Les cotes avant le match étaient de Raven : 2.0 et de Catalyst : 1.0
Tintin: elles sont désormais de Raven : 1.0 et de Catalyst : 2.0

Haddock: Les cotes avant le match étaient de Raven : 2.0 et de Catalyst : 1.0
Haddock: elles sont désormais de Raven : 1.0 et de Catalyst : 2.0

Catalyst vs Drift --> Catalyst wins!
Tintin: Les cotes avant le match étaient de Catalyst : 2.0 et de Drift : 0.125
Tintin: elles sont désormais de Catalyst : 1.0 et de Drift : 0.25

Haddock: Les cotes avant le match étaient de Catalyst : 2.0 et de Drift : 0.125
Haddock: elles sont désormais de Catalyst : 1.0 et de Drift : 0.25

Catalyst vs Midas --> Midas wins!
Tintin: Les cotes avant le match étaient de Midas : 2.0 et de Catalyst : 1.0
Tintin: elles sont désormais de Midas : 1.0 et de Catalyst : 2.0

Haddock: Les cotes avant le match étaient de Midas : 2.0 et de Catalyst : 1.0
Haddock: elles sont désormais de Midas : 1.0 et de Catalyst : 2.0

Catalyst vs Blastoff --> Blastoff wins!
Tintin: Les cotes avant le match étaient de Blastoff : 2.0 et de Catalyst : 2.0
Tintin: elles sont désormais de Blastoff : 1.0 et de Catalyst : 4.0

Haddock: Les cotes avant le match étaient de Blastoff : 2.0 et de Catalyst : 2.0
Haddock: elles sont désormais de Blastoff : 1.0 et de Catalyst : 4.0

Midas vs Lynx --> Midas wins!
Tintin: Les cotes avant le match étaient de Midas : 1.0 et de Lynx : 1.0
Tintin: elles sont désormais de Midas : 0.5 et de Lynx : 2.0

Haddock: Les cotes avant le match étaient de Midas : 1.0 et de Lynx : 1.0
Haddock: elles sont désormais de Midas : 0.5 et de Lynx : 2.0

Midas vs Raven --> Midas wins!
Tintin: Les cotes avant le match étaient de Midas : 0.5 et de Raven : 1.0
Tintin: elles sont désormais de Midas : 0.25 et de Raven : 2.0

Haddock: Les cotes avant le match étaient de Midas : 0.5 et de Raven : 1.0
Haddock: elles sont désormais de Midas : 0.25 et de Raven : 2.0

Midas vs Drift --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 0.25 et de Midas : 0.25
Tintin: elles sont désormais de Drift : 0.125 et de Midas : 0.5

Haddock: Les cotes avant le match étaient de Drift : 0.25 et de Midas : 0.25
Haddock: elles sont désormais de Drift : 0.125 et de Midas : 0.5

Midas vs Catalyst --> Catalyst wins!
Tintin: Les cotes avant le match étaient de Catalyst : 4.0 et de Midas : 0.5
Tintin: elles sont désormais de Catalyst : 2.0 et de Midas : 1.0

Haddock: Les cotes avant le match étaient de Catalyst : 4.0 et de Midas : 0.5
Haddock: elles sont désormais de Catalyst : 2.0 et de Midas : 1.0

Midas vs Blastoff --> Midas wins!
Tintin: Les cotes avant le match étaient de Midas : 1.0 et de Blastoff : 1.0
Tintin: elles sont désormais de Midas : 0.5 et de Blastoff : 2.0

Haddock: Les cotes avant le match étaient de Midas : 1.0 et de Blastoff : 1.0
Haddock: elles sont désormais de Midas : 0.5 et de Blastoff : 2.0

Blastoff vs Lynx --> Lynx wins!
Tintin: Les cotes avant le match étaient de Lynx : 2.0 et de Blastoff : 2.0
Tintin: elles sont désormais de Lynx : 1.0 et de Blastoff : 4.0

Haddock: Les cotes avant le match étaient de Lynx : 2.0 et de Blastoff : 2.0
Haddock: elles sont désormais de Lynx : 1.0 et de Blastoff : 4.0

Blastoff vs Raven --> Blastoff wins!
Tintin: Les cotes avant le match étaient de Blastoff : 4.0 et de Raven : 2.0
Tintin: elles sont désormais de Blastoff : 2.0 et de Raven : 4.0

Haddock: Les cotes avant le match étaient de Blastoff : 4.0 et de Raven : 2.0
Haddock: elles sont désormais de Blastoff : 2.0 et de Raven : 4.0

Blastoff vs Drift --> Drift wins!
Tintin: Les cotes avant le match étaient de Drift : 0.125 et de Blastoff : 2.0
Tintin: elles sont désormais de Drift : 0.0625 et de Blastoff : 4.0

Haddock: Les cotes avant le match étaient de Drift : 0.125 et de Blastoff : 2.0
Haddock: elles sont désormais de Drift : 0.0625 et de Blastoff : 4.0

Blastoff vs Catalyst --> Blastoff wins!
Tintin: Les cotes avant le match étaient de Blastoff : 4.0 et de Catalyst : 2.0
Tintin: elles sont désormais de Blastoff : 2.0 et de Catalyst : 4.0

Haddock: Les cotes avant le match étaient de Blastoff : 4.0 et de Catalyst : 2.0
Haddock: elles sont désormais de Blastoff : 2.0 et de Catalyst : 4.0

Blastoff vs Midas --> Midas wins!
Tintin: Les cotes avant le match étaient de Midas : 0.5 et de Blastoff : 2.0
Tintin: elles sont désormais de Midas : 0.25 et de Blastoff : 4.0

Haddock: Les cotes avant le match étaient de Midas : 0.5 et de Blastoff : 2.0
Haddock: elles sont désormais de Midas : 0.25 et de Blastoff : 4.0
```

An example of JournalistMain:

```bash
Lynx vs Raven --> Lynx wins!
TF1: Lynx a gagné contre Raven

France2: Lynx a gagné contre Raven

Lynx vs Drift --> Drift wins!
TF1: Drift a gagné contre Lynx

France2: Drift a gagné contre Lynx

Lynx vs Catalyst --> Lynx wins!
TF1: Lynx a gagné contre Catalyst

France2: Lynx a gagné contre Catalyst

Lynx vs Midas --> Lynx wins!
TF1: Lynx a gagné contre Midas

France2: Lynx a gagné contre Midas

Lynx vs Blastoff --> Lynx wins!
TF1: Lynx a gagné contre Blastoff

France2: Lynx a gagné contre Blastoff

Raven vs Lynx --> Lynx wins!
TF1: Lynx a gagné contre Raven

France2: Lynx a gagné contre Raven

Raven vs Drift --> Raven wins!
TF1: Raven a gagné contre Drift

France2: Raven a gagné contre Drift

Raven vs Catalyst --> Raven wins!
TF1: Raven a gagné contre Catalyst

France2: Raven a gagné contre Catalyst

Raven vs Midas --> Midas wins!
TF1: Midas a gagné contre Raven

France2: Midas a gagné contre Raven

Raven vs Blastoff --> Raven wins!
TF1: Raven a gagné contre Blastoff

France2: Raven a gagné contre Blastoff

Drift vs Lynx --> Drift wins!
TF1: Drift a gagné contre Lynx

France2: Drift a gagné contre Lynx

Drift vs Raven --> Raven wins!
TF1: Raven a gagné contre Drift

France2: Raven a gagné contre Drift

Drift vs Catalyst --> Drift wins!
TF1: Drift a gagné contre Catalyst

France2: Drift a gagné contre Catalyst

Drift vs Midas --> Midas wins!
TF1: Midas a gagné contre Drift

France2: Midas a gagné contre Drift

Drift vs Blastoff --> Blastoff wins!
TF1: Blastoff a gagné contre Drift

France2: Blastoff a gagné contre Drift

Catalyst vs Lynx --> Catalyst wins!
TF1: Catalyst a gagné contre Lynx

France2: Catalyst a gagné contre Lynx

Catalyst vs Raven --> Catalyst wins!
TF1: Catalyst a gagné contre Raven

France2: Catalyst a gagné contre Raven

Catalyst vs Drift --> Drift wins!
TF1: Drift a gagné contre Catalyst

France2: Drift a gagné contre Catalyst

Catalyst vs Midas --> Catalyst wins!
TF1: Catalyst a gagné contre Midas

France2: Catalyst a gagné contre Midas

Catalyst vs Blastoff --> Catalyst wins!
TF1: Catalyst a gagné contre Blastoff

France2: Catalyst a gagné contre Blastoff

Midas vs Lynx --> Lynx wins!
TF1: Lynx a gagné contre Midas

France2: Lynx a gagné contre Midas

Midas vs Raven --> Raven wins!
TF1: Raven a gagné contre Midas

France2: Raven a gagné contre Midas

Midas vs Drift --> Midas wins!
TF1: Midas a gagné contre Drift

France2: Midas a gagné contre Drift

Midas vs Catalyst --> Catalyst wins!
TF1: Catalyst a gagné contre Midas

France2: Catalyst a gagné contre Midas

Midas vs Blastoff --> Blastoff wins!
TF1: Blastoff a gagné contre Midas

France2: Blastoff a gagné contre Midas

Blastoff vs Lynx --> Lynx wins!
TF1: Lynx a gagné contre Blastoff

France2: Lynx a gagné contre Blastoff

Blastoff vs Raven --> Blastoff wins!
TF1: Blastoff a gagné contre Raven

France2: Blastoff a gagné contre Raven

Blastoff vs Drift --> Blastoff wins!
TF1: Blastoff a gagné contre Drift

France2: Blastoff a gagné contre Drift

Blastoff vs Catalyst --> Blastoff wins!
TF1: Blastoff a gagné contre Catalyst

France2: Blastoff a gagné contre Catalyst

Blastoff vs Midas --> Midas wins!
TF1: Midas a gagné contre Blastoff

France2: Midas a gagné contre Blastoff
```

### Current work

ALL work is done


### Distinguished elements

#### About Code
Our goal was to respect different principles also known as "SOLID":

-Single Responsibility Principle : One functionality by method, and one class by idea

-Open-Closed Principle : Our code is opened to extensions but closed to modifications. it's possible to add competitions or matches, without changing Competition or Match.

-Liskov Substitution Principle : A tree structure is used to represent our code

-Interface Segregation Principle : Not yet used

-Dependency Inversion Principle : We use as much as possible mother classes when we use a class only depending on its type.

In order to use what has already been done by others, we have tried to use design Patterns. For example, we have used Behavioral Patterns with Strategy.

##### About our classes

###### First deliverable
We worked on our classes with the purpose of conceiving an efficient code based on a good structure and organization so that it could be readable for everyone.

For instance, we coded the Competitor class with simple instructions, getters and an equality test which were a good basis to define Competitor’s instances that would be easily manipulated.

Furthermore, we simplify the concept of matches by defining several possible sorts of matches implementing a common type via the interface Match, whose implementation RandomMatch.class is actually doing.

Then, we worked on the conception of the competition’s classes. We first wanted to make our code extendable, and not mutable (Open-Closed Principle). Therefore, we went for an abstract class Competition which would stand as a pattern containing direction lines in order to code the different functionalities of a competition : a list of competitors, a type of match to play with, a ranking for knowing the advancement of the competition and a way of organizing the matches (the abstract method play(List<Competitor>)). This is why different new types of competitions such as Tournament and League extend the Competitor.class and define their organization on matches of competitors’ pairs (Tournament.class) or on matches home and back between competitors (League.class).

To conclude, there are also classes that help us control certain cases like a non-valid number of competitors for the tournament format (whose number should be a power of two). That’s the role of the NotAPowerOfTwoNumberOfCompetitorsException.class. This exception extends RuntimeException, because it does not follow the logic of the project to play without a power of two number of competitors. There’s finally the StdDisplayer.class which displays the messages we want to have without requiring any system.out.println() in our classes (Single Responsibility Principle).

###### Second deliverable
Still with same ideas than first deliverable, we have worked on an efficient code.

This deliverable consisted of a new type of competition, named Master, which uses both League and Tournament, and plays a competition in two phases. The first, by using a strategy, splits all competitors into group stages and plays all group stages as a League. After group stages, it selects competitors from all groups by using a strategy and plays the final phase as a Tournament.Our Master's class is built with two parameters, a list of competitors and a strategy.

We easily recognized a Behavioral pattern, Strategy. Our Strategy class is coded by using an Interface to allow strategies to be easily created by everyone, and to be effectively used in Master's class. Only two methods were necessary. The first to split a group of competitors in several groups. The second to select finalists from a group of competitors.

###### Third deliverable
The last update of our deliverable to be implemented was adding a new sort of instances, the observers, who are meant to be able to register and follow a competition then broadcast the results of each match they watch.

As well as in the previous deliverables, we were particularly focussing on suggesting a relevant code which could meet the expectations of the subject. Therefore, the idea to implement was to define a common type of observers, for instance, bookmakers and journalists, as suggested in the subject, which had to be an interface describing the same action (broadcasting a result), but differently done by the observers.

Considering all of this, we gave a Map to the Bookmaker instances as an attribute, which would contain a list of competitors attending the competition, associated to their odds. Then, a Bookmaker instance just displays a corresponding message using the StdDisplayer class. The same goes for the Journalist instances, but without having a Map to manage.

Finally, the last thing to deal with was to update the Competition class by adding a list of observers as a new private attribute, methods to add or remove an observer from that list (register and unregister methods), and a method to apply the behaviour of each observer (broadcasting a message). The last thing to integrate would have been to modify the playMatch method in order to let observers display their information once a match has been played.

#### About tests

##### First deliverable
Three things are tested in our first deliverable:

1) CompetitionTest :

To test competition, which is an abstract class, we have used two 'Mock'.
The reason is that Competition needs a type of Match to be played, and a way to play those matches.
The first Mock is MockMatch and always returns the same winner.
The other one, MockCompetition, plays the competition as a league. This Mock is also used to check if we use correctly the methods to play the competition (when play() is called, we verify that play(List<Competitor>) and playMatch(Competitor , Competitor) are called).
That test tries all methods used to run properly a competition such as :

- A competition is well defined (right number of competitors , good type of match used)
- The winner is correctly defined at the end of the competition
- The rank is well defined at the end of the competition
- The competition is correctly played
- The competition is properly played
- Methods play(List<Competitor>) and playMatch() are well called and used when we use play()

2) TournamentTest

In that one, we just test that we can't run the Tournament without a power of two number of competitors.

3) CompetitorTest

The last one, CompetitorTest tests:
- The competitor is well defined
- Points are properly added with add() method
- Equals of two competitors is well defined

##### Second deliverable

4) StrategyTest

In order to test our interface Strategy.class, we create an abstract class Test to test both methods splitInGroupStage and selectWinners.
For this test, 3 methods have been created  :
- testSplitInGroupsStageWhenOk, which tries that when we use the good number of competitors, the strategy worked well. Which means that all competitors are well widespread into groups
- testSplitInGroupsStageWhenNotOk, which tries that without the good number of competitors, an Exception is thrown.
- testselectWinners, which tries that finalists are well selected.

Because it's an abstract class, you need to extend it if you want to use it. For example, it's done with Strategy1Test and Strategy2Test. Those two classes are defined with 6 methods :
- createStrategy() which returns a new Strategy()
- nb_of_comp() which returns the number of competitors per group
- nb_of_group() which returns the number of groups
- nb_of_fin() which returns the number of finalists selected
- good_nb_of_comp() which returns a list with enough competitors to be splitted by the strategy
- wrong_nb_of_comp() which returns a list without enough competitors to be splitted by the strategy

5) MasterTest

Our master class is not tested in herself. Master works in five steps which are already tested :
1) Split competitors into groups (tested in StrategyTest.java)
2) Play all groups as a League (tested in LeagueTest.java and CompetitionTest.java)
3) Select finalists (tested in StrategyTest.java)
4) Reset points of all finalists (tested in CompetitorTest.java)
5) Play the final as a Tournament (tested in TournamentTest.java and CompetitionTest.java)

Moreover, Master.java extends Competition.java which is already tested in CompetitionTest.java.

##### Third deliverable

6) MatchObserverTest

In herself, MatchObserver class cannot be tested due to her type, wich is interface. But, a mock was created. This mock can :
- stock competitors (add and remove a competitor)
- affect a double to each competitor
- return competitors stocked
- increment or decrement by 1 the double associated to each competitor
- react to the result of a match (by incremented winner's double and decremented loser's double)

Then, with this mock, we can test our MatchObserver (MatchObserverTest.java class):
- competitors are well added, tested with observerCorrectlyAdded()
- the expected reaction is well done, tested with reactionCorrectlyApplied()

7) CompetitionTest

Now our competition can broadcast match results, we have to test this feature. In order to test this, we have added 3 tests in CompetitionTest.java :
- register a match observer is well defined, with observerIsWellAdded()
- unregister a match observer is well defined, with observerIsWellRemoved()
- match results are well broadcasted, with matchResultsAreWellSpreaded(). This test tries that informations are well broadcasted to observers. In practice, we try that winner's double is increment by 1.0, loser's double is decremented by 1.0, so the absolute difference is 2.0 (They both started with the value 1.0). 

### Depository tree

```bash
├── README.md
├── UMLs
|   ├── Competition_UML.mdj
|   ├── UML_picture.svg
├── test
|   ├── competition
|   |   ├── CompetitionTest.java
|   |   ├── MockCompetition.java
|   |   ├── Competitor
|   |   |   ├── CompetitorTest.java
|   |   ├── match
|   |   |   ├── MockMatch.java
|   |   ├── observer
|   |   |   ├── ObserverTest.java
|   |   |   ├── util
|   |   |   |   ├── MockMatchObserver.java
|   |   ├── organization
|   |   |   ├── TournamentTest.java
|   |   |   ├── Master
|   |   |   |   ├── StrategyTest.java
|   |   |   |   |   ├── Strategies
|   |   |   |   |   |   ├── Strategy1Test.java
|   |   |   |   |   |   ├── Strategy2Test.java
├── src
|   ├── competition
|   |   ├── Competition.java
|   |   ├── LeagueMain.java
|   |   ├── StdDisplayer.java
|   |   ├── TournamentMain.java
|   |   ├── organization
|   |   |   ├── League.java
|   |   |   ├── Tournament.java
|   |   |   ├── MapUtil.java
|   |   |   ├── NotPowerOfTwoNumberOfCompetitorsException.java
|   |   |   ├── masters
|   |   |   |   ├── Master.java
|   |   |   |   ├── Strategy.java
|   |   |   |   ├── NotGoodNumberOfPlayersException.java
|   |   |   |   ├── strategies
|   |   |   |   |   ├── Strategy1.java
|   |   |   |   |   ├── Strategy2.java
|   |   ├── observer
|   |   |   ├── MatchObserver.java
|   |   |   ├── util
|   |   |   |   ├── Bookmaker.java
|   |   |   |   ├── Journalist.java
|   |   ├── competitor
|   |   |   ├── Competitor.java
|   |   ├── match
|   |   |   ├── Match.java
|   |   |   ├── util
|   |   |   |   ├── RandomMatch.java
```
