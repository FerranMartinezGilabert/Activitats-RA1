import java.util.Scanner

//Program: Qui riu ultim riu millor

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Fem un bucle repeat a on declarem les variables.
    repeat(5){
        var comprobant : Boolean = false
        var persones : Array<Int> = Array(5){0}

        //Omplim l'array de numeros.
        for (persona in 0 until persones.size){
            persones[persona]=scan.nextInt()
        }

        //Comprobem la condició sigui true.
        var numeroPersones : Int = 0
        var personaMesGran : Int = 0
        while (persones.size > personaMesGran) {
            if (persones[personaMesGran] > numeroPersones) {
                numeroPersones = persones[personaMesGran]
            }

            personaMesGran++
            comprobant = true
        }
        //Imprimim el resultat per pantalla.
        println(comprobant)
    }
}