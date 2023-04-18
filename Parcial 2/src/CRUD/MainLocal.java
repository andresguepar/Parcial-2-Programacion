package CRUD;

import CRUD.Modelo.Local;
import CRUD.Repository.Imp;
import CRUD.Repository.Int;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainLocal {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        String opt = "1";
        Int repo = new Imp();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Menu =^._.^=  \n 1. Add  \n 2. List \n 3. Edit " +
                    "\n 4. Delete  \n 5. Exit \n =>");
            opt = sc.next();
            switch (opt){
                case "1":
                    System.out.println("Local Number: ");
                    int ln = sc.nextInt();
                    System.out.println("Name:  ");
                    String nam = sc.next();
                    System.out.println("Category:  ");
                    String cat = sc.next();
                    System.out.println("Schedule:   ");
                    String ph = sc.next();
                    repo.save(new Local(ln,nam,cat,ph));
                    break;

                case "2": {
                    List<Local> locals = repo.findAll();
                    locals.forEach(System.out::println);
                    break;
                }

                case "3": {
                    System.out.println("----Edit----");
                    System.out.println("Type Local Number: ");
                    Integer lpp = sc.nextInt();
                    System.out.println("Type Name:  ");
                    nam = sc.next();
                    System.out.println("Type Category:  ");
                    cat = sc.next();
                    System.out.println("Schedule:   ");
                    ph = sc.next();
                    Local upd = new Local(lpp,nam,cat,ph);
                    repo.update(upd);
                    break;

                }

                case "4": {
                    System.out.println("===== Delete ======");
                    System.out.print("Type Locan Number: ");
                    int lp = sc.nextInt();
                    repo.delete(repo.findByNum(lp));
                    repo.findAll().forEach(System.out::println);
                    break;
                }

                case "5": {
                    opt = "5";
                    break;
                }

            }
        }while (opt != "5");
    }
}
