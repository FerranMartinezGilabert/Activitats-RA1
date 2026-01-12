import java.util.Scanner

//Program : Afegeix un segon(2)

//Enunciat: Fes un programa que afegeixi 1 segon a una hora doanda.

fun main(){
    val scan  = Scanner(System.`in`)

    //Demanem hora, minut i segons al usuari.
    var hora : Int = scan.nextInt()
    var minut : Int = scan.nextInt()
    var segon : Int = scan.nextInt()
    var tempsHora : Int = hora
    var tempsMin : Int = minut

    //Sumem 1 segon.
    var tempsSec : Int = segon + 1

    //Comprobem si els segons, minuts i hores arriben a 60 i 24 respectivament.
    if (tempsSec >= 60){
        tempsSec = 0
        tempsMin += 1
    }
    if (tempsMin >= 60){
        tempsMin = 0
        tempsHora += 1
    }
    if (tempsHora >= 24){
        tempsHora = 0
    }
    //Imprimim el resultat per pantalla, %02d transforma el format a dos dígits per exemple 7 a 07. Font: El amigo.
    println("%02d:%02d:%02d".format(tempsHora, tempsMin, tempsSec))
}