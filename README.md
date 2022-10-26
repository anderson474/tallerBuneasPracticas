# tallerBuneasPracticas
Bibilioteca para administrar canciones.
La idea principal del manejo de canciones es:
-Que se tenga una biblioteca con todas las canciones.
-Una funcionalidad para crear playlist de forma determinada.
-Cada canción debe tener atributos como nombre, carattula, duracion, fecha, genero, identificador y descripción.
-Se debe de hacer filtros del mimo año o del mismo genero.
-y se puede ordenar por duración o por fecha.

## Guia para el funcionamiento
Al iniciar el proyecto, te aparecera un menu de opciones, donde te solicita como ususario que funcionalidad quieres ejecutar,
el por defecto trae dos canciones ya instaladas en la biblioteca.

![image](https://user-images.githubusercontent.com/113210248/198037795-10b7ca3f-ecbd-4ed4-a56f-c8914d7be603.png)

donde se tiene que ingresar el número de lo que se desea ejecutar, por ejemplo si yo quiero
agregar una canción a mi biblioteca ingreso el número uno:

![image](https://user-images.githubusercontent.com/113210248/198038365-573e73ad-e1de-4922-a7c3-1705553bdd61.png)

Este es un ejemplo de como crear una canción, ahora pregunta que si se desea continuar con otra opcion, si
le doy true, vuelve y me muestra las opciones disponibles y espera a que yo digite otro número:

![image](https://user-images.githubusercontent.com/113210248/198038680-39b965d6-5465-49c1-a09c-5c334f1e7c6d.png)

Si le doy a la opción dos debería mostrar las canciones predeterminadas y la que acabe de mostrar:

![image](https://user-images.githubusercontent.com/113210248/198039029-2dd7c6bb-9000-4525-96c8-2ef8d79e9bd2.png)

Cada vez que finalice una acción pregunta por la siguiente, en este caso se da true.
Si se le da la opción tres el ordena por duración de menor a mayor:

![image](https://user-images.githubusercontent.com/113210248/198039737-5aaf884c-4c19-4951-8c05-72f933ca692d.png)

La opción cuatro lo ordena de menor a mayor por fecha.
Si deseo buscar un año en particular la opción seis es la perfecta porque te muestra todas las canciones
que existen en ese año:

![image](https://user-images.githubusercontent.com/113210248/198040624-a86a8eae-1df1-4a2c-bd38-1b639bfbe97f.png)

y lo mismo para el genero, si no se encuentra ninguna canción con esas caracteristicas, se mostrará así:

![image](https://user-images.githubusercontent.com/113210248/198041071-63f794fa-bab2-4c00-aae7-6fd93223ec18.png)

Como un vector vacio.
Para crear la playlist se debe de colocar un nombre a la playlist y se le deben asignar canciones,
esto se hace mediante el identificador de cada canción, cuando imprimimos la biblioteca vemos
que las canciones estan catalogadas como cancion1, cancion2, etc. y así a medida que agrgue canciones.
si yo coloco uno que es el identificador de la cancion uno que esta por defecto, me la agrega, y me pregunta
si deseo agregar más canciones, si le doy false se sale de la configuración de la playlist.
Si la quiero ver le doy a la opción ocho y la busqueda se hace por nombre.
El procedimiento anteriormente descrito se evidencia en la siguiente imagen:

![image](https://user-images.githubusercontent.com/113210248/198042773-038528e3-4460-4c30-bcb0-dce98c36ecad.png)

uya para finalizar el proceso se puede dar a false cuando le pregunta si desea continuar y se acaba todo el
proceso.




Nota: 
-se destaca que los simbolos que aparecen en las fotos "?" es por las tildes, depende del compiladr o del entorno
de desarrollo que se las admita.
-cada vez que termine el depurador se borran las canciones o las playlist agregadas.

Muchas gracias, es con todo el ♥ por Jhon Anderson Galeano Santillana y Juan Guillermo Morales


