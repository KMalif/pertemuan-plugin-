fun segitiga(angka:Int) {
    for (i in 1..angka) {
        for (j in 1..i - 1) {
            print(" ")
        }
        for (k in angka - 1 downTo i) {
            print("*")
        }
    println()
    }
}
fun pohon() {
    for (k in 1..3) {
        for (m in 1..3) {
            if (k==1 || k==3 || m==1 || m==3){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}
    fun main() {
//        segitiga(5)
        pohon()
    }

