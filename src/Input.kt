object Input {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Penjumlahan dua bilangan")

        print("Masukan bilangan pertama : ")
        val num1 = readLine()?.toInt() ?:0
        print("Masukan bilangan kedua : ")
        val num2 = readLine()?.toInt() ?:0

        println("Hasil penjumlahan bilangan $num1 dan $num2 adalah = ${num1+num2}")
    }
}
