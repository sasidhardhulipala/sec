FROM tomcat:9.0-jdk11-openjdk-slim
#Commands that need to be fired using root
RUN rm -rf /usr/local/tomcat/webapps/ROOT /usr/local/tomcat/webapps/host-manager /usr/local/tomcat/webapps/examples /usr/local/tomcat/webapps/manager /usr/local/tomcat/webapps/docs
RUN addgroup tomcat
RUN useradd -ms /bin/bash tomcat -g tomcat
RUN chown -R tomcat:tomcat /usr/local/tomcat
#Commands that need to be fired using tomcat
USER tomcat
ADD ./target/ROOT.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]