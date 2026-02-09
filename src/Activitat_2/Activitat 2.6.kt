package Activitat_2

import java.util.Scanner

//Program: Quina pizza és més gran?

//Enunciat : Fes un programa que compari pizzes rodones amb pizzes rectangulars, volem saber, en cada cas,
// quina de les dues és més gran.

fun main(){
    val scan  = Scanner(System.`in`)
    //Declarem les variables.
    val pizzaRodona : Int = scan.nextInt()
    val basePizzaRectangular : Int = scan.nextInt()
    val alturaPizzaRectangular : Int = scan.nextInt()

    //Calculem el àrea de cada pizza.
    val areaPizzaRodona : Double = (3.1415 * (pizzaRodona * pizzaRodona)) / 4
    val areaPizzaRectangular : Int = basePizzaRectangular * alturaPizzaRectangular

    //Comparem quina és més gran e imprimim el resultat.
    if (areaPizzaRodona > areaPizzaRectangular) {
        println("Pizza rodona : ${areaPizzaRodona}")
    }else if (areaPizzaRodona < areaPizzaRectangular) {
        println("Pizza rectangular : ${areaPizzaRectangular}")
    }else println("Empat : ${areaPizzaRectangular}")
}