import java.util.Locale
import java.util.Scanner

//Punt 2 : - Exercicis amb estructures de control condicionals.

//Program: Màxim de 3 nombres enters

//Enunciat : Escriu un programa que, donats 3 nombres enters, imprimeixi el major per pantalla.

fun main(){
    val sc : Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem 3 nombres enters.
    val NUMERO1 : Int = sc.nextInt()
    val NUMERO2 : Int = sc.nextInt()
    val NUMERO3 : Int = sc.nextInt()

    //Comprobem quin es el mes gran :

    //Si el número mes gran es el primer imprimim el resultat per pantalla.
    if (NUMERO1 > NUMERO2 && NUMERO1 > NUMERO3) {
        println(NUMERO1)
    }

    //En cas de que sigui el segon número imprimim el resultat per pantalla.
    else if (NUMERO2 > NUMERO1 && NUMERO2 > NUMERO3) {
        println(NUMERO2)
    }

    //En cas de que sigui el tercer número imprimim el resultat per pantalla.
    else if (NUMERO3 > NUMERO1 && NUMERO3 > NUMERO2) {
        println(NUMERO3)
    }else println(NUMERO1) //En cas d'empat dona igual quin imprimim així que imprimim el primer número.
}