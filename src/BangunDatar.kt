object BangunDatar {
    fun luasPersegiPanjang(panjang:Int, lebar:Int){
        val nilaiMin = 0
        val nilaiMax = 100

        if (panjang <= nilaiMin || panjang >= nilaiMax){
            println("Panjang tidak boleh kurang dari 0 atau lebih dari 100")
            return
        }

        if (lebar <= nilaiMin || lebar >= nilaiMax){
            println("Lebar tidak boleh kurang dari 0 atau lebih dari 100")
            return
        }

        println("Luas persegi panjang dengan panjang $panjang cm dan lebar $lebar cm, adalah ${panjang*lebar} cm persegi")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Luas Persegi Panjang")
        println("====================")
        println("Masukan panjang persegi: ")
        val panjang = readLine()?.toInt() ?: 0
        println("Masukan lebar persegi: ")
        val lebar = readLine()?.toInt() ?: 0

        print(luasPersegiPanjang(panjang, lebar))
    }
}