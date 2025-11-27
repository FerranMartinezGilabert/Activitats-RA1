//Program : + 1 segon!
import java.util.*
//Enunciat : Fes un programa que afegeixi 1 segon un nombre de segons determinat.
fun main(){
    //Definim l'objecte Scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)
    //Demanem els segons a l'usuari
    println("Indiqui un numero en segons :")
    var segons : Int = scanner.nextInt()

    //Declarem un contador de temps
    var temps : Int = 0

    //Creem un bucle for a on sumem 1 al contador.
    for (i in 0..segons){
        temps++
    }

    //Si el contador ha arribat a 60 el tornem a posar a 0
    if (temps == 60){
        temps = 0
        println(temps)
        
    //Sino imprimim el temps
    }else println(temps)
}