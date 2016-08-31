# Demand Signals Code Interview 

## Welcome! 
Welcome to the ds code interview Java portion; built in this project is a relatively
simple Guice/RestEasy application that runs as a REST service. Follow the instructions
below to run and please answer the questions in this file for submission. Application
is backed by a simple Sqlite database with default data created in the setup method of
SqlLiteDatabase.class.

## Getting started / Submission
Fork this repo on github and submit your repo fork as the turn in. If new steps in the building 
is required please be sure to document any changes to run.

## Folder Structure 

Folder | Description 
 ------ | ------- 
com.ds.interview | Application level classes 
com.ds.interview.controller | Web controllers
com.ds.interview.dao | Data access classes
com.ds.interview.model | Domain model classes

## Database 
When the app is started, a sqlite database file will be created on the repo. This is not to be committed
in the project turn in.

## To build
``` ./gradlew assemble war ```

## To Run 
``` ./gradlew tomcatStart ```

Open localhost:8081 in a browser to see the default page. Users can be seen under localhost:8081/users

For debug you can run (defaults to port 5005)
``` ./gradlew tomcatStartDebug ```

## Stories To Do

1. As a developer, I want to be able to create users, update users, get users by id and delete users by id so
that I can manage users by a UI.

2. As a developer, I want to be able to create companies, update companies, and get companies by id, and delete companies 
via a web service so that I can manager companies by a UI.

3. As a developer, I want to be able to assign a user to a company via users endpoint so I can see what company 
a user works for in the UI.

4. As a developer, I want to be able to see what company a user works for when I get that user so I can display in a UI.

5. As a developer, I want to be able to see the users for a company so that I can display in a UI.

**BONUS** Introduce your own flavor to the code. Add new libraries, play, do what you want, just complete the stories. 

