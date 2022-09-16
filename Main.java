package kadai02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //適当な日付を作成
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate oneMonthAgo = today.minusMonths(1);

        //Memberクラスのインスタンス化、およびリストへの格納
        List<Member> memberList = new ArrayList<Member>();
        memberList.add(new Member("masaki", 37, today));
        memberList.add(new Member("hiroko", 62, yesterday));
        memberList.add(new Member("akito", 21, oneMonthAgo));

        //処理1 会員一蘭の表示　for文
        //追記：処理４との比較。ここでは学習のため、わざと、!memberList.get(i).isWithdrawal()を使用
        System.out.println("会員一覧");
        for (int i = 0; i < memberList.size(); i++) {
            if (!memberList.get(i).isWithdrawal()) {
                memberList.get(i).showProfile();
            }
        }

        //処理2 会員の中で40歳以上の方を表示 拡張for文、if文
        System.out.println("40歳以上方のみを表示");
        for (Member member : memberList) {
            if (member.getAge() >= 40) {
                member.showProfile();
            }
        }

        //処理3 会員の退会処理　拡張for文、if文
        for (Member member : memberList) {
            if (member.getName().equals("akito")) {
                member.setWithdrawal(true);
                member.setWithdrawalDate(today);
                System.out.println(member.getName() + "の退会処理を実行しました。");
                System.out.println("退会日:" + member.getWithdrawalDate());
                member.showProfile();
            }
        }

        //処理4 再度会員一覧の表示　退会した方は非表示
        //メソッド変更：if分の条件に、新しく用意したisActive()メソッドを使用
        System.out.println("会員一覧");
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).isActive()) {
                memberList.get(i).showProfile();
            }
        }

    }
}
