

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKSAL
 */
public class Main {
    
    public static void main(String[] args){
        
        
//        1. membuat 5 User
        User willy = new User("Willy","will","123");
        User panjaitan= new User("Panjaitan","panjaitann","342");
        User aldo = new User("Aldo","Dooo","153");
        User fazral = new User("Fazral","Fazz","212");
        User hans = new User("Hans","Hanzz","756");
        
        User.usernameList.add("will");
        User.usernameList.add("panjaitann");
        User.usernameList.add("Doo");
        User.usernameList.add("Fazz");
        User.usernameList.add("hanzz");
        
        User.userList.add(willy);
        User.userList.add(panjaitan);
        User.userList.add(aldo);
        User.userList.add(fazral);
        User.userList.add(hans);
        
//        2. Ubah 2 username yang ada
        willy.setUserName("will123");
        panjaitan.setUserName("panjaitann");
        System.out.println();

////        3. Mengganti 1 username dengan username yang sudah ada
        fazral.setUserName("fazz");
        System.out.println();
        
////        4. Mengganti 2 username yang lain dengan username yang sudah ada
        hans.setUserName("hanzz");
        aldo.setUserName("Doo");
        System.out.println();
//        
////        5. Cetak seluruh activity yang ada
        Activity.printAllActivities();
        System.out.println();

////        6. Cetak seluruh activity pada hari ini
        Activity.printTodaysActivities();
        System.out.println();
        
////        7. Login 2 kali dengan user yang berbeda
        panjaitan.logIn("Panjaitann", "342");
        hans.logIn("hanzz", "756");
        System.out.println();
//        
////        8. Gagal login 2 kali dengan user yang berbeda
        willy.logIn("will", "123");
        fazral.logIn("fazz", "212");
        System.out.println();
//        
////        9. Cek seluruh activity oleh 2 user tertentu
        Activity.printUserActivities("panjaitann");
        Activity.printUserActivities("will");
        System.out.println();
//        
////        10. Cetak 10 activity terakhir
        willy.setUserName("1");
        willy.setUserName("2");
        willy.setUserName("3");
        willy.setUserName("4");
        willy.setUserName("5");
        willy.setUserName("6");
        willy.setUserName("7");
        willy.setUserName("8");
        willy.setUserName("9");
        willy.setUserName("10");
        
        Activity.printLastTenActivities();
        
        
    }
    
}
