package kadai02;

import java.time.LocalDate;

public class Member {
    private String name;                    //会員名
    private int age;                        //年齢
    private LocalDate joinDate;             //入会日
    private boolean withdrawal;             //退会　退会の時にture
    private LocalDate withdrawalDate;       //退会日

    //コンストラクターにて、名前、年齢、入会日を初期設定。退会フラグはfalse、退会日はnullを代入
    public Member(String name, int age, LocalDate joinDate) {
        this.name = name;
        this.age = age;
        this.joinDate = joinDate;
        withdrawal = false;         //入会時はfalse
        withdrawalDate = null;      //入会時はnull
    }

    //会員の会員名、年齢、入会日を表示するメソッド
    public void showProfile() {
        System.out.println("会員名：" + getName());
        System.out.println("年齢　：" + getAge());
        System.out.println("入会日:" + getJoinDate());
        System.out.println();
    }

    //以下は全て、getter,setterを実装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(boolean withdrawal) {
        this.withdrawal = withdrawal;
    }

    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }
}
