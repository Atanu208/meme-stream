Meme Stream API
Sure. In this project, I built a Meme Stream API using Spring Boot.
It allows users to upload memes by providing their name, a caption, and a meme image URL. Users can also fetch the latest 100 memes or retrieve a specific meme using its ID.
I implemented proper validation to ensure that name, caption, and URL are not empty, and also added logic to detect and prevent duplicate memes.
For the database, I used MongoDB along with Spring Data MongoDB to store and fetch meme data efficiently.
I also implemented global exception handling to return meaningful error messages like 'Meme not found' or 'Duplicate meme', using custom exceptions.
To make the API easy to understand and test, I integrated Swagger using Springdoc OpenAPI. This provides interactive API documentation.
For testing, I wrote JUnit test cases using Mockito to cover different scenarios like successful meme creation, handling duplicates, and fetching memes by ID. This ensured the core functionalities were tested and reliable.
Overall, this project helped me improve my skills in Spring Boot REST API development, MongoDB integration, validation, exception handling, API documentation, a
