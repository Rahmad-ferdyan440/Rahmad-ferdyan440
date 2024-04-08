public class transit {
    
// modifikasi kode --> method baru dengan nama FindBuku
int posisi = Buku23.findBuku(dataBuku, cari);

if (posisi != -1) {
    dataBuku[posisi].tampilDataBuku();
} else {
    System.out.println("Kode tidak ditemukan.");
}
System.out.println("_________________________________");

    // modifikasi kode --> method baru dengan nama FindBuku
    public static int findBuku(Buku23[] dataBuku, int cari) {
        int posisi = -1;
        for (int j = 0; j < dataBuku.length; j++) {
            if (dataBuku[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }


}
