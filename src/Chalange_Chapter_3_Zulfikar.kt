open class Rules{
    open fun pemenang(){
        print("Pemenangnya adalah: ")
    }
}

class Permainan(val pemain1:String, val pemain2:String): Rules(){
    val suit1 = "gunting"
    val suit2 = "batu"
    val suit3 = "kertas"
    override fun pemenang() {
        when(pemain1){
                suit1 -> when(pemain2){
                    suit1 -> println("Seri")
                    suit2 -> println("Pemain 2 !!")
                    suit3 -> println("Pemain 1 !!")
                }
                suit2 -> when(pemain2){
                    suit1 -> println("Pemain 1 !!")
                    suit2 -> println("Seri")
                    suit3 -> println("Pemain 2 !!")
                }
                suit3 -> when(pemain2){
                    suit1 -> println("Pemain 2 !!")
                    suit2 -> println("Pemain 1 !!")
                    suit3 -> println("Seri")
                }
            }
    }
}

fun main() {
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")

    println("Masukkan pemain 1: ")
    val pemain1 = readLine()!!.lowercase()
    println("Masukkan pemain 2: ")
    val pemain2 = readLine()!!.lowercase()

    val permainan = Permainan(pemain1,pemain2)
    val rules = Rules()
    rules.pemenang()
    permainan.pemenang()
}
