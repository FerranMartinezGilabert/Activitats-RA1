import java.util.Scanner

//Program: Fes-me mayuscula

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables
    val lletraAlfabet : Char = scan.nextLine().first()

    //La fem mayuscula
    val lletra : Char = lletraAlfabet.lowercaseChar()

    //L'imprimim per pantalla
    println(lletra)
}