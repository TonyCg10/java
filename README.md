Java Study and Anime Project
Overview
This repository contains a collection of Java study projects along with a specific Anime Searcher project. The goal of the repository is to provide examples of using Java in various contexts, including console-based applications, handling data parsing, and using external libraries to create a dynamic anime search application.

Projects Included
Java Studies
This section contains a variety of Java practice codes covering:

Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, and encapsulation.
Basic and advanced Java programming concepts like collections, multithreading, file handling, and more.
Code snippets and small programs to demonstrate the fundamental aspects of the Java language.
Anime Searcher Project
This is an application that allows users to search for anime based on various criteria. The project uses a JSON database of anime and enables searching by:

Title
Type (e.g., TV, Movie, OVA, etc.)
Status (e.g., Finished, Ongoing)
Season (e.g., Fall, Winter, etc.)
Year
Tags (e.g., Action, Adventure, etc.)
Random selection of an anime
The application provides a command-line interface (CLI) where users can enter commands to search for anime based on these criteria.

Project Structure
The repository is organized into two main sections:

Java Studies
This folder contains Java code examples and exercises for:

Understanding Java syntax
Exploring OOP principles
Working with libraries like Collections, Stream API, and File I/O
Anime Searcher
This folder contains the Anime Searcher application, which includes:

JsonLoader: A utility class for loading anime data from a JSON file.
Library: A class that stores and manages anime data.
Anime: A class representing an individual anime with attributes like title, type, status, and more.
Search: The main class where the command-line interface for searching anime is implemented.
How to Run the Anime Searcher
Clone the repository to your local machine.

bash
Copiar código
git clone <repository_url>
Install dependencies (if necessary):

Make sure you have Java 11 or later installed on your machine.
Use your favorite IDE (e.g., IntelliJ IDEA, Eclipse) to open the project.
Run the Anime Searcher:

Navigate to the Search.java file.
Run the program to start the command-line interface for searching anime.
Commands: The following commands are available for the user to search for anime:

title: Search for anime by title.
criteria: Search for anime by various criteria such as type, status, season, year, tags.
random: Display a random anime from the database.
exit: Exit the application.
Example Usage
Searching by Title
plaintext
Copiar código
Menu para buscar anime por titulo o por una serie de criterios
---------------------------------------------------------------
----Introduzca un comando - Use a command:
*title - titles
*criteria
*random
----
Title: Naruto
Type: TV
Status: FINISHED
Episodes: 220
Year: 2002
Season: FALL
Tags: [Action, Adventure, Ninja, Shounen]
Searching by Criteria
plaintext
Copiar código
Realiza una busqueda ingresando los criterios deseado
----------------------------------------------------
Ingrese un criterio (type, status, season, year, tags, limit) o 'search' para buscar:
type MOVIE
season FALL
limit 5
search
Contributions
Feel free to fork this repository and submit pull requests. Any improvements or suggestions are welcome!

License
This repository is licensed under the MIT License. See the LICENSE file for more details.

