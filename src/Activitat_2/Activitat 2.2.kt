package Activitat_2

import java.util.Scanner

//Program : Salari

//Enunciat : A un treballador li paguen per hores, a partir de 40 hores de treball la tarifa per hora s'incrementa
// en un 50%. Escriu un algorisme que demani les hores treballades i mostri com a resultat el salari del treballador,
// tenint en compte que la tarifa per hora és de 40 €/h.

fun main(){
    val scanner = Scanner(System.`in`)

    //Demanem les hores treballades aquesta setmana.
    val HORES_TOTALS = scanner.nextInt()
    val HORES_BASE = 40
    var horesExtra : Int = 0
    var salari = 0
    val TARIFA = 40
    var TARIFA_AUGMENTADA = 60

    //Calculem si supera les 40 hores setmanals, si supera les hores setmanals guardem les hores extras
    // i calculem les tarifes.
    if (HORES_TOTALS > 40){
        for (i in HORES_BASE+1..HORES_TOTALS){
            horesExtra ++
        }
        //Calculem el salari base + el extra d'hores.
        salari = (HORES_BASE * TARIFA) + (horesExtra * TARIFA_AUGMENTADA)

        //Sinó calculem el salari amb la tarifa normal.
    }else salari = HORES_TOTALS * TARIFA

    //Imprimim el resultat per pantalla.
    println(salari)
}