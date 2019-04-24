## Entorno Docker Herramienta Gestion de Proyectos
### Integrantes:
- Oscar Ivan Torres Pinto - 20152020044

- Yohan Arles Almonacid Ortiz - 20152020916 

- Brian Alfonso Rodriguez - 20151020600


### REDMINE
![logoredmine](https://user-images.githubusercontent.com/30842893/56640373-780f9680-6638-11e9-9573-ef5daad313c2.png)

Redmine es una herramienta para la gestión de proyectos y seguimiento de incidencias de código abierto basado en la web. Permite a sus usuarios gestionar múltiples proyectos y sus respectivos subproyectos. Para cada proyecto proporciona herramientas muy útiles como wikis y foros, seguimiento temporal y control de acceso flexible basado en roles.

Redmine, además, ofrece funcionalidades clásicas en la gestión de proyectos como calendario de actividades o diagramas de Gantt, lo que nos permite un seguimiento visual cómodo de las líneas de trabajo.

Redmine está escrito utilizando el Framework Ruby on Rails y publicado como software libre bajo la licencia pública general de GNU v2. Su instalación es muy parecida a la instalación de cualquier CMS como WordPress o Joomla.

#### Caracteristicas REDMINE

- Soporta para múltiples proyectos (con sus respectivos subproyectos).
- Control de acceso flexible basado en roles.
- Sistema flexible de seguimiento de incidencias .
- Diagramas de Gantt y calendario.
- Gestor de noticias, documentos y archivos.
- Feeds y notificaciones por correo electrónico.
- Wiki para cada proyecto.
- Foro para cada proyecto.
- Seguimiento de líneas temporales (de trabajo).
- Campos personalizados para incidencias, entradas temporales, proyectos y usuarios.
- Integración con los sistemas de control de versiones más utilizados (Subversion, CVS, Git, Mercurial, Bazaar y Darcs).
- Creación de incidencias vía correo electrónico.
- Soporte para autentificación LDAP múltiple.
- Soporte para auto-registro de usuarios.
- Soporte para 34 idiomas (evidentemente incluye español).
- Soporte para múltiples sistemas de bases de datos (incluyendo MySQL, PostgreSQL y SQLite).
- Extensión mediante plugins.

#### Instrucciones
```sh
INSTRUCCIÓN DE USO:

Para crear la red: docker network create — driver bridge redmine_network

Para crear los volumenes: docker volume create postgres-data
                          docker volume create redmine-data

Para iniciar la Base de Datos:  
      docker container run -d                         \ 
      --name postgres                           \ 
      --network redmine_network                 \ 
      -v postgres-data:/var/lib/postgresql/data \ 
      --restart always                          \ 
      -e POSTGRES_PASSWORD='password'             \ 
      -e POSTGRES_DB='redmine'                  \ 
      postgres:lates

Para iniciar el Redmine:
      docker container run -d                         \ 
      --name redmine                              \ 
      --network redmine_network                   \ 
      -p 80:3000                                  \ 
      --restart always                            \ 
      -v redmine_data:/usr/src/redmine/files      \ 
      -e REDMINE_DB_POSTGRES='postgres'           \ 
      -e REDMINE_DB_DATABASE='redmine'            \ 
      -e REDMINE_DB_PASSWORD='password'           \ 
      redmine:latest

Descargar el archivo docker-compose.yml

Abrir ubicación del archivo en la consola de comandos de docker.

Ejecutar el comando: docker-compose up
```

