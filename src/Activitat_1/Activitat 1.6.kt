package Activitat_1//Program :  Calculador de taules per 3 aules

import java.util.*

//Enunciat : En una escola tenim tres classes i volem saber quin és el nombre de taules que necessitarem tenir en total.
//Dependrà del nombre d'alumnes per aula. Cal tenir en compte que a cada taula hi caben 2 alumnes.

fun main() {

    //Definir l'objecte scanner
    val scanner : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem els alumnes de cada aula.
    var alumnesAula1 : Int = scanner.nextInt()
    var alumnesAula2 : Int = scanner.nextInt()
    var alumnesAula3 : Int = scanner.nextInt()

    //Dividim els alumnes pel nombre de pupitres que necesitem i calculem cuants pupitres necesitem.
    var numPupitres1 : Int = alumnesAula1 / 2 + alumnesAula1 % 2
    var numPupitres2 : Int = alumnesAula2 / 2 + alumnesAula2 % 2
    var numPupitres3 : Int = alumnesAula3 / 2 + alumnesAula3 % 2
    var pupitres : Int = numPupitres1 + numPupitres2 + numPupitres3

    // Mostrem el resultat per pantalla
    println(pupitres)
}