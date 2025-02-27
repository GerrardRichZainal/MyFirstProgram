import java.util.Random;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        // Inisialisasi Scanner
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("\u001B[2J\u001B[H");  

        // Menampilkan pesan awal (Hello)
        System.out.println("\u001B[35m" + "|========================|" + "\u001B[0m");
        System.out.println("\u001B[44m" + "\u001B[37m" + "       Hello World!      " + "\u001B[0m");
        System.out.println("\u001B[35m" + "|========================|" + "\u001B[0m");

        System.out.print("\u001B[37m" + "Masukkan nama " + "\u001B[36m" + "Anda: " + "\u001B[0m");
        String name = scanner.nextLine();

        // Menampilkan Welcome 
        System.out.println("\u001B[35m" + "=======================================" + "\u001B[0m");
        System.out.println("\u001B[33m" + "Hello, " + "\u001B[37m" + name + "!" + "\u001B[33m" + " Selamat datang!" + "\u001B[0m");
        System.out.println("\u001B[35m" + "=======================================" + "\u001B[0m");

        // Daftar fun fact tentang Java
        String[] javaFacts = {
            "Java awalnya bernama 'Oak' karena terinspirasi dari pohon di luar kantor pembuatnya.",
            "Nama 'Java' berasal dari kopi Jawa.",
            "Logo Java berupa cangkir kopi.",
            "Minecraft awalnya dibuat menggunakan Java.",
            "Salah satu prinsip utama Java adalah 'Write Once, Run Anywhere' (WORA).",
            "Java Virtual Machine (JVM) memungkinkan Java berjalan di berbagai OS.",
            "Lebih dari 3 miliar perangkat menjalankan Java di seluruh dunia.",
            "Java masih menjadi bahasa utama dalam pengembangan aplikasi Android.",
            "NASA menggunakan Java dalam berbagai proyek luar angkasa.",
            "Banyak sistem perbankan dan perusahaan besar masih mengandalkan Java.",
            "Versi pertama Java dirilis oleh Sun Microsystems pada tahun 1995.",
            "Java memiliki maskot bernama 'Duke'.",
            "Google awalnya menggunakan Java untuk mengembangkan sistem awal Android.",
            "Java digunakan dalam sistem tiket transportasi.",
            "Framework backend populer seperti Spring dibuat dengan Java.",
            "Apache Hadoop, sistem big data processing, dibuat menggunakan Java.",
            "Java memiliki Garbage Collector otomatis.",
            "Netflix, Amazon, dan eBay menggunakan Java.",
            "Java memiliki lebih dari 20 juta pengembang aktif di seluruh dunia.",
            "Jaringan ATM di seluruh dunia banyak yang masih berjalan dengan Java.",
            "Perusahaan besar seperti Twitter, LinkedIn, dan Airbnb menggunakan Java.",
            "Java mendukung multithreading.",
            "Terdapat lebih dari 600+ framework dan library berbasis Java.",
            "Java memiliki fitur keamanan yang kuat.",
            "Java selalu diperbarui dengan fitur baru setiap enam bulan."
        };

        String[] colors = {
            "\u001B[32m", // Hijau
            "\u001B[33m", // Kuning
            "\u001B[34m", // Biru
            "\u001B[36m" // Cyan
           
        };

        boolean lanjut = true;
        while (lanjut) {
            int randomIndex = random.nextInt(javaFacts.length);
            int colorIndex = random.nextInt(colors.length);
            String randomColor = colors[colorIndex];

            System.out.print("\u001B[45m" + "\u001B[37m" + "Fun Fact tentang Java:" + "\u001B[0m");
            System.out.println(randomColor + javaFacts[randomIndex] + "\u001B[0m");

            // Menampilkan versi Java yang digunakan
            String javaVersion = System.getProperty("java.version");
            System.out.println("\u001B[37m" + "\u001B[43m" + "Anda sedang menggunakan Java versi:" + "\u001B[0m" + "\u001B[31m" + javaVersion + "\u001B[0m");

            // Tanya apakah pengguna ingin fun fact lagi
            System.out.println("\u001B[35m" + "=======================================" + "\u001B[0m");
            System.out.print("Ingin fun fact lagi?" + "\u001B[34m"+"(ya/tidak): " + "\u001B[0m");
            String jawaban = scanner.nextLine().trim().toLowerCase();
            
            if (!jawaban.equals("ya")) {
                lanjut = false;
            }
        }

        // Ucapan terima kasih sebelum keluar
        System.out.println("\\033[38;5;208m" + "Terima kasih, "+"\u001B[34m"+ name + " telah menggunakan! Sampai jumpa!" + "\u001B[0m");
        System.out.println(" __         __");
        System.out.println("/  \\.-\"\"\"-./  \\");
        System.out.println("\\    -   -    /");
        System.out.println(" |   o   o   |");
        System.out.println(" \\  .-'''-.  /");
        System.out.println("  '-\\__Y__/-'");
        System.out.println("     `---`  ");

        // Menutup Scanner
        scanner.close();
    }
}
