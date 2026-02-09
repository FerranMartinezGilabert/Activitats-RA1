package Activitat_1

import java.time.LocalDate
import java.util.Scanner

//Program: Ajuda per la màquina en el temps

//Enunciat : Després de molt d'esforç hem aconseguit dissenyar una màquina del temps. Només ens falta una utilitat,
// necessitem un petit programa que ens indiqui en quin dia estem. Fes un programa que imprimeixi per pantalla el
// següent missatge Avui és: 2021-09-17.

fun main(){
    val scanner = Scanner(System.`in`)

    //Importem la Data d'avui.
    var data = LocalDate.now()

    //Imprimim.
    println("Avui és $data")

}