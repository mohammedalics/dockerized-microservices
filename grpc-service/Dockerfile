FROM openjdk:8

ADD target/grpc-service-1.0-SNAPSHOT.jar /home/app.jar
ADD rockyou.tar.gz /home

CMD java -Xmx2g -Xms2g -jar /home/app.jar
