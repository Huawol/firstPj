package calculatorLv2;

import java.util.ArrayList;
import java.util.List;

public class ResultManagement extends Calculator {

    public List<Integer> saveList = new ArrayList();

    // 결과값 저장 메소드
    public void saveResult(int num) {
        saveList.add(num);
        // 저장 메소드에서 저장하는 기능만 넣어야함
        // 전에 출력문도 같이 넣었다보니 오류가 발생했음
    }

    // 결과값 삭제 메소드  0을 굳이 받을 필요는 없다.
    private void removeResult() {
        try {
            saveList.remove(0);
            System.out.println("삭제 되었습니다. 남은 숫자 : " + saveList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("더 이상 삭제할게 없습니다.");

        }
    }

    // getter - 안전하게 접근 // 삭제버튼 접근 제한,
    public void getRemoveResult() {
        removeResult();
    }

}
