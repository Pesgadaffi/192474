## Ejercicio1:
1. Scanner: Se usa para leer entradas del usuario desde la consola.
prodNomb: Es un arreglo de 5 elementos de tipo String que se utilizará para almacenar los nombres de 5 productos.
productPrices: Es un arreglo de 5 elementos de tipo double que almacenará los precios de esos productos.
totalSum: Es una variable para almacenar la suma total de los precios finales de los productos después de aplicar impuestos y descuentos.
2. Entrada de Datos:

Este for se repite 5 veces (de i = 0 a i = 4)

3. Cálculo de Precios Finales y Suma Total:
Segundo ciclo for, para cada producto:
Se calcula el precio final de cada producto usando el método calculateFinalPrice, que toma el precio original del producto.

4. Método de Cálculo de Precio Final:
Este es el método que calcula el precio final de un producto:

Impuesto: Se aplica un impuesto del 19% sobre el precio original.
Descuento: Si el precio del producto es mayor a 10,000, se aplica un descuento del 10% sobre el precio original (precio * 0.10). Si no, el descuento es 0.

## Ejecicio 2
1. se pide al usuario que ingrese el sueldo