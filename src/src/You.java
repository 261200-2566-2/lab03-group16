import java.util.Scanner;

public class You {
    int hp;
    int maxHp;
    int speed;
    private You u;
    private Enemy n;
    private Shield sh;
    private Sword sw;



    public You() {
        this.hp = hp;
        hp = 100;
        this.maxHp = maxHp;
        maxHp = 100;
        this.speed = speed;
        You u = new You();
        Enemy n = new Enemy();
        Shield sh = new Shield();
        Sword sw = new Sword();
        decreaseHP();
        decreaseAtk();
        isWin();
        isLevelUp();
        isEquip();
    }

    private void decreaseHP() {
        Scanner f = new Scanner(System.in);
        System.out.print("Press 1 when you ready.");
        int fight = f.nextInt();
        if (fight == 1) {
            System.out.println("Your HP : " + (u.hp - sw.atk));
        }


    }

    private void decreaseAtk() {
        Scanner d = new Scanner(System.in);
        System.out.print("Press 2 to equip the shield.");
        int def = d.nextInt();
        System.out.println();
    }

    private void isWin() {
        if (n.hp == 0) {
            System.out.println("***YOU***WIN***");
            u.hp = u.hp + 5;
        } else System.out.println("DEFEAT... TRY AGAIN?");
    }

    private void isLevelUp() {
        if (u.hp >= (u.maxHp + u.maxHp * 0.19)) {
            u.maxHp = u.maxHp + ((u.maxHp * 2) / 10);
            sh.def = sh.def + ((sh.def * 12) / 100);
            sw.atk = sw.atk + ((sw.atk * 15) / 100);
        }
    }

    private boolean isEquip(boolean swordEquip, boolean shieldEquip) {
        if (shieldEquip&&swordEquip) return speed == 80;
        else if(shieldEquip) return speed == 90;
        else if(swordEquip) return speed == 90;
        else return speed == 100;

    }
}