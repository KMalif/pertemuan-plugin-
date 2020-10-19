public class array {
    public static void main (String[]args){
        //tipe data [] nama = {komponen data}
        //indeks   =  0,1,2,3,4,5
        //            | | | | | |
        int[] umur = {1,2,3,4,5,6};

        for (int i = 0; i < umur.length;i++){
            System.out.println("index ke : "+ i + " adalah : " + umur[i]);
        }
    }
}
