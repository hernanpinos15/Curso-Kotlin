//HOLA MUNDO
/*
fun main(args: Array<String>) {
    print("HOLA MUNDO")
}
*/
//funcion if
/*
fun main(args: Array<String>){
    var x =1
    if(x>18){
        print("ok")
    }else{
        print("no ok")
    }
}
fun main(args: Array<String>){
    var x= 1
    if(x is Int) print("es entero") else print("no es entero")
}
 */
/*
fun main(){
    var n = 1
    when(n){
        1 ->
            print("a")
        2->{
            print("b")
        }
        3->{
            print("c")
        }
        else->
            print("no")
    }
}
 */
/*
fun main(){
    val letras = listOf("a","b","c")
    for(indice in letras.indices){
        print("${letras[indice]} pos = $indice\n")
    }
}
 */
/*
fun main(){
    for(x in 1..20){
        println(x)
    }
}
 */
/*
fun main(){
    for(x in 1..20 step 2){
        println(x)
    }
}
 */
/*
fun main(){
    for(x in 20 downTo -10){
        println(x)
    }
}
 */
/*
fun main(){
    for(x in 20 downTo -10 step 2){
        println(x)
    }
}

fun main(){
    var x = "hola mundo"
    print(x.capitalize())
}

fun main(){
    fun doble(num:Int):Int{
        var n = num * 2
        return n
    }
    println(doble(10))
}

fun main(){
    //Funciones de ex´resion simple
    fun doble(num:Int) = num * 2

    println(doble(10))
}

//Funciones genericas
fun main(){
    fun<T> doble(num:T):Int{
            return 1
    }
    println(doble("Hola"))
    println(doble(1))
    println(doble(true))
    println(doble(1.22525))
}

fun main(){
    fun String.quitarEspacio(): String{
        var regex = Regex("\\s+")
        return regex.replace(this," ")
    }
    var x = "    hola      mundo      "
    println(x.quitarEspacio())
}

fun main(){
    fun saluda(nombre: String, mes:Int, dia: Int, año: Int){
        println(nombre+mes+dia+año)
    }
    saluda(nombre = "hernan",mes = 10,dia = 15, año = 2019)
}

fun main(){
    fun saludar(vararg nombres:String){
        for (nombre in nombres) {
            println(nombre)
        }
    }
    saludar("hernan", "maurcio")
}

fun main(){
    fun saludar(nombre:String, apellido:String="null"){
            println(nombre+apellido)
    }
    saludar("hernan", "pinos")
    saludar("hernan")
}

//Operadores
fun main(){
    var x = 2 + 2
    println(x)
    var x1 = 2 - 2
    println(x1)
    var x2 = 2 * 2
    println(x2)
    var x3 = 2 / 2
    println(x3)
    var x4 = 1..10
    println(5 in x4)
}

 */

fun main(){
    class X(){
        operator fun invoke(n:Int):Int = n+1
    }
    println(X()(20))
}