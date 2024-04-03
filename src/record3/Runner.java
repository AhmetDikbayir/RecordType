package record3;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        StudentDTO student1=new StudentDTO("Victor","Hugo","123456");
        StudentDTO student2=new StudentDTO("Lev","Tolstoy","123789");

        StudentRepo repo=new StudentRepo();

        repo.save(student1);
        repo.save(student2);

        //tüm kayıtları listeleyelim
        System.out.println("Tüm Öğrenciler : ");
        repo.getAll();


        System.out.println("----------------------------------------------------");


        //listedeki 1. indexteki öğrencinin numarası yanlış girilmiş
        //değiştirmek istiyoruz.

        List<StudentDTO> list=repo.students;


        //çözüm: yeni bir tane student objesi oluşturalım
        StudentDTO newStudent2=new StudentDTO(list.get(1).firstname(),list.get(1).lastname(),"123457");

        //eski student2 yi listeden silelim
        repo.deleteStudent(student2);

        //yeni student2 kaydedelim
        repo.save(newStudent2);

        //listenin son halini görelim
        System.out.println("Güncel Öğrenci Listesi: ");
        repo.getAll();
    }
}