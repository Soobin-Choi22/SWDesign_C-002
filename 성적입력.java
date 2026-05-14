package inha;
import java.util.ArrayList;

public class 성적입력 {
    public String 학점조회실행() {
        교수 prof = new 교수();
        
        // 반드시 교수id를 체크한다.
        if (!prof.교수체크("inha")) {
            return "접근 실패: 교수 인증이 필요합니다.";
        }

        // 데이터 생성 및 add
        ArrayList<성적> item = new ArrayList<성적>();
        item.add(new 성적("s001", 95, 88, 92)); // 자바, DB, 보안
        item.add(new 성적("s002", 82, 75, 80));
        item.add(new 성적("s003", 70, 60, 75));

        return item.toString();
    }
}