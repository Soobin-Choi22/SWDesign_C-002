package inha;

public class 성적 {
    public String 학생id;
    public int 자바, DB, 보안, 총점;
    public double 평균;
    public String 학점;

    public 성적(String 학생id, int 자바, int DB, int 보안) {
        this.학생id = 학생id;
        this.자바 = 자바;
        this.DB = DB;
        this.보안 = 보안;
        
        // 총점과 평균을 계산한다.
        this.총점 = 자바 + DB + 보안;
        this.평균 = 총점 / 3.0;
        
        // 학점을 부여한다(A: 90이상, B: 80이상, C: 80미만)
        if (this.평균 >= 90) this.학점 = "A";
        else if (this.평균 >= 80) this.학점 = "B";
        else this.학점 = "C";
    }

    @Override
    public String toString() {
        return String.format("[학생ID: %s | 총점: %d | 평균: %.2f | 학점: %s]", 
                             학생id, 총점, 평균, 학점);
    }
}