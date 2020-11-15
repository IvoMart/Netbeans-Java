alert(
    "Bienvenido\nVemos nuevo Alert"
)


/**
 * Ejercicio Nº 2: Variables y operaciones a) Declarar 3
 * variables: num1, num2, y resultado.
 * 
 */
var num1 = 57,
    num2 = 10,
    resultado = 0;

/**b) Realizar la suma de las dos variables num y almacenarlas
 * en la variable resultado.
 */
resultado = num1 + num2;

/**c) Mostrar el resultado de la suma por pantalla mediante la función “alert”.
 */
alert(`La suma de los valores $[num1] ${num1} y $[num2] ${num2} es ` + resultado);

/**
 * Ejercicio Nº 3: Estructuras de control
 * a) Declarar 3 variables: num1, num2, y resultado.
 * b) Realizar la multiplicación de las dos variables num y almacenarlas en lavariable resultado.
 * c) Si el resultado de la multiplicación de ambas variables es mayor a 35, entoncesse deberá mostrar un alert con un texto que informe esto.
 * d) Si el resultado es menor o igual a 35, se deberá mostrar un alert con un textoque informe esto.
 * 
 */

function multiplica(num1, num2) {
    resultado = num1 * num2
        // variables locales
    if (resultado > 35) {
        alert(`La multiplicación entre ${num1} y ${num2} da como resultado ${resultado} que es mayor a 35`);
    } else {
        alert(`La multiplicación entre ${num1} y ${num2} da como resultado ${resultado} que es menor a 35`);
    }

}

multiplica(20, 46)

/**
 * Ejercicio Nº 4: Estructuras Repetitivas
 * a) Realizar un bucle que de un total de 3 vueltas
 * (con la estructura repetitivaque prefieran) en donde en cada vuelta
 * se muestre un alert informando en cual se encuentra en este momento.
 */
num1 = 0
while (num1 < 3) {
    num1++
    alert("estamos en un bucle. Vuelta: " + num1)
}


/** b) Al finalizar el bucle se debe mostrar otro alert con un mensaje que diga
 * “Ya se finalizó la cuenta”.
 */

alert("Ya se finalizó la cuenta")