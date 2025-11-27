import java.util.Scanner

//Program: És major que.

fun main (){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables a utilitzar.
    var numeroEnter1 : Int = scan.nextInt()
    var numeroEnter2 : Int = scan.nextInt()
    var comprobant : Boolean = false

    //Comprobem si el numero es major que l'altre.
    if (numeroEnter1 > numeroEnter2){
        comprobant = true

    //Imprimim el resultat a pantalla.
        println(comprobant)
    }else println(comprobant)
}