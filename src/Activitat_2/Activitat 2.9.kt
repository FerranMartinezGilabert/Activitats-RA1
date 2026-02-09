package Activitat_2

import java.util.Scanner

//Program : Canvi mínim

//Enunciat : Fes un programa que, donats una quantitat d’euros i cèntims, calculi el nombre mínim de bitllets i monedes necessàries per
//obtenir aquesta quantitat. Comptant que hi ha monedes d’1, 2, 5, 10, 20, 50 cèntims, monedes d’1 i 2 euros i bitllets de 5, 10,
//20, 50, 100, 200 i 500 euros.

fun main (){
    val scanner = Scanner(System.`in`)

    val EUROS : Int = scanner.nextInt()
    var euro : Int = EUROS
    val CENTIMS : Int = scanner.nextInt()
    var centim : Int = CENTIMS

    val BITLLET500 : Int = 500
    val BITLLET200 : Int = 200
    val BITLLET100 : Int = 100
    val BITLLET50 : Int = 50
    val BITLLET20 : Int = 20
    val BITLLET10 : Int = 10
    val BITLLET5 : Int = 5
    val MONEDA2EURO : Int = 2
    val MONEDA1EURO : Int = 1
    val MONEDA50CENTS : Int = 50
    val MONEDA20CENTS : Int = 20
    val MONEDA10CENTS : Int = 10
    val MONEDA5CENTS : Int = 5
    val MONEDA2CENTS : Int = 2
    val MONEDA1CENTS : Int = 1

    var contador500 : Int = 0
    var contador200 : Int = 0
    var contador100 : Int = 0
    var contador50 : Int = 0
    var contador20 : Int = 0
    var contador10 : Int = 0
    var contador5 : Int = 0
    var contador2E : Int = 0
    var contador1E : Int = 0
    var contador50C : Int = 0
    var contador20C : Int = 0
    var contador10C : Int = 0
    var contador5C : Int = 0
    var contador2C : Int = 0
    var contador1C : Int = 0

    while (euro != 0 || centim != 0){
        when{
            (euro >= BITLLET500) -> {
                contador500++
                euro -= BITLLET500
            }
            (euro >= BITLLET200) -> {
                contador200++
                euro -= BITLLET200
            }
            (euro >= BITLLET100) -> {
                contador100++
                euro -= BITLLET100
            }
            (euro >= BITLLET50) -> {
                contador50++
                euro -= BITLLET50
            }
            (euro >= BITLLET20) -> {
                contador20++
                euro -= BITLLET20
            }
            (euro >= BITLLET10) -> {
                contador10++
                euro -= BITLLET10
            }
            (euro >= BITLLET5) -> {
                contador5++
                euro -= BITLLET5
            }
            (euro >= MONEDA2EURO) -> {
                contador2E++
                euro -= MONEDA2EURO
            }
            (euro >= MONEDA1EURO) -> {
                contador1E++
                euro -= MONEDA1EURO
            }
        }
        when{
            (centim >= MONEDA50CENTS) -> {
                contador50C++
                centim -= MONEDA50CENTS
            }
            (centim >= MONEDA20CENTS) -> {
                contador20C++
                centim -= MONEDA20CENTS
            }
            (centim >= MONEDA10CENTS) -> {
                contador10C++
                centim -= MONEDA10CENTS
            }
            (centim >= MONEDA5CENTS) -> {
                contador5C++
                centim -= MONEDA5CENTS
            }
            (centim >= MONEDA2CENTS) -> {
                contador2C++
                centim -= MONEDA2CENTS
            }
            (centim >= MONEDA1CENTS) -> {
                contador1C++
                centim -= MONEDA1CENTS
            }
        }
    }
    println("""
        Bitllets de 500 euros: ${contador500}
        Bitllets de 200 euros: ${contador200}
        Bitllets de 100 euros: ${contador100}
        Bitllets de 50 euros: ${contador50}
        Bitllets de 20 euros: ${contador20}
        Bitllets de 10 euros: ${contador10}
        Bitllets de 5 euros: ${contador5}
        Monedes de 2 euros: ${contador2E}
        Monedes de 1 euro: ${contador1E}
        Monedes de 50 cèntims: ${contador50C}
        Monedes de 20 cèntims: ${contador20C}
        Monedes de 10 cèntims: ${contador10C}
        Monedes de 5 cèntims: ${contador5C}
        Monedes de 2 cèntims: ${contador2C}
        Monedes de 1 cèntims: ${contador1C}
    """.trimIndent())
}