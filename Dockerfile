# 使用官方 Java 镜像（自带JDK17，最稳定）
FROM openjdk:21-jdk-slim

# 工作目录
WORKDIR /app

# 把你的 jar 包复制到容器里
COPY hello-spring-0.0.1-SNAPSHOT.jar app.jar

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]