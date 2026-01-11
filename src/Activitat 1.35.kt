import java.util.Scanner

//Program : Creador de targetes de treball.

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem les variables.
    var nom : String = scan.nextLine()
    var cognom : String = scan.nextLine()
    var despatx : Int = scan.nextInt()

    //Imprimim el resultat per pantalla.
    println("Empleada: $nom $cognom - Despatx: $despatx")

}