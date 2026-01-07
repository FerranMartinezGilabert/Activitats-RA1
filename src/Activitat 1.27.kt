import java.util.Scanner

//Program : Som iguals?

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables
    val LLETRA1 : Char = scan.next().first()
    val LLETRA2 : Char = scan.next().first()
    var comprobant : Boolean = false

    //Comprobem que siguin la mateixa lletra
    if (LLETRA1.uppercaseChar() == LLETRA2.uppercaseChar()){
        comprobant = true
    }else comprobant = false

    //Imprimim el resultat per pantalla
    println(comprobant)

}