fun loopingAngka(){
    for(angka in 1..10){
        println("$angka")
    }
}

fun deretGanjilGenap(angka: Int){
  for (i in 1..angka){
      if(i%2 !=0){
          println("$i adalah ganjil")
      }
      else{
          println("$i adalah genap")
      }
  }
}

fun printPlugin(num: Int){
    for(i in 1..num){
        if(i%2 ==0 && i%5 ==0){
            println("plugin")
        }
        else if(i%2 == 0){
        println("plug")
        }
        else if(i%5 ==0){
        println("in")
        }

        else{
            println(i)
        }

    }
}

fun polaSegitigaSatu(angka:Int){
    for (i in 1..angka){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}


fun polaSegitigaDua(angka:Int){
    for (i in 1..angka) {
        for (j in 1..i - 1) {
            print(" ")
        }
        for (k in angka downTo i) {
            print("*")
        }
        println()
    }
}


fun pohonCemara(){
    for (i in 1..5){
        for (s in 1..5-i){
            print(" ")
        }
        for(j in 1..i+(i-1)){
            print("*")
        }
        println()
    }

    for (k in 1..3){
        for(l in 1..3){
            print(" ")
        }
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

fun main(){
//    loopingAngka()
//    deretGanjilGenap(10)
//    printPlugin(20)
//    polaSegitigaSatu(5)
//   polaSegitigaDua(4)
//    pohonCemara()
}