import java.util.Scanner

//Program: És l'edat legal

//Enunciat: L'usuari escriu un enter amb la seva edat i s'imprimeix true si és major d'edat, i false
// en qualsevol altre cas.

fun main () {
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables.
    var edat : Int = scan.nextInt()
    var majoriaEdat : Boolean = false

    //Comprobem si té la majoría d'edat.
    if (edat >= 18){
        majoriaEdat = true
        //Imprimim el resultat per pantalla.
        println(majoriaEdat)
    }else println(majoriaEdat)
}