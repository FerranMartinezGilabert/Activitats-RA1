import java.util.Scanner

//Program : De metre a peu

fun main(){
    val scan  = Scanner(System.`in`)

    //Declarem les variables
    var numeroMetres : Int = scan.nextInt()
    var metre : Int = 0
    var polzades : Double = 0.0
    var peu : Double = 0.0

    //Fem un buble a on nem acumulant els peus
    for (i in 1..numeroMetres){
        metre++
        polzades += 39.37
        peu = polzades / 12
    }

    //Imprimim el resultat per pantalla
    println(peu)
}