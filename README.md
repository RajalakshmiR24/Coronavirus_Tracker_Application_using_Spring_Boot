# Coronavirus_Tracker_Application_using_Spring_Boot
This is a simple Coronavirus Tracker Application built using Spring Boot. The application fetches live data about COVID-19 cases from an external API and provides real-time information about the number of confirmed cases, recovered cases, and deaths worldwide as well as for specific countries.

## Features

- Display global COVID-19 statistics including total cases, recovered cases, and deaths.
- View COVID-19 statistics for specific countries.
- Interactive charts to visualize the data.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf (for server-side rendering)
- Bootstrap (for styling)
- Chart.js (for data visualization)
- RestTemplate (for making HTTP requests)

## Getting Started

To run this application locally, follow these steps:

1. Clone the repository:

   ```shell
   https://github.com/RajalakshmiR24/Coronavirus_Tracker_Application_using_Spring_Boot.git

2. Change directory to the project folder:

     ```shell
     cd coronavirus-tracker
     
3. Build the project using Maven:
  
    ```shell
    mvn clean install
    
4. Run the application:

    ```shell
    mvn spring-boot:run
    
5. Open your web browser and visit http://localhost:8080 to access the application.

## Configuration
The application uses an external API to fetch COVID-19 data. The API endpoint URL can be configured in the application.properties file located in the src/main/resources directory. Modify the api.url property to specify the desired API endpoint URL.

### API Endpoint URL
api.url=https://api.example.com/covid19

## Contributing
Contributions are welcome! If you find any bugs or want to add new features, please feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the LICENSE file for more information.

## Acknowledgements
Data provided by Example COVID-19 API<br>
Inspired by Another COVID-19 Tracker Project

