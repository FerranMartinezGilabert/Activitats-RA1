import java.util.Scanner

//Program: Qui riu ultim riu millor

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables
        var comprobant : Boolean = false
        var persones : Array<Int> = Array(5){0}
        var ultimaPersona : Int = persones.lastIndex

        //Omplim l'array de numeros.
        for (persona in 0 until persones.size){
            persones[persona]=scan.nextInt()
        }

        //Comprobem la condició sigui true.
        for (persona in 0 until persones.size){
            if (persones[persona] > ultimaPersona){
                comprobant = true
            } else comprobant = false
        }

        //Imprimim el resultat per pantalla.
        println(comprobant)
}