fun main(){
    val hasil = 70

    if(hasil>80){
        println("selamat")
    }
    else{
        println("coba lagi nanti")
    }

    val nama="Efendi Sonia"
        if(nama == "Efendi Sonia"){
        println("Anda adalah efendi")
    }else{
            println("Anda bukan efendi")
        }

    //pengkondisian if else untuk mengecek grade nilai
    val nilai=90
    if(nilai>=81 ){  //jika nilai 72 sampai 81 maka grade A
        println("A")
    }
     else if(nilai>=71 ){  //jika nilai 60 sampai 71 maka
        println("B")
    }
    else{
        println("coba lagi")
    }


    val bahasa="kotlin"
    when (bahasa){
        "kotlin"-> println("Amazing")
        "java"-> println("Baik")
        "ada"-> println("Cukup")
        else-> println("qwerty")
    }
}