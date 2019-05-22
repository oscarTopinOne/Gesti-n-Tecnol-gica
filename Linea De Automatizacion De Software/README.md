## Linea de Automatización de Software
### Integrantes:
- Oscar Ivan Torres Pinto - 20152020044

- Yohan Arles Almonacid Ortiz - 20152020916 

- Brian Alfonso Rodriguez - 20151020600


### FITNESSE
![logofitnesse](https://user-images.githubusercontent.com/30842893/58141410-eb410400-7c08-11e9-90dd-729bc381c8f3.png)

Fitnesse es un IDE que utiliza un servidor Wiki para interactuar con FIT (Framework for Integrated Test).

FIT es una herramienta open-source diseñada para automatizar pruebas que requiere la colaboración de dos equipos: el equipo funcional (usuarios, perfiles de negocio) y el equipo de desarrollo.

El equipo funcional realiza tablas HTML con los casos de negocio que son proporcionadas a FIT, que se encarga de dar colores a la tabla en función del resultado de la prueba. La principal ventaja del uso de Fitnesse como IDE para FIT es la facilidad que ofrece para diseñar y organizar los wikis.

El equipo de desarrollo se encarga de desarrollar los fixtures que permiten al equipo funcional diseñar las tablas HTML.

#### Arquitectura

El servidor Wiki de Fitnesse requiere un segundo componente para poder ejecutar las pruebas. Este componente, no viene incluido en el software fitnesse, y existen varias implementaciones para diferentes lenguajes de programación.

Aunque inicialmente, sólo se podía trabajar con FIT, posteriormente apareció una segunda alternativa, Slim, para establecer la conexión entre los wikis de Fitnesse y el software de pruebas que ejercita el Software Under Test (SUT) a través de los fixtures. Esta segunda alternativa es más ligera y es la que ha terminado imponiéndose, por lo que se recomienda el uso de implementaciones Slim en lugar de FIT.
![fitnessearq](https://user-images.githubusercontent.com/30842893/58142150-92269f80-7c0b-11e9-93cb-e04cf615780a.jpg)

### Ventajas
La principal ventaja de esta herramienta, si la comparamos con otras similares como Junit, es que permite que perfiles funcionales o de negocio puedan definir y modificar fácilmente casos de Test sin necesidad de tener conocimientos de programación.

Esta herramienta se presenta como colaborativa, ya que requerirá la interacción de los encargados de especificar los casos de test o wikis, con los programadores que se encarguen del mantenimiento de los fixtures.

Aunque el propio fitnesse gestiona las versiones de cada Wiki, se puede decidir gestionar el directorio FitNesseRoot en alguna herramienta de control de cambios como SVN. Para ello bastaría con gestionar los ficheros content.txt y properties.xml anteriormente mencionados.

### Desventajas
Uno de los principales inconvenientes es que no todos los lenguajes de programación están soportados, si bien al tratarse de código libre, cualquier persona es libre de realizar la implementación y extender si lo necesita los tipos de fixtures disponibles.

#### Instrucciones
```sh
INSTRUCCIÓN DE USO:

Para instalar Fitnesse: Ir a la dirección www.fitnesse.org 
y descargar el .jar

Ejecutar el .jar y usar el siguiente comando:
java -jar fitnesse-standalone.jar -p 2222
Nota: El -p sirve para saber que puerto vamos a usar para la herramienta.

Usar la herramienta.
```

