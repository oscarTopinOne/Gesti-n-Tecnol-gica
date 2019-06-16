## Linea de Automatización de Software Jenkins
### Integrantes:
- Oscar Ivan Torres Pinto - 20152020044

- Yohan Arles Almonacid Ortiz - 20152020916 

- Brian Alfonso Rodriguez - 20151020600


### JENKINS
![jenkins](https://user-images.githubusercontent.com/30842893/59559339-6c05dc80-8fca-11e9-8344-8d6326bb9e6c.png)
Jenkins no es mas que un servidor diseñado para la integración continua, es gratuito y es de código abierto (open source), también se ha convertido en el software mas utilizado para esta tarea.

Jenkins nació de otra herramienta llamada Hudson. Hudson fue desarrollada en Sun Microsystem por Kohsuke Kawaguchi. Al tiempo de que Oracle comprara Sun, la comunidad de Hudson decidió desarrollar otro proyecto con el nombre de Jenkins pero con la diferencia de que este seria open source.

 FUNCIONES DE JENKINS
Anteriormente mencionamos algunos niveles en la que maneja la integración continua. Jenkins es el que se encarga de ejecutar estas tareas cuando configuramos un build. Si ponemos un ejemplo, podríamos configurar una tarea en donde se compruebe el repositorio de un SVN de desarrollo cada cierto tiempo y que para cuando haya cambios en ellos, Jenkins compile el código que se subió y haga las pruebas correspondientes.

Si al momento de realizar las pruebas se consiguen errores, Jenkins se encargara de notificar el resultado al personal encargado, bien sea QA, el propio programador, al encargado del proyecto, etc, por medio de correo electrónico o cualquier otro método que hayan configurado, para que lo modifiquen y vuelvan a subirlo.

Por otro lado, si el resultado es el esperado, Jenkins puede ser configurado para que integre el código en el repositorio correspondiente, pasar al siguiente nivel de pruebas o bien subir el código a producción. Estas rutinas pueden ser configuradas para integrarse periódicamente, y a través de su panel se puede seguir todo el proceso.

Algunas de las características que encontraremos en Jenkins son:

Configurar la herramienta para que ejecute las políticas o reglas de negocios de calidad y ver sus resultados.
Visualizar el resultado de todas la pruebas.
Visualizar o generar la documentación del proyecto.
Pasar versiones del código de QA a un ambiente de pre-producción para sus ultimas pruebas o bien a producción directamente.

### Integración Continua con Jenkins
Imaginemos un escenario donde se creó el código fuente completo de la aplicación y luego se implementó en el servidor de prueba para probar:
En primer lugar, un desarrollador confirma el código en el repositorio de código fuente.
Mientras tanto, el servidor Jenkins revisa el repositorio a intervalos regulares para ver los cambios.
Poco después de que se produzca la confirmación, el servidor de Jenkins detecta los cambios que se han producido en el repositorio de código fuente.
Jenkins realizará esos cambios y comenzará a preparar una nueva versión.
Si falla la compilación, se notificará al equipo afectado.
Si lo construido es correcto, entonces Jenkins implementa el built-in en el servidor de prueba.
Puedes configurar la canalización (la secuencia de comandos para ejecutar) para crear la construcción con varios pasos:
Preparar, probar (pruebas unitarias y pruebas de integración), empaquetar, publicar, implementar.
Después de ejecutarlo, Jenkins genera un comentario, si estas restricciones son correctas, el artefacto es válido. Y luego Jenkins notifica a los desarrolladores sobre la construcción y los resultados de las pruebas.
Seguirás revisando el repositorio de código fuente para ver los cambios realizados en el código fuente y todo el proceso sigue repitiendose (pruebas funcionales).

### Ventajas

- Es de código abierto y es fácil de usar, fácil de instalar y no requiere instalaciones o componentes adicionales.
- Es gratis.
- Fácilmente configurable. Jenkins se puede modificar y extender fácilmente. Implementa código de forma instantánea, genera informes de prueba. Jenkins se puede configurar de acuerdo con los requisitos de integraciones continuas y entrega continua.
- Plataforma independiente. Jenkins está disponible para todas las plataformas y diferentes sistemas operativos, ya sea OS X, Windows o Linux.
- Rich Plugin ecosystem. El amplio conjunto de complementos hace que Jenkins sea flexible y permita construir, implementar y automatizar en varias plataformas.
- Fácil soporte debido a que es de código abierto y ampliamente utilizado, no hay escasez de soporte de grandes comunidades en línea de equipos ágiles.
- El desarrollador escribe las pruebas para detectar los errores de su código lo más rápido posible. De modo que el tiempo del desarrollador se guarda sin desperdiciar integraciones plagadas de errores a gran escala.
Los problemas se detectan y resuelven casi de inmediato, lo que mantiene el software en un estado en el que se puede liberar en cualquier momento de forma segura.
- La mayor parte del trabajo de integración está automatizado. Por lo tanto, los problemas de integración son menores. Esto ahorra tiempo y dinero durante la vida útil de un proyecto.
### Desventajas
A pesar de que Jenkins como tal no tiene costes asociados, los servidores dedicados en los que se ejecuta, sí suponen un coste. Estos costes además pueden variar mucho dependiendo de la carga de trabajo del servidor y por tanto no es fácil predecir su impacto final. Por otra parte, a pesar de que obtener un funcionamiento básico puede resultar rápido y trivial, si se quieren realizar automatizaciones más complejas habrá que invertir tiempo y esfuerzo, ya que habrá que integrar y personalizar cada paso de una tarea, lo cual requiere de gente cualificada y con experiencia.

Finalmente, una de sus grandes ventajas (la capacidad de usar plugins para procesos que no se encuentran de forma nativa en la plataforma) también es una gran desventaja. Esto es porque si se requiere la ejecución de algo en concreto que no se encuentre ni de forma nativa ni en plugins habrá que buscar integraciones con otros sistemas externos, con los gastos que ello conlleva.
#### Instrucciones
```sh
INSTRUCCIÓN DE USO:

Para instalar Jenkins:
usar el docker-compose.yml y ejecutarlo con el comando:
docker-compose up
Usar la herramienta.
```
### Referencias 
[1]. https://guiadev.com/introduccion-a-jenkins/ <br />
[2]. https://apiumhub.com/es/tech-blog-barcelona/ventajas-de-jenkins/<br />
[3]. https://jenkins.io/ <br />
[4]. https://www.hiberus.com/crecemos-contigo/jenkins-automatizacion-tareas-aplicada-a-aplicaciones-moviles/ <br />
