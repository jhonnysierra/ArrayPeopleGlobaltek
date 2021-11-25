# ArrayPeopleGlobaltek
Este proyecto se desarrollo en el IDE Eclipse.

Version: Photon Release (4.8.0).
Build id: 20180619-1200

Ambiente de ejecucion: JavaSE-1.7 (jdk-12.0.1)


### Problema planteado
En cualquier lenguaje de programación moderno, cree una función que itera a través de un arreglo de objetos (primer argumento) y devuelve un arreglo de todos los objetos que tienen el par propiedad valor coincidente (segundo argumento). La propiedad del segundo argumento debe estar presente en todos los objetos del arreglo.
Por ejemplo, si el primer argumento es:
[{nombre: "John", apellido: "Doe"}, {nombre: "Jane", apellido: null}, {nombre: "Jose", apellido: "Doe"}]
Y el segundo argumento es:
{apellido: "Doe"}
Debe devolver un arreglo con los objetos coincidentes del arreglo:
[{nombre: "John", apellido: "Doe"}, {nombre: "Jose", apellido: "Doe"}]
