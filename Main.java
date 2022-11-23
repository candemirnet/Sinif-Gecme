import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double mat, fizik, kimya, turkce, muzik, ortalama;
        Scanner imp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = imp.nextDouble();
        if(mat<0 || mat>100){
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = imp.nextDouble();
        if(fizik<0 || fizik>100){
            fizik = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = imp.nextDouble();
        if(kimya<0 || kimya>100){
            kimya = 0;
        }

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = imp.nextDouble();
        if(turkce<0 || turkce>100){
            turkce = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = imp.nextDouble();
        if(muzik<0 || muzik>100){
            muzik = 0;
        }
        ortalama = (mat + fizik + kimya + turkce + muzik)/5;

        if(ortalama <55){
            System.out.println(ortalama + " Ortalama ile Kaldınız!");

        }else{
            System.out.println("Tebrikler Sınıfı " + ortalama + " Ortalama ile geçtiniz");
        }
    }
}