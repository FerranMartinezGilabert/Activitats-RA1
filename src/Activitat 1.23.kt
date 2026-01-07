import java.util.Scanner

//Program: Es una letra?

fun main(){
    val scan : Scanner = Scanner(System.`in`)

    //Declarem les variables, i fem una llista amb l'alfabet.
    val ALFABET : Array<Char> = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
        'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ç', 'Ñ')
    var comprobant = false
    var lletraAComprobar : Char = scan.nextLine().first() //Afegim .first per agafar el primer caracter.

    //Comprobem si la letra es a la llista.
    for (lletra in 0 until ALFABET.size) {

        //Fiquem uppercaseChar perque aixi el pasi a majuscules i no tenir que fer una llista amb minuscules també.
        if (lletraAComprobar.uppercaseChar() == ALFABET[lletra]){
            comprobant = true
        }
        //No fiquem else comprobant = false per un motiu : Si la primera lletra es la A i escric A el comprobant
        // despres a la segona lletra B ficara A != B i llavors pasa a false, unic problema segueix recorrent
        // el bucle innecesariament.
    }

    //Imprimim el resultat per pantalla.
    println(comprobant)
}