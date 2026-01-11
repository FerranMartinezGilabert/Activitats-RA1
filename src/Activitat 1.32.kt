import java.util.Scanner

//Program : Calcula el capital

//Enunciat: Fes un programa que demani un capital, i calculi quin capital es generarà passat cert temps segons certs
// interessos (entre 0% i 100%).

fun main (){
    val scan  = Scanner(System.`in`)

    //Declarem les variables.
    var capitalInicial : Int = scan.nextInt()
    var segons : Int = scan.nextInt()
    var percentatge : Int = scan.nextInt()
    var capitalFinal : Int = 0

    //Calculem el capital en base als segons que passen i el percentatge.
    for (pujada in 0 until segons) {

        capitalFinal = capitalInicial + pujada + (10 * percentatge)

    }

    //Imprimim el resultat.
    println(capitalFinal.toDouble())
}