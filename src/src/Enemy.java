import java.util.Scanner;

public class Enemy {
    int hp;
    int speed;
    private  You u;
    private  Enemy n ;
    private Shield sh  ;
    private Sword sw ;

    public Enemy() {
        this.hp = hp;
        hp = 100;
        decreaseHP();
        decreaseAtk();
        isLevelUp();
        You u = new You();
        Enemy n = new Enemy();
        Shield sh = new Shield();
        Sword sw = new Sword();
    }
    private void decreaseHP(){

        System.out.println("Enemy HP : " + (n.hp - sw.atk));


    }
    private  void decreaseAtk(){
        Scanner d = new Scanner(System.in);
        System.out.print("Press 2 to equip the shield.");
        int def = d.nextInt();
        System.out.println();
    }

    private void isLevelUp(){
        if(u.hp>=(u.maxHp+u.maxHp*0.19)){
            n.hp = n.hp+((u.maxHp*2)/10);
            sh.def = sh.def+((sh.def*12)/100);
            sw.atk = sw.atk+((sw.atk*15)/100);
        }
    }
    private boolean isEquip(boolean swordEquip, boolean shieldEquip) {
        if (shieldEquip&&swordEquip) return speed == 80;
        else if(shieldEquip) return speed == 90;
        else if(swordEquip) return speed == 90;
        else return speed == 100;

    }}