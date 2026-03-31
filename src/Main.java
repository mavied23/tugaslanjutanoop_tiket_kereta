public class Main {
  public static void main(String[] args) {
    Tiket tiketSaya = new TiketEksekutif("Reza", "EK-01", 600000);
    System.out.println("--- INFORMASI TIKET KERETA API ---");
    System.out.println("Nama Penumpang: "+tiketSaya.getNama());

    System.out.println("Total Harga : Rp. "+tiketSaya.hitungTotalHarga());

    if (tiketSaya instanceof TiketEksekutif) {
      TiketEksekutif eksekutif = (TiketEksekutif) tiketSaya;
      eksekutif.servisMakan();
      eksekutif.bagasiEkstra();
    }
    System.out.println("===================================");
  }
} 