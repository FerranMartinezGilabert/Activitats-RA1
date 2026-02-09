package Activitat_1

import java.util.Scanner
import kotlin.math.sqrt

//Program : Ecuació 2n grau

//Enunciat : Fes un programa que resolgui la fórmula d’una equació de segon grau.

fun main(){
    val scan  : Scanner = Scanner(System.`in`)

    //Declarem les variables.
    var a : Double = scan.nextInt().toDouble()
    var b : Double = scan.nextInt().toDouble()
    var c : Double = scan.nextInt().toDouble()
    var solucioXPositiu : Double = 0.0
    var solucioXNegatiu : Double = 0.0

    //Calculem el discriminant de l'ecuació, es a dir, a part que hi ha dins l'arrel cuadrada en l'ecuació.
    var discriminant : Double = (b * b) - (4 * a * c)

    //Si el discriminant es més gran que 0 significa que té dos solucions.
    if (discriminant > 0.0){

        //sqrt() Es una funció per fer l'arrel cuadrada!
        solucioXPositiu = (-b + sqrt(discriminant)) / (2 * a)
        solucioXNegatiu = (-b - sqrt(discriminant)) / (2 * a)

        //Imprimim el resultat per pantalla
        println(solucioXNegatiu)
        println(solucioXPositiu)
    }
}