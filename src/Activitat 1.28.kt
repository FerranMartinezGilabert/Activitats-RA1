import java.util.Scanner

//Program : Un es 10

//Enunciat : Fes un programa que donats 4 enters ens diguis si hi ha cap que sigui 10.

fun main(){
    val scan  : Scanner = Scanner(System.`in`)

    //Declarem les variables.
    var comprobant : Boolean = false
    var llistaNumeros : Array<Int> = Array(4){0}

    //Fem un bucle que ompleixi la llista de numeros.
    for (numero in 0 until llistaNumeros.size){
        llistaNumeros[numero] = scan.nextInt()

        //Comprobem que sigui el numero 10.
        if (llistaNumeros[numero] == 10){
            comprobant = true
        }else comprobant = false
    }

    //Imprimim el resultat per pantalla.
    println(comprobant)
}