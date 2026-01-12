import java.text.SimpleDateFormat
import java.util.Scanner

//Program : Afegeix un segon(2)

//Enunciat: Fes un programa que afegeixi 1 segon a una hora doanda.

fun main(){
    val scan  = Scanner(System.`in`)

    //Demanem hora, minut i segons al usuari.
    val HORA : Int = scan.nextInt()
    val MINUT : Int = scan.nextInt()
    val SEGON : Int = scan.nextInt()
    var tempsHora : Int = 0
    var tempsMin : Int = 0
    var tempsSec : Int = 0
    var dateFormat = SimpleDateFormat("hh:mm:ss")
    //Sumem un segon.
    if (SEGON + 1 > 60){
        tempsSec += SEGON + 1
        tempsMin += MINUT
        tempsHora += HORA

        //Imprimim resultat per pantalla.
        println(tempsHora.)
    }else println()
}