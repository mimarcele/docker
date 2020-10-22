# docker
Instalação: 
 Site oficial do docker para a instalação do aplicativo : https://www.docker.com/
 
 Passo a passo em vídeo para a instalação do docker: https://www.youtube.com/watch?v=Hg4i7f5SdWI&t=342s
 
 Comandos utilizados para o MySql:
 
 - docker container ls -a : Listar containers e seus status
 - docker container rm (nome) : Deletar o container desejado 
 - docker run -p 3306:3306 --name (nome) -e MYSQL_ROOT_PASSWORD=(senha) -d mysql : Criar um container utilizando imagem mysql 
 - docker container start (nome) : Iniciar um container
 - docker container stop (nome) : Parar um container 
 
 #Documentação da api está disponível no link: http://localhost:8080/swagger-ui.html
