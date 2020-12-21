#1.Собираем образ на основе docker файла dockerfile точка означает контекст текущей директории
   >docker build -t in28min/hello-world-api.jar:dockerfile1 .
#2.Запускаем собранный образ    
   >docker run -p 8080:8080 in28min/hello-world-api.jar:dockerfile1