import java.util.Scanner

//Program : Quant de temps?

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables.
    var hores : Int = 0
    var minuts : Int = 0
    var segons : Int = 0

    //Demanem al usuari una cuantitat de temps en segons.
    var temps : Int = scan.nextInt()

    //Calculem quant de temps es en hores, minuts i segons.
    for (i in 1..temps) {
        segons++
        if (segons == 60){
            segons = 0
            minuts++
        }
        else if (minuts == 60){
            minuts = 0
            hores++
        }
    }

    //Imprimim el resultat per pantalla.
    println("$hores hora $minuts minuts $segons segons")
}