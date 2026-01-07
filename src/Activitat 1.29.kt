import java.util.Scanner
import kotlin.math.sqrt

//Program : Ecuació 2n grau

fun main(){
    val scan  : Scanner = Scanner(System.`in`)

    //Declarem les variables
    var a : Double = scan.nextInt().toDouble()
    var b : Double = scan.nextInt().toDouble()
    var c : Double = scan.nextInt().toDouble()
    var solucioXPositiu : Double = 0.0
    var solucioXNegatiu : Double = 0.0

    //Comprobem que tingui 2 resultats i fem l'operació :
    var operacio : Double = (b * b) - (4 * a * c)

    if (operacio > 0.0){

        //sqrt() Es una funcio per fer l'arrel cuadrada!
        solucioXPositiu = (-b + sqrt(operacio)) / (2 * a)
        solucioXNegatiu = (-b - sqrt(operacio)) / (2 * a)

        //Imprimim el resultat per pantalla
        println(solucioXNegatiu)
        println(solucioXPositiu)
    }
}