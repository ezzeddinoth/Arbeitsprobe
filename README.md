# Arbeitsprobe

This is a sample-project and is not complete.
The project implements person-product ManyToMany-Relationship, the Relation is implemented with the Object Order (Table ORDER_). 
Table Login is used to define user Rolle, it could be also embedded in Table Person.

The project use H2 in memory Database, Model is re-initialized with each run. There is SQL-File to populate the Data.

Model: Create Objects and relates them to the Table in Database.
Repository: extends the CrudRepository, offer basics CRUD-Operations.
Service: further data manipulation.
Controller: takes data from Service and offer them as REST-API.
DTO: just for Order, improve and adjust the Order-Object.
CI/CD not implemented.

To run the project clone it then => Maven build goal: spring-boot:run.
You can open the URLs to see the REST-APIs or use "react-project" which consumes some of them.
