FROM openjdk:8
EXPOSE 8080
ADD target/GithubActions.jar GithubActions.jar 
ENTRYPOINT ["java","-jar","/GithubActions.jar"]