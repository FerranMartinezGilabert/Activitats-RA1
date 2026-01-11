//Program: Tres nombres iguals

//Enunciat : Fes un programa que rebi tres nombres enters i torni si són iguals o no

import java.util.Scanner

fun main (){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables.
    var numero1 : Int = scan.nextInt()
    var numero2 : Int = scan.nextInt()
    var numero3 : Int = scan.nextInt()
    var comprobant : Boolean = false

    //Comprobem que siguin iguals.
    if (numero1 == numero2 && numero2 == numero3){
        comprobant = true

        //Imprimim el resultat per pantalla.
        println(comprobant)
    }else println(comprobant)
}