# ramen-noodle-takeout-API
## Project Concept:

This app represents a fast food online reservation system which allows a user to create a ramen noodle bowl to-go order, and view their order via HTTP requests. After creating an order, a user can retrieve their order (by an id order number), update, and delete their order.  On the back-end, this app allows for full CRUD functionality and user information is stored in a PostgreSQL database facilitated by PGAdmin.  

Ultimately I was able to achieve this project through a variety of outside tools: using Word document to track my goals and progress, creating an ERD, and making multiple commits via Git Bash to keep track of recent changes to my project.

## Entity Relationship Diagram (ERD)

## POM Dependencies

![image](https://user-images.githubusercontent.com/94870846/152493122-c6563368-462a-4bfa-aff1-8517cff00ab5.png)![image](https://user-images.githubusercontent.com/94870846/152492518-c14b4795-4e6c-427c-9920-a14c270468e5.png)

## Technologies and Tools Used

![image](https://user-images.githubusercontent.com/94870846/152493640-cd82f4c2-7a41-4007-9799-7237cdcf60cb.png)
IntelliJ~
Java~
Spring Boot~
Angular~
PostGreSQL~
Postman~
GitBash~


## User Stories

![image](https://user-images.githubusercontent.com/94870846/152494729-699a44be-502e-4648-88b4-107e2e80002e.png)

•	As a user I can create a new ramen noodle bowl order. <br />
•	As a user I can search for my order by order Id to ensure I’m referencing the correct to-go order.  <br />
•	As a user I can retrieve and view all of my orders when I have ordered multiple times.  <br />
•	As a user I can update/modify my order if I change my mind about anything associated with my order.  <br />
•	As a user I can cancel my order if I decide I don't want to order a ramnen bowl.  <br />

## Challenges

![image](https://user-images.githubusercontent.com/94870846/152495215-90a3a232-2105-42fd-9a70-9d169a3ca08e.png)

1.)	 One challenge I had was making sure that my methods in my Reservation Service class matched the method names and parameters set up in my interface class (Reservation Repository). 
<br />
2.)	Another challenge was making sure to focus on separation of concerns.  For example, I had to create different classes for my services and different classes for my repositories.  In this way, each model has their own package and set of classes and the coding/logic doesn’t get jumbled up or confused. <br />

3.)	 I had to remember that the JWT token is established after a user has logged-in with their password and username (not when the user has signed up) in order to authenticate and protect the client/server exchange. <br />

4.)	 Last, I had to remember the importance of adding JSON “write only” Access to my user table in order to not return the password in Postman after the user has registered with email, username, and password. <br />
