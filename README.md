# Spring Boot with Log Monitoring(ELK)
The purpose of this project is to be my example for setting up and configuring Spring Boot application that has Log Monitoring with ELK (Elasticsearch, Logstash, Kibana) 

## Installation
1. Clone this project and open Terminal in the root folder
2. Run `docker-compose up` to start ELK locally

## Usage
1. Go to `localhost:9200` to ensure that Elasticsearch is running successfully
2. Run the application
3. Go to `localhost:5601` and go to **Stack Management** tab
4. Create index pattern with the name as defined in `./logstash/pipeline/logstash.conf` in `index` section
5. Call API defined in the controller to see each log in Kibana

## Log Configuring Files 
Files involving in setting up and configuring Log Monitoring with ELK
* `./pom.xml`
* `./docker-compose.yaml`
* `./logstash`
* `./src/main/.../resources/logback-spring.xml`

