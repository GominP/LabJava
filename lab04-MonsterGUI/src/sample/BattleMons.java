//import java.util.Scanner;
//
//public class BattleMons {
//
//
//    public static void main(String[] args) {
//        System.out.println("!!!!   Monster Fight  !!!!");
//        System.out.println("Please input monster1 name hp atk def :");
//        Scanner inputMon = new Scanner(System.in);
//
//        String monName = inputMon.next();
//        int hp = inputMon.nextInt();
//        int atk = inputMon.nextInt();
//        int def = inputMon.nextInt();
//        Monster m1 = new Monster(monName, hp, atk, def);
//
//        System.out.println("Please input monster2 name hp atk def :");
//        monName = inputMon.next();
//        hp = inputMon.nextInt();
//        atk = inputMon.nextInt();
//        def = inputMon.nextInt();
//        Monster m2 = new Monster(monName, hp, atk, def);
//
//        boolean checkHealm1 = false;
//        boolean checkHealm2 = false;
//        int round = 1;
//
//        for (int i = 1;;i++ ){
//
//            System.out.println("Round : " + i);
//            i++;
////          Monster1
//            if (checkHealm1 == false) {
//                System.out.println(">>> Monster 1 turn <<<");
//                System.out.println("Please enter skill A=attack H=heal");
//                Scanner action = new Scanner(System.in);
//                char actionMon = action.next().charAt(0);
//
//                if (actionMon == 'A' || actionMon == 'a') {
//                    m1.Attack(m2);
//                }
//                if (actionMon == 'H' || actionMon == 'h') {
//                    System.out.println("Please enter recovery hp : ");
//                    int monhp = action.nextInt();
//                    m1.HealMon(monhp);
//                    checkHealm1 = true;
//                }
//                System.out.println(m1.toString());
//                System.out.println(m2.toString());
//
//            }
//            else {
//                System.out.println(">>> Monster 1 turn <<<");
//                System.out.println("Monster 1 Can't use skill \n");
//                checkHealm1 = false;
//            }
//
//
////            Monster2
//            if (checkHealm2 == false) {
//                System.out.println(">>> Monster 2 turn <<<");
//                System.out.println("Please enter skill A=attack H=heal");
//                Scanner action2 = new Scanner(System.in);
//                char actionMon = action2.next().charAt(0);
//
//                if (actionMon == 'A' || actionMon == 'a') {
//                    m2.Attack(m1);
//                }
//                if (actionMon == 'H' || actionMon == 'h') {
//                    System.out.println("Please enter recovery hp : ");
//                    int monhp = action2.nextInt();
//                    m2.HealMon(monhp);
//                    checkHealm2 = true;
//                }
//                System.out.println(m1.toString());
//                System.out.println(m2.toString());
//            }
//
//            else {
//                System.out.println(">>> Monster 2 turn <<<");
//                System.out.println("Monster 2 Can't use skill \n");
//                checkHealm2 = false;
//            }
//
//            if (m1.getHp() == 0 || m2.getHp() == 0){
//                break;
//
//            }
//        }
//        System.out.println("The Winner Is ..........");
//        if (m1.getHp() > m2.getHp()){
//            System.out.println(m1.toString());
//        }
//        else {
//            System.out.println(m2.toString());
//        }
//    }
//}
