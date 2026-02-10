package Activitat_2

import java.util.Scanner

//Program : Quin dia de la setmana?

fun main(){
    val scanner = Scanner(System.`in`)

    var dia : Int = scanner.nextInt()
    var mes : Int = scanner.nextInt()
    var any : Int = scanner.nextInt()

    var a = (14 - mes) / 12
    var y = (any - dia)
    var m = (mes + (12 * a) - 2)

    var d = (dia + y + (y / 4) - (y / 100) + (y / 400) + (31 * m) / 12) % 7

}