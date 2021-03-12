package com.example.demo.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration // Executes during setup
public class ProjectConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProjectRepository repository) {
        return args -> {
            /* Template */
            /* Project var_name = new Project(
                    1L, // Long Id
                    "Java Store", // Project Name
                    "Temp Desc", // Description
                    "Temp Tech", // Technologies
                    "Image Link", // URL to image
                    "Git Link", // URL to link
                    false // Is the image bright
            ); */

            Project javaStore = new Project(
                    "Java Store",
                    "An desktop application that serves as an\n" +
                            "example of an Electronic Store that\n" +
                            "allows customers to add products to cart,\n" +
                            "remove products, as well as purchase products\n" +
                            "while keeping track of inventory, number of sales,\n" +
                            "revenue, as well as the most popular items sold.\n",
                    "Java, JavaFX, Model-View-Controller",
                    "static/Store.png",
                    "https://github.com/ArkkanElkhatib/JavaFX-Store",
                    false
            );

            Project javaPortfolio = new Project(
                    "Java Spring Portfolio",
                    "A web application that serves as\n" +
                            "my personal portfolio. Uses a Java Spring\n" +
                            "backend to serve web pages that are generated\n" +
                            "by the Thymeleaf templating engine. Thymeleaf utilizes\n" +
                            "Java classes that are stored within a PostgreSQL database\n" +
                            "maintained by Hibernate, Java Spring PostgreSQL, and JPA.\n" +
                            "The Java Spring portfolio also utilizes the Java Spring Email\n" +
                            "API in order send personal emails to allow visitors to seamlessly\n" +
                            "contact me. Core concepts of HTML, CSS, and JavaScript are also utilized.",
                    "Java, Java Spring, PostgreSQL, Java Mail Sender, Java JPA, Thymeleaf Templating Engine, HTML/CSS/JavaScript",
                    "static/JavaWebsite.png",
                    "https://github.com/",
                    false
            );

            Project arkDB = new Project(
                    "Mock Movie Database",
                    "A web application that resembles the functionality\n" +
                            "of iMDB. Utilizes a Node.js backend in order to serve web pages\n" +
                            "that are generated using the Nunjucks templating engine. Objects that are" +
                            "stored consist of Movie data, Actor data, as well as User data.\n" +
                            "All data is stored with a MongoDB database created utilizing a JavaScript initialization\n" +
                            "script that allows for quick and efficient access as well as portability.\n" +
                            "CRUD API concepts are demonstrated to allow new accounts to be created, movie data to be\n" +
                            "updated, reviews to be added and deleted. Authentication is required for the majority\n" +
                            "of these functionality.",
                    "JavaScript, Node.js, Nunjucks Templating Engine, MongoDB, CRUD API, HTML/CSS",
                    "static/ArkDB.png",
                    "https://github.com/ArkkanElkhatib/Web-MovieDatabase",
                    true
            );

            Project pyronaScraper = new Project(
                    "PyCorona Scraper",
                    "A command line tool that displays accurate data\n" +
                            "regarding Corona stats in countries. The command line tool\n" +
                            "accepts user input regarding the country the wish to inquire\n" +
                            "and utilizes that information to effectively parser the World\n" +
                            "Health Organization's website to gather information and output\n" +
                            "the formatted data to the terminal.",
                    "Python, Web Parsing",
                    "static/Py-rona.png",
                    "https://github.com/ArkkanElkhatib/Python-CoronaParser",
                    true
            );

            Project pythonBalls = new Project(
                    "Python Balls",
                    "A desktop application that demonstrates physic\n" +
                            "concepts within programming by utilizing the Python Pygame\n" +
                            "framework to create a graphical user interface that displays\n" +
                            "objects bouncing around the window. This game shows event handling\n" +
                            "handling, working with event loops, as well as tranforming real world\n" +
                            "concepts into a program.",
                    "Python, PyGame, Event Handling",
                    "static/PyBalls.PNG",
                    "https://github.com/ArkkanElkhatib/Python-BouncyBalls",
                    true
            );

            Project reactPortfolio = new Project(
                    "React Portfolio",
                    "A (now retired) single page web application that serves\n" +
                            "as my personal portfolio to showcase my personal\n" +
                            "programming projects that utilized the React.js frontend" +
                            "framework. Demonstrated core concepts of React.js including\n" +
                            "components, styling, state management, as well as React Routing.",
                    "JavaScript, React.js, JSX, HTML/CSS",
                    "static/Portfolio2.png",
                    "https://github.com/ArkkanElkhatib/React-Portfolio",
                    true
            );

            repository.saveAll(List.of(javaStore, javaPortfolio, arkDB,
                    pyronaScraper, pythonBalls, reactPortfolio));
        };
    }
}
