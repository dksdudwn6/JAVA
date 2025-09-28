import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phone;

    public Student(int studentId, String name, String major, long phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }

    public String getPhonePretty() {
        String raw = Long.toString(phone);
        if (raw.length() == 10) raw = "0" + raw;
        if (!raw.startsWith("010")) raw = "010" + raw.substring(raw.length() - 8);
        String mid = raw.substring(3, 7);
        String tail = raw.substring(7, 11);
        return "010-" + mid + "-" + tail;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        String[] order = {"첫번째", "두번째", "세번째"};
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.printf(
                    "%s 학생: %d %s %s %s%n",
                    order[i],
                    s.getStudentId(),
                    s.getName(),
                    s.getMajor(),
                    s.getPhonePretty()
            );
        }
        sc.close();
    }
}
