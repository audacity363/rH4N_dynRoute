FROM ubuntu:latest as rh4n
EXPOSE 1024:8080
run apt-get update && apt-get -y install openjdk-8-jdk wget vim
run wget http://artfiles.org/apache.org/tomcat/tomcat-8/v8.5.27/bin/apache-tomcat-8.5.27.tar.gz -O /opt/tomcat.tar.gz
run cd /opt; tar -xvf /opt/tomcat.tar.gz

cmd /opt/apache*/bin/catalina.sh start && tail -f /opt/apache*/logs/catalina.out

#-v /host/directory:/container/directory
#-p 1024:8080