package a0713;

import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<Board>();
        list.add(new board("제목1", "내용1"));
        list.add(new board("제목2", "내용2"));
        list.add(new board("제목3", "내용3"));
        return list;
    }
}
