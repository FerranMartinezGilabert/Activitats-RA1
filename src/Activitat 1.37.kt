import java.time.LocalDate
import java.util.Scanner

//Program: Ajuda per la màquina en el temps

fun main(){
    val scanner = Scanner(System.`in`)

    //Importem la Data d'avui
    var data = LocalDate.now()

    //Imprimim
    println("Avui és $data")

}