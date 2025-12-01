import java.io.*;
import java.util.*;

public class Homework9 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("db.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                map.put(arr[0].trim(), arr[1].trim());
            }
            br.close();
        } catch (IOException e) {
            System.out.println("db.txt 파일 읽기 오류");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();

            if (!map.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String inputPw = sc.nextLine().trim();

            if (map.get(inputId).equals(inputPw)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            }
        }

        sc.close();
    }
}

