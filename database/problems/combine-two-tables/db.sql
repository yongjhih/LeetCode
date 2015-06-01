PRAGMA foreign_keys=ON;
CREATE TABLE Person (PersonId INTEGER PRIMARY KEY AUTOINCREMENT, FirstName TEXT, LastName TEXT);
CREATE TABLE Address (AddressId INTEGER PRIMARY KEY AUTOINCREMENT, PersonId INTEGER, City TEXT, State TEXT, FOREIGN KEY(PersonId) REFERENCES Person(PersonId));
