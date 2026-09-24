fun main() {
    val diemTrungBinh: Double = 6.7

    val xepLoai: String = when (diemTrungBinh)
    {
        in 9.1..10.0 -> "Xuat sac"
        in 8.1..9.0 -> "Gioi"
        in 5.0..8.0 -> "Kha"
        in 3.5..4.9 -> "Trung Binh"
        else -> "Yeu"
    }

    println("Diem trung binh: $diemTrungBinh")
    println("Xep loai hoc luc: $xepLoai")
}