package flashlaundry;

import java.util.Scanner;

public class DriverFlashLaundry {

    //init var
    static Pengguna user;
    static Transaksi transaksi;
    static Jasa jasaku;
    static String usernameInput,passwordInput;
    static String nama, noHP, alamat, email, kataSandi;
    static String namaJasa, deskripsiJasa;
    static int harga;
    static int berat, ongkir;
    static String desk;
    static Scanner input = new Scanner(System.in);
    static int idTransaksi;
        
    public static void main(String[] args) {
        createMenu();
    }
    
    static void createMenu(){
        int noPilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("|        Selamat datang di Flash Laundry      |");
        System.out.println("-----------------------------------------------");
        System.out.println("|                     Login                   |");
        System.out.println("-----------------------------------------------");
        System.out.println("1.Form Login");
        System.out.println("2.Registrasi User");
        System.out.println("0.Keluar");
        System.out.println("-----------------------------------------------");
        noPilihan = 1;
        while(noPilihan != 0){
            System.out.print  ("Masukan Pilihan angka (1/2/0) : ");
            noPilihan = input.nextInt();
            if(noPilihan == 1){
                cls();
                loginUser();
                createMenuAfterLogin();
            }else if(noPilihan == 2){
                cls();
                registerUser();
            }else if(noPilihan == 0){
                System.out.println("-----------------------------------------------");
                System.out.println("              Anda Keluar Aplikasi             ");
                System.out.println("-----------------------------------------------");
            }else{
                System.out.println("Nomor Input anda salah");
            }
        }
    }
    
    static void createMenuAfterLogin(){
        int noPilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("|        Selamat datang di Flash Laundry      |");
        System.out.println("-----------------------------------------------");
        System.out.println("|                     Login                   |");
        System.out.println("-----------------------------------------------");
        System.out.println("1.Input Jasa");
        System.out.println("2.Input Transaksi");
        System.out.println("3.Profil Pengguna");
        System.out.println("0.Keluar");
        System.out.println("-----------------------------------------------");
        noPilihan = 1;
        while(noPilihan != 0){
            System.out.print  ("Masukan Pilihan angka (1/2/3/4/0) : ");
            noPilihan = input.nextInt();
            if(noPilihan == 1){
                cls();
                inputJasa();
                createMenuAfterLogin();
            }else if(noPilihan == 2){
                cls();
                inputTransaksi();
                createMenuAfterLogin();
            }else if(noPilihan == 3){
                cls();
                showProfil();
                createMenuAfterLogin();
            }else if(noPilihan == 0){
                System.out.println("-----------------------------------------------");
                System.out.println("              Anda Keluar Aplikasi             ");
                System.out.println("-----------------------------------------------");
            }else{
                System.out.println("Nomor Input anda salah");
            }
        }
    }
    
    public static void cls(){
	try{	
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E){
            System.out.println(E);
        }
    }
    
    static void registerUser(){
        System.out.println("-----------------------------------------------");
        System.out.println("|               Registrasi                    |");
        System.out.println("-----------------------------------------------");
        System.out.print("Username  : ");
        nama = input.nextLine();
        System.out.print("No HP     : ");
        noHP = input.nextLine();
        System.out.print("Alamat    : ");
        alamat = input.nextLine();
        System.out.print("Email     : ");
        email = input.nextLine();
        System.out.print("Password  : ");
        kataSandi = input.nextLine();
        user = new Pengguna(1, nama, noHP, alamat, email, kataSandi);
        
        System.out.println("-----------------------------------------------");
        System.out.println("|            Berhasil Didaftarkan             |");
        System.out.println("-----------------------------------------------");
        System.out.println("Selamat datang " + user.getUsername() + "\n");
        createMenu();
    }
    
    static void loginUser(){
        System.out.println("-----------------------------------------------");
        System.out.println("|            Login Sebagai Pembeli            |");
        System.out.println("-----------------------------------------------");
        System.out.print("Username : ");
        usernameInput = input.nextLine();
        System.out.print("Password : ");
        passwordInput = input.nextLine();
        if(usernameInput.contains(user.getUsername()) && passwordInput.contains(user.getKataSandi())){
            System.out.println("-----------------------------------------------");
            System.out.println("|                Berhasil Login                |");
            System.out.println("-----------------------------------------------");
            System.out.println("");
        }else{
            System.out.println("-----------------------------------------------");
            System.out.println("|        Username atau Password salah         |");
            System.out.println("|              Silakan Diulangi               |");
            System.out.println("-----------------------------------------------");
            System.out.println("");
            loginUser();
        }
    }
    
    static void inputJasa(){
        System.out.println("-----------------------------------------------");
        System.out.println("|               Input Jasa                    |");
        System.out.println("-----------------------------------------------");
        System.out.print("Nama Jasa      : ");
        namaJasa = input.nextLine();
        System.out.print("Deskrpsi Jasa  : ");
        deskripsiJasa = input.nextLine();
        System.out.print("Harga          : ");
        harga = input.nextInt();
        jasaku = new Jasa(1, 1, namaJasa, deskripsiJasa, harga, 0);
        System.out.println("Jasa: " + jasaku.getNamaJasa() + " berhasil dibuat.");
    }
    
    static void inputTransaksi(){
        System.out.println("-----------------------------------------------");
        System.out.println("|             Input Transaksi                 |");
        System.out.println("-----------------------------------------------");
        System.out.print("Berat Cucian : ");
        berat = input.nextInt();
        System.out.print("Ongkir : ");
        ongkir = input.nextInt();
        System.out.print("Deskripsi    : ");
        desk = input.nextLine();
        int bayar = (2000*berat)+ongkir;
        transaksi = new Transaksi(1, 1, 1, desk, berat, ongkir, bayar, bayar);           
    }
    
    static void showProfil(){
        System.out.println("Username   : " + user.getUsername());
        System.out.println("No HP      : " + user.getNoHP());
        System.out.println("Alamat     : " + user.getAlamatPengguna());
        System.out.println("Email      : " + user.getEmail() + "\n");
    }
}