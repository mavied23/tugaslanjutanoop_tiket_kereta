public abstract class Tiket {

  private String namaPenumpang;
  private String nomorKursi;
  protected double hargaDasar;

  public Tiket(String nama, String kursi, double harga) {
    this.namaPenumpang = nama;
    this.nomorKursi = kursi;
    this.hargaDasar = harga;
  }

  public abstract double hitungTotalHarga();

  public String getNama() {
    return namaPenumpang;
  }
}