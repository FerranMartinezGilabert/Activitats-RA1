import java.util.Scanner

//Program: Parell o senar?

//Enunciat : Volem fer un programa que ens indiqui si un valor es parell o senar.

fun main(){
    val scan : Scanner = Scanner (System.`in`)

    //Demanem un numero.
    var numero : Int = scan.nextInt()

    //Comprobem si es parell, sinó és senar.
    if (numero % 2 == 0){
        println("parell") //Imprimim resultat
    }else println("senar")
}