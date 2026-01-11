//Program: Programa adolescent.

//Enunciat: Fes un programa que rebi un valor booleà i et retorni el valor contrari.
import java.util.Scanner

fun main (){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem el valor a utilitzar.
    var valor : Boolean = scan.nextBoolean()

    //El cambiem e imprimim la resposta per pantalla.
    if (valor == false){
        valor = true
    }else valor = false
    println(valor)
}