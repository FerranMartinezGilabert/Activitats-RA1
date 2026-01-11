import java.util.Scanner

//Program : Som iguals?

//Enunciat : Fes un programa que rebi un caràcter de l’abecedari en minúscula i un altre en majúscula
// i digui si són corresponents.

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables
    val LLETRA1 : Char = scan.next().first() // Fiquem .first perque com que volem el primer caràcter del scan
    // el detecti com un char i no un String.
    val LLETRA2 : Char = scan.next().first()
    var comprobant : Boolean = false

    //Comprobem que siguin la mateixa lletra.
    if (LLETRA1.uppercaseChar() == LLETRA2.uppercaseChar()){
        comprobant = true
    }else comprobant = false

    //Imprimim el resultat per pantalla
    println(comprobant)

}