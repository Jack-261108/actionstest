FROM openjdk:8
EXPOSE 8081
ADD /target/springboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["sh","-c","java -jar springboot-images-new.jar"]
