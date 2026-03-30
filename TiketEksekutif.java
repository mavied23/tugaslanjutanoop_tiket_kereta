public class TiketEksekutif extends Tiket implements LayananTambahan {

  public TiketEksekutif(String nama, String kursi, double harga) {
    super(nama, kursi, harga);
  }   

  @Override
  public double hitungTotalHarga() {
    double biayaFasilitas = 500000;
    return this.hargaDasar + biayaFasilitas;
  }

  @Override
  public void servisMakan() {
    System.out.println("Layanan: Mendapatkan paket nasi box dan air mineral.");
  }

  @Override
  public void bagasiEkstra() {
    System.out.println("Layanan: Mendapatkan kuota bagasi ekstra hingga 20kg.");
  }
}
